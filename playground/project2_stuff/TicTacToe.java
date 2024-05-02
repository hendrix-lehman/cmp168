import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

class TicTacToe extends JPanel {

  JPanel board;
  char currentPlayer = 'X';
  int turn = 0;

  public TicTacToe() {
    createBoard();
  }

  private void resetBoard() {
    for (int i = 0; i < 9; i++) {
      ((JButton) board.getComponent(i)).setText("");
    }
    currentPlayer = 'X';
    turn = 0;
  }

  public void createBoard() {
    // Create a 3x3 grid of buttons
    board = new JPanel();
    board.setLayout(new GridLayout(3, 3));
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(100, 100));
        button.setFont(button.getFont().deriveFont(50.0f));
        button.addActionListener(e -> {
          System.out.println("Turn: " + turn);
          if (turn == 9) {
            int selection = JOptionPane.showConfirmDialog(null, "It's a tie!\nDo you want to play again?");
            if (selection == JOptionPane.YES_OPTION) {
              resetBoard();
            } else {
              System.exit(0);
            }
            return;
          }
          if (button.getText().equals("")) {
            button.setText(currentPlayer + "");
            if (checkWin()) {
              int selection = JOptionPane.showConfirmDialog(null, currentPlayer + " wins!\nDo you want to play again?");
              if (selection == JOptionPane.YES_OPTION) {
                resetBoard();
              } else {
                System.exit(0);
              }
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            turn++;
          }
        });
        board.add(button);
      }
    }
    add(board);
  }

  private boolean checkRowCol(String c1, String c2, String c3) {
    return (!c1.equals("") && c1.equals(c2) && c2.equals(c3));
  }

  private boolean checkWin() {
    // Check rows
    for (int i = 0; i < 3; i++) {
      if (checkRowCol(((JButton) board.getComponent(i * 3)).getText(),
          ((JButton) board.getComponent(i * 3 + 1)).getText(),
          ((JButton) board.getComponent(i * 3 + 2)).getText())) {
        return true;
      }
    }

    // Check columns
    for (int i = 0; i < 3; i++) {
      if (checkRowCol(((JButton) board.getComponent(i)).getText(), ((JButton) board.getComponent(i +
          3)).getText(),
          ((JButton) board.getComponent(i + 6)).getText())) {
        return true;
      }
    }

    // Check diagonals
    if (checkRowCol(((JButton) board.getComponent(0)).getText(),
        ((JButton) board.getComponent(4)).getText(),
        ((JButton) board.getComponent(8)).getText())) {
      return true;
    }
    if (checkRowCol(((JButton) board.getComponent(2)).getText(),
        ((JButton) board.getComponent(4)).getText(),
        ((JButton) board.getComponent(6)).getText())) {
      return true;
    }

    return false;
  }

  public void show() {
    JFrame frame = new JFrame("Tic Tac Toe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);
    frame.add(this, BorderLayout.CENTER);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.show();
  }
}
