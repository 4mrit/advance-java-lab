import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageTextApp {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Image and Text Display");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 700);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    ImageIcon imageIcon = new ImageIcon("image.jpg");
    JLabel imageLabel = new JLabel(imageIcon);

    JLabel textLabel = new JLabel("Initial Text", JLabel.CENTER);

    panel.add(imageLabel, BorderLayout.CENTER);
    panel.add(textLabel, BorderLayout.SOUTH);

    JButton changeTextButton = new JButton("Change Text");

    changeTextButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textLabel.setText("Text Changed!");
      }
    });

    frame.add(panel, BorderLayout.CENTER);
    frame.add(changeTextButton, BorderLayout.SOUTH);

    frame.setVisible(true);
  }
}
