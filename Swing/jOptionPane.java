package Swing;

import javax.swing.*;

// JOptionPane
// * Used to provide standard dialog boxes such as message, confirm and input dialog boxes. 
// * Used to display information or get input from the user
// * It inherits JComponent class

public class jOptionPane {
    JFrame f;

    jOptionPane() {
        JOptionPane.showMessageDialog(f, "Hello, Wlcome to Java Journey.");
    }

    public static void main(String[] args) {
        new jOptionPane();
    }
}
