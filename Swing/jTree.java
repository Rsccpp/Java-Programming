package Swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

// Class JTree
// * Used to display the structured data or hierarchial data. 
// * It inherits JComponent class. 

public class jTree {
    JFrame f;

    jTree() {
        f = new JFrame("JTree Example");
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");

        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(black);

        JTree jt = new JTree(style);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(jt);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new jTree();
    }
}
