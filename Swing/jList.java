package Swing;

import javax.swing.*;

// Class List 
// * Represents a list of items
// * It inherits JComponent class

public class jList extends JFrame {
    jList() {
        DefaultListModel<String> l1 = new DefaultListModel<>();
        DefaultListModel<String> l2 = new DefaultListModel<>();

        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");

        l2.addElement("Item5");
        l2.addElement("Item6");
        l2.addElement("Item7");
        l2.addElement("Item8");

        JList<String> List1 = new JList<>(l1);
        JList<String> List2 = new JList<>(l2);

        List1.setBounds(100, 50, 75, 75);
        List2.setBounds(100, 250, 75, 75);

        add(List1);
        add(List2);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jList();
    }
}
