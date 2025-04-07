package Swing;

import javax.swing.*;

// Class JSeparator
// * Used to provide general purpose component for implementing divider lines. 
// * Used to draw a line to separate widgets in a layout. 
// * It inherits JComponent class. 

public class jSeparator {

    JMenu menu;
    JMenuItem l1, l2;

    jSeparator() {
        JFrame f = new JFrame("Separator Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");

        l1 = new JMenuItem("Item 1");
        l2 = new JMenuItem("Item 2");

        menu.add(l1);
        menu.addSeparator();
        menu.add(l2);
        mb.add(menu);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new jSeparator();
    }
}