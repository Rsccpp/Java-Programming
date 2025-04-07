package Swing;

import javax.swing.*;

// JScrollBar
// * Used to add horizontal and vertical scrollbar 
// JScrollBar() -- Creates a vertical scrollbar with the

public class jScrollBar {
    // jScrollBar() {
    // JScrollBar s = new JScrollBar();
    // s.setBounds(100, 100, 50, 100);
    // add(s);
    // setSize(500, 500);
    // setLayout(null);
    // setVisible(true);
    // }

    public static void main(String[] args) {
        // new jScrollBar();

        // For horizontal and vertical scrollbar

        // Create a JFrame
        JFrame frame = new JFrame("Scrollbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a large text area
        JTextArea textArea = new JTextArea(1, 40);
        textArea.setText("This is an example text that exceeds the window size.\n".repeat(20));

        // Create a JScrollPane with both vertical and horizontal scrollbars
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
