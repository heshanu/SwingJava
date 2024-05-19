package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class MySwingApp {

    public static void main(String[] args) {

        // Create a new JFrame and set its properties
        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create two JLabels and set their text
        JLabel label1 = new JLabel("Label 1:");
        JLabel label2 = new JLabel("Label 2:");

        // Create two JTextFields with a default size of 20 characters
        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20);

        // Create a new JPanel and set its layout to FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add the labels and text fields to the panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);

        // Add the panel to the JFrame
        frame.add(panel, BorderLayout.CENTER);

        // Display the JFrame
        frame.setVisible(true);
    }
}
