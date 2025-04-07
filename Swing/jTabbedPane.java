package Swing;

import javax.swing.*;

// Class JTabbedPane
// * Used to switch between a group of components by clicking on a tab with a given title or icon.
// * It inherits JComponent class.

public class jTabbedPane {
    private static final String EXIT_ON_CLOSE = null;
    JFrame f;

    jTabbedPane() {
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 200);
        JPanel p1 = new JPanel();
        p1.add(ta);

        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);

        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);

        f.add(tp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new jTabbedPane();

    }
}
