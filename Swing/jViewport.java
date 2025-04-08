package Swing;

// Class jViewport
// * Used to implement scrolling. 
// * Designed to support both logical scrolling and pixel-based scrolling. 
// * Viewport's child called the view, is scrolled by calling the jViewport.setViewPosition(). 

import javax.swing.*;
import java.awt.*;

public class jViewport extends JFrame {
    public jViewport() {
        setTitle("JViewport Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a large label to demonstrate scrolling
        JLabel label = new JLabel(
                "<html><h1>Scrollable Content</h1><p>This is a long content that requires scrolling.</p></html>");

        // Create a scroll pane
        JScrollPane scrollPane = new JScrollPane();

        // Create a viewport and set its view to the label
        JViewport viewport = new JViewport();
        viewport.setView(label);

        // Set the viewport into the scroll pane
        scrollPane.setViewport(viewport);

        // Add scroll pane to frame
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new jViewport();
    }
}
