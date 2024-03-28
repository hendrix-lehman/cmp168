import java.util.Scanner;

class TicTacToe2 implements BoardGameInterface {

  private char[][] ttt;
  private char currPlayer;

  public static final int NUM_ROWS = 3;
  public static final int NUM_COLS = 3;

  public TicTacToe2() {
    ttt = new char[NUM_ROWS][NUM_COLS];
    populateBoard();
    currPlayer = 'X';
  }

  @Override
  public void populateBoard() {
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        ttt[i][j] = ' ';
      }
    }
  }

  @Override
  public void displayBoard() {
    System.out.println("-------------");
    for (int i = 0; i < NUM_ROWS; i++) {
      System.out.print("| ");
      for (int j = 0; j < NUM_COLS; j++) {
        System.out.print(ttt[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  @Override
  public void clearBoard() {
    populateBoard();
  }

  @Override
  public void placeMarker(int row, int col) {
    if (row < 0 || row >= NUM_ROWS || col < 0 || col >= NUM_COLS) {
      System.out.println("Invalid row or column");
      return;
    }
    if (ttt[row][col] == ' ') {
      ttt[row][col] = currPlayer;
    } else {
      System.out.println("Position already taken");
    }
  }

  @Override
  public boolean isWinner() {
    // check rows
    for (int i = 0; i < NUM_ROWS; i++) {
      if (ttt[i][0] == currPlayer && ttt[i][1] == currPlayer && ttt[i][2] == currPlayer) {
        return true;
      }
    }
    // check columns
    for (int i = 0; i < NUM_COLS; i++) {
      if (ttt[0][i] == currPlayer && ttt[1][i] == currPlayer && ttt[2][i] == currPlayer) {
        return true;
      }
    }

    // check diagonals
    if (ttt[0][0] == currPlayer && ttt[1][1] == currPlayer && ttt[2][2] == currPlayer) {
      return true;
    }

    if (ttt[0][2] == currPlayer && ttt[1][1] == currPlayer && ttt[2][0] == currPlayer) {
      return true;
    }

    return false;
  }

  @Override
  public boolean isDraw() {
    // check if it's a draw
    return isFull() && !isWinner();
  }

  @Override
  public boolean isEmpty() {
    // check if the board is empty
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        if (ttt[i][j] != ' ') {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean isFull() {
    // check if the board is full
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        if (ttt[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void changeTurn() {

    if (currPlayer == 'X') {
      currPlayer = 'O';
    } else {
      currPlayer = 'X';
    }

  }

  // the game app main method
  public static void main(String[] args) {
    TicTacToe2 ttt = new TicTacToe2();
    ttt.displayBoard();

    // game loop
    Scanner scanner = new Scanner(System.in);
    while (!ttt.isWinner() && !ttt.isDraw()) {
      System.out.println("Player " + ttt.currPlayer + ", enter row and column: \n for example: 0,0");
      String input = scanner.nextLine();
      String[] values = input.split(",");
      int row = Integer.parseInt(values[0]);
      int col = Integer.parseInt(values[1]);
      ttt.placeMarker(row, col);
      ttt.displayBoard();
      ttt.changeTurn();
    }

  }
}
