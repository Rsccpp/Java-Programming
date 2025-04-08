package Swing;

import javax.swing.*;

// Class 
// * Used to create the jSlider
// * One can select a value from a specific range

public class jSlider extends JFrame {
    jSlider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        jSlider frame = new jSlider();
        frame.pack();
        frame.setVisible(true);
    }
}
