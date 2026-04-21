package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton btnIndia, btnSrilanka;

    CountryButtonDemo() {
        frame = new JFrame("Country Button Demo");

        label = new JLabel("Press a Button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Add Action Listener
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}