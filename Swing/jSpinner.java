package Swing;

import javax.swing.*;

// Class JSpinner
// * It is a single line input field.
// * It allows the user to select a number or an object value from an ordered sequence. 

public class jSpinner extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Spinner Example");
        SpinnerModel value = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(value);

        spinner.setBounds(100, 100, 50, 30);
        f.add(spinner);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
