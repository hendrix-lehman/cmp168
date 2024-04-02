import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Color;

class MyJFrame extends JFrame {

  public MyJFrame() {

    setSize(300, 200);
    setTitle("My GUI App");

    // add JComponents here

    // JPanel is a container that can hold other JComponents
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    panel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

    // JButton is going to be added to the panel
    // JButton button = new JButton("Click me!");
    MySweetButton button = new MySweetButton("Click me!");

    // JTextField is going to be added to the panel
    JTextField textField = new JTextField(20);
    textField.setText("Enter text here");

    // add JComponents to the panel
    panel.add(textField);
    panel.add(button);

    // add the panel to the JFrame
    add(panel);

    // end of JComponents
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

}
