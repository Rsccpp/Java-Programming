package Swing;

import javax.swing.*;
import java.awt.event.*;

// JRaioButton
// * Used to create a radio button and choose one option from multiple options. 
// * Added in ButtonGroup to select one radio button only. 
// * Used in exam systems or quiz

public class jRadioButton extends JFrame {
    jRadioButton() {
        JRadioButton cb1;
        JRadioButton cb2;

        cb1 = new JRadioButton("A)Male");
        cb1.setBounds(100, 100, 100, 50);
        cb2 = new JRadioButton("B) Female");
        cb2.setBounds(100, 150, 100, 50);

        ButtonGroup bg = new ButtonGroup();
        bg.add(cb1);
        bg.add(cb2);
        add(cb1);
        add(cb2);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jRadioButton();
    }
}
