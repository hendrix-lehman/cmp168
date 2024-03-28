import java.util.Scanner;

class TicTacToe {

  // The board
  private char[][] board;

  // The current player
  private char currentPlayer;

  // The winner
  private char winner;

  public TicTacToe() {
    createBoard();
    currentPlayer = 'X';
    winner = ' ';
  }

  // Print the board
  public void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < board.length; i++) {
      System.out.print("| ");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  // Create the board
  private void createBoard() {
    board = new char[3][3];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = ' ';
      }
    }
  }

  // Player makes a move
  public void play(int row, int col) {
    if (winner != ' ' || isBoardFull()) {
      return;
    }

    placeMark(row, col);
    // check if there is a winner
    winner = checkWinner();
    if (winner != ' ') {
      System.out.println("The winner is " + winner);
    }

    // update current player
    if (currentPlayer == 'X') {
      currentPlayer = 'O';
    } else {
      currentPlayer = 'X';
    }
  }

  // Check if there is a winner
  private char checkWinner() {
    // check rows
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
        return board[i][0];
      }
    }

    // check columns
    for (int i = 0; i < board.length; i++) {
      if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
        return board[0][i];
      }
    }

    // check diagonals
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
      return board[0][0];
    }

    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
      return board[0][2];
    }

    return ' ';
  }

  // Check if the board is full
  public boolean isBoardFull() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }

  // place a mark on the board
  private void placeMark(int row, int col) {
    if (row >= 0 && row < 3 && col >= 0 && col < 3) {
      if (board[row][col] == ' ') {
        board[row][col] = currentPlayer;
      }
    }
  }

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.printBoard();

    while (game.winner == ' ' && !game.isBoardFull()) {
      System.out.println("Enter the row and column to place your mark:\n For Example: 0,0 ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      String[] inputs = input.split(",");
      int row = Integer.parseInt(inputs[0]);
      int col = Integer.parseInt(inputs[1]);
      game.play(row, col);
      game.printBoard();
    }

  }
}
