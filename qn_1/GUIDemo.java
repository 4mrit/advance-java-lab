import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIDemo {
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("GUI Example !!");
    jFrame.setLayout(new FlowLayout());
    jFrame.setSize(400, 400);

    JLabel textLabel = new JLabel("Hello");
    JButton changeButton = new JButton("Change Text");
    ImageIcon image = new ImageIcon("image.jpg");
    JLabel imageHolder = new JLabel(image);

    imageHolder.setPreferredSize(new Dimension(400, 400));

    jFrame.add(textLabel);
    jFrame.add(changeButton);
    jFrame.add(imageHolder);

    changeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textLabel.setText("World !!");
      }
    });
    jFrame.setVisible(true);
  }
}
