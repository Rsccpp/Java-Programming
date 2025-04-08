package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//* Class JToolBar
// * Provides a movable and customizable toolbar for adding buttons, actions, or controls. 

public class jToolBar extends JFrame {
    jToolBar() {
        setTitle("JToolBar Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());

        // Create toolbar
        JToolBar toolbar = new JToolBar();

        // Create buttons for the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add action listeners
        newButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "New File Created"));
        openButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Opening File"));
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "File Saved"));

        // Add buttons to toolbar
        toolbar.add(newButton);
        toolbar.add(openButton);
        toolbar.add(saveButton);

        // Add toolbar to frame
        add(toolbar, java.awt.BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new jToolBar();
    }
}
