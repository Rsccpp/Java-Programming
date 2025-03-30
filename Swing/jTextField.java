package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Example : JTextField with ActionListener

// public class jTextField extends JFrame implements ActionListener {
// JTextField tf1, tf2, tf3;
// JButton b1, b2;

// jTextField() {
// tf1 = new JTextField();
// tf1.setBounds(50, 50, 150, 20);

// tf2 = new JTextField();
// tf2.setBounds(50, 100, 150, 20);

// tf3 = new JTextField();
// tf3.setBounds(50, 150, 150, 20);
// tf3.setEditable(false);

// b1 = new JButton("+");
// b1.setBounds(50, 200, 50, 50);

// b2 = new JButton("-");
// b2.setBounds(120, 200, 50, 50);

// b1.addActionListener(this);
// b2.addActionListener(this);

// add(tf1);
// add(tf2);
// add(tf3);
// add(b1);
// add(b2);

// setSize(500, 500);
// setLayout(null);
// setVisible(true);
// }

// public void actionPerformed(ActionEvent e) {
// String s1 = tf1.getText();
// String s2 = tf2.getText();
// int n1 = Integer.parseInt(s1);
// int n2 = Integer.parseInt(s2);
// int n3 = 0;

// if (e.getSource() == b1) {
// n3 = n1 + n2;
// } else if (e.getSource() == b2) {
// n3 = n1 - n2;
// }

// String result = String.valueOf(n3);
// tf3.setText(result);
// }

// public static void main(String[] args) {
// new jTextField();
// }

// }
