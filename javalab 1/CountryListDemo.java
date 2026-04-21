package swingdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected Countries: " + list.getSelectedValuesList());
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}