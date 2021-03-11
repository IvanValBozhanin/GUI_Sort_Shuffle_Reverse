package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;

public class NumberManipulator extends JFrame {
    JFrame frame;
    JButton add, sort, shuffle, reverse;
    JLabel enter;
    JTextField field;
    LinkedList<Integer> list;
    JTextArea area;
    public NumberManipulator(){
        super("Number Manipulator");
        frame = new JFrame();

        list = new LinkedList<>();

        enter = new JLabel("Enter a number: ");
        enter.setFont(new Font("Serif", Font.ITALIC, 20));
        enter.setBounds(40, 5, 150, 30);

        field = new JTextField();
        field.setFont(new Font("Monospace", Font.PLAIN, 15));
        field.setBounds(200, 5, 200, 30);

        add = new JButton("Add");
        add.setFont(new Font("Serif", Font.PLAIN, 20));
        add.setBounds(420, 5, 80, 30);
        add.addActionListener(e -> {
            list.add(0, Integer.parseInt(field.getText()));
            field.setText("");
        });

        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Serif", Font.PLAIN, 25));
        area.setBounds(10, 50, 600, 300);

        sort = new JButton("Sort");
        sort.setFont(new Font("Serif", Font.PLAIN, 20));
        sort.setBounds(650, 100, 100, 30);
        sort.addActionListener(e -> {
            Collections.sort(list);
            area.setText(list.toString().substring(1, list.toString().length()-1));
        });

        shuffle = new JButton("Shuffle");
        shuffle.setFont(new Font("Serif", Font.PLAIN, 20));
        shuffle.setBounds(650, 150, 100, 30);
        shuffle.addActionListener(e -> {
            Collections.shuffle(list);
            area.setText(list.toString().substring(1, list.toString().length()-1));
        });

        reverse = new JButton("Reverse");
        reverse.setFont(new Font("Serif", Font.PLAIN, 20));
        reverse.setBounds(650, 200, 100, 30);
        reverse.addActionListener(e -> {
            Collections.reverse(list);
            area.setText(list.toString().substring(1, list.toString().length()-1));
        });

        {
            frame.add(enter);
            frame.add(field);
            frame.add(add);
            frame.add(area);
            frame.add(sort);
            frame.add(shuffle);
            frame.add(reverse);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);
            frame.setVisible(true);
        }
    }
}
