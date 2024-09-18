import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 2));

    JLabel label1 = new JLabel("First Number:");
    JTextField textField1 = new JTextField();
    JLabel label2 = new JLabel("Second Number:");
    JTextField textField2 = new JTextField();
    JLabel resultLabel = new JLabel("Result:");
    JTextField resultField = new JTextField();
    resultField.setEditable(false);

    JButton addButton = new JButton("Add");
    JButton subtractButton = new JButton("Subtract");
    JButton multiplyButton = new JButton("Multiply");
    JButton divideButton = new JButton("Divide");

    panel.add(label1);
    panel.add(textField1);
    panel.add(label2);
    panel.add(textField2);
    panel.add(resultLabel);
    panel.add(resultField);
    panel.add(addButton);
    panel.add(subtractButton);
    panel.add(multiplyButton);
    panel.add(divideButton);

    frame.add(panel);

    // Action listeners
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(textField1.getText());
          double num2 = Double.parseDouble(textField2.getText());
          double result = num1 + num2;
          resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid input");
        }
      }
    });

    subtractButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(textField1.getText());
          double num2 = Double.parseDouble(textField2.getText());
          double result = num1 - num2;
          resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid input");
        }
      }
    });

    multiplyButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(textField1.getText());
          double num2 = Double.parseDouble(textField2.getText());
          double result = num1 * num2;
          resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
        }
      }
    });

    divideButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(textField1.getText());
          double num2 = Double.parseDouble(textField2.getText());
          if (num2 == 0) {
            JOptionPane.showMessageDialog(frame, "Cannot divide by zero.");
          } else {
            double result = num1 / num2;
            resultField.setText(Double.toString(result));
          }
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid input.");
        }
      }
    });

    frame.setVisible(true);
  }
}
