package Swing;

import javax.swing.*;
import java.awt.event.*;

// JTable
// * Used to display data in tabular form
// * Composed of rows and columns

public class jTable extends JFrame {
    jTable() {
        String data[][] = {
                { "101", "Rakul", "45612451" },
                { "102", "Rae", "45612851" },
                { "103", "Tom", "45612451" },
                { "104", "Harry", "45612451" }
        };
        String col[] = { "ID", "NAME", "ROLL_NO" };
        JTable jt = new JTable(data, col);
        jt.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(jt);
        add(sp);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jTable();
    }
}