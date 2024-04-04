import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

class App {

  class MainContainer extends JPanel {
    private JTextField txtValue = new JTextField(20);

    public MainContainer() {
      super();
      JLabel lblConvert = new JLabel("Convert: ");
      JLabel lblResult = new JLabel();
      JButton btnCalculate = new JButton("Calculate");
      JComboBox<String> cbFrom = new JComboBox<>(new String[] { "", "Celsius", "Fahrenheit" });
      JLabel lblTo = new JLabel("to");
      btnCalculate.addActionListener(e -> {
        try {
          if (cbFrom.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a unit to convert from", "Error",
                JOptionPane.ERROR_MESSAGE);

            return;
          }

          if (txtValue.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value to convert", "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }

          // check if the value is a number
          if (!txtValue.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }

          double value = Double.parseDouble(txtValue.getText());
          if (cbFrom.getSelectedIndex() == 1) {
            double result = 1.8 * value + 32;
            lblResult.setText(result + " Fahrenheit");
            return;
          } else if (cbFrom.getSelectedIndex() == 2) {
            double result = (value - 32) / 1.8;
            lblResult.setText(result + " Celsius");
            return;
          }
        } catch (NumberFormatException ex) {
          lblResult.setText("Invalid value");
        }
      });
      add(lblConvert);
      add(txtValue);
      add(cbFrom);
      add(lblTo);
      add(lblResult);
      add(btnCalculate);
    }
  }

  public void display() {
    MainContainer mainContainer = new MainContainer();
    JFrame frame = new JFrame("App");
    frame.add(mainContainer);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {

    App app = new App();
    app.display();

  }
}
