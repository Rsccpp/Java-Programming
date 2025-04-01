package Swing;

import javax.swing.*;
import java.awt.event.*;

// Java JCheckBox
// * Used to create a checkbox 
// * Turn an option on or off
// * It inherits from JToggleButton

public class jCheckBox extends JFrame {
    jCheckBox() {
        JCheckBox cb1;
        JCheckBox cb2;
        JCheckBox cb3;

        cb1 = new JCheckBox("Java");
        cb1.setBounds(100, 100, 100, 50);
        cb2 = new JCheckBox("C++");
        cb2.setBounds(100, 150, 100, 50);
        cb3 = new JCheckBox("Python");
        cb3.setBounds(100, 200, 100, 50);

        add(cb1);
        add(cb2);
        add(cb3);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jCheckBox();
    }
}
