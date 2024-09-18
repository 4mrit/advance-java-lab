import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArithmeticCalculator {
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Calculator !!");
    jFrame.setLayout(new FlowLayout());
    jFrame.setSize(400, 400);

    JTextField inputA = new JTextField();
    JTextField inputB = new JTextField();
    JButton additionButton = new JButton("+");
    JButton subtractionButton = new JButton("-");
    JButton multiplicationButton = new JButton("*");
    JButton divisionButton = new JButton("/");
    JLabel outputLabel = new JLabel();

    jFrame.add(inputA);
    jFrame.add(inputB);
    jFrame.add(additionButton);
    jFrame.add(subtractionButton);
    jFrame.add(multiplicationButton);
    jFrame.add(divisionButton);
    jFrame.add(outputLabel);

    additionButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double sum = Double.parseDouble(inputA.getText()) + Double.parseDouble(inputB.getText());
        outputLabel.setText("The Sum is : " + sum);
      }
    });
    subtractionButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double difference = Double.parseDouble(inputA.getText()) - Double.parseDouble(inputB.getText());
        outputLabel.setText("The Difference is : " + difference);
      }
    });
    multiplicationButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double multiplication = Double.parseDouble(inputA.getText()) * Double.parseDouble(inputB.getText());
        outputLabel.setText("The Multiplication is : " + multiplication);
      }
    });
    divisionButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double division = Double.parseDouble(inputA.getText()) / Double.parseDouble(inputB.getText());
        outputLabel.setText("The Division is : " + division);
      }
    });
    jFrame.setVisible(true);
  }
}
