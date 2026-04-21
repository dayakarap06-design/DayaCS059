package swingdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Capitals");

        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No Single Capital");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : list.getSelectedValuesList()) {
                    System.out.println(country + " → " + capitals.get(country));
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}