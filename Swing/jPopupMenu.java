package Swing;

import javax.swing.*;
import java.awt.event.*;

// JPopupMenu
// * It dynamically popped up at specific position within a component. 
// * It inherits the JComponent. 

public class jPopupMenu {
    jPopupMenu() {
        final JFrame f = new JFrame("PopupMenu Example");
        final JPopupMenu pm = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());
            }
        });

        f.add(pm);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new jPopupMenu();
    }
}
