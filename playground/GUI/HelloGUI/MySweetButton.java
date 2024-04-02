import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

class MySweetButton extends JButton {
  public MySweetButton(String label) {
    super(label);
    setBackground(Color.CYAN);
    addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked the button");
      }
    });
  }
}
