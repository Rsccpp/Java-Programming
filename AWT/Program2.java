package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

// Creating a Panel
public class Program2 {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with Panel");
        Panel p = new Panel();
        f.setSize(500, 500);
        f.setBackground(Color.BLACK);
        f.setLayout(null);

        p.setSize(150, 150);
        p.setBackground(Color.RED);
        f.add(p);
        f.setVisible(true);

    }

}
