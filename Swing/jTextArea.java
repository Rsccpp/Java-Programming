package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JTestArea 
// ** It is a multi line region that displays text. 
// ** It inherits JTextComponent class.

public class jTextArea extends Frame implements ActionListener {
    JTextArea area;
    JTextField tf1, tf2;
    JButton b;

    jTextArea() {
        area = new JTextArea();
        // TextField tf = new TextField("TextArea");
        // tf.setBounds(50, 50, 100, 20);
        area.setBounds(50, 50, 150, 150);

        tf1 = new JTextField();
        tf1.setEditable(false);
        tf1.setBounds(50, 200, 100, 20);

        tf2 = new JTextField();
        tf2.setEditable(false);
        tf2.setBounds(200, 200, 100, 20);

        b = new JButton("Count");
        b.setBounds(100, 250, 100, 20);
        b.addActionListener(this);

        // add(tf);
        add(area);
        add(tf1);
        add(tf2);
        add(b);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        String text = area.getText();
        String words[] = text.split("\\s");
        tf1.setText("Words " + words.length);
        tf2.setText("Charactors " + text.length());
    }

    public static void main(String[] args) {
        new jTextArea();
    }
}
