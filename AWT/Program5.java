package AWT;

import java.awt.*;
import java.awt.event.*;

public class Program5 {

    public Program5() {
        Frame f = new Frame("CardLayout Example");
        CardLayout c = new CardLayout();
        f.setLayout(c); // Set the layout to CardLayout

        // Add buttons to the CardLayout
        f.add("1", new Button("Card1"));
        f.add("2", new Button("Card2"));
        f.add("3", new Button("Card3"));
        f.add("4", new Button("Card4"));
        f.add("5", new Button("Card5"));

        // Set the size of the frame
        f.setSize(400, 300);

        // Add a WindowListener to close the frame
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        // Add a KeyListener to navigate cards using arrow keys
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    c.next(f); // Show the next card
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    c.previous(f); // Show the previous card
                }
            }
        });

        f.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new Program5();
    }
}
