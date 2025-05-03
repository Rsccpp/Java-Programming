package Swing;

import javax.swing.*;
import java.awt.event.*;

// JComboBox
// * Used to show popup menu of choices
// * Selected choice shown on the top of a menu
// * It inherits JComponent class 

public class jComboBox extends JFrame {
    jComboBox() {
        jComboBox cb1;

        String country[] = { "India", "Nepal", "U.S.A", "England", "Bhutan" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);

        add(cb);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jComboBox();
    }
}