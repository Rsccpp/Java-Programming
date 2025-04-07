package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class JColorChooser
// * Used to create a color dialog box
// * It inherits JComponent class

public class jColorChooser extends JFrame implements ActionListener {
    JButton b;
    Container c;

    jColorChooser() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        jColorChooser c = new jColorChooser();
        c.setSize(400, 400);
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
