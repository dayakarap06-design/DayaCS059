package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton btnClock, btnHourGlass;

    ImageButtonDemo() {
        frame = new JFrame("Image Button Demo");

        label = new JLabel("Click an Image Button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Load images
        ImageIcon clockIcon = new ImageIcon("digital.jpg");
        ImageIcon hourIcon = new ImageIcon("hourglass.jpg");

        btnClock = new JButton(clockIcon);
        btnHourGlass = new JButton(hourIcon);

        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}