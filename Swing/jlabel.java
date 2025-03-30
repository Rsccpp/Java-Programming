package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class JLabel : Constructors

// Constructors Description
// JLabel() Creates a Button with no text & icon
// JLabel(String s) Creates a Button with the specified text
// JLabel(Icon i) Creates a Button with the specified icon image
// JLabel(String s, Icon i, int HorizontalAlignment) Creates a Button with the
// specified text, image, and horizontal alignment

// Example: Creating a JLable
// public class jlabel extends JFrame {
// jlabel() {
// new JLabel("Label Example");
// JLabel l1, l2;

// l1 = new JLabel("First Label.");
// l1.setBounds(50, 50, 100, 30);

// l2 = new JLabel("Second Label.");
// l2.setBounds(50, 100, 100, 30);

// add(l1);
// add(l2);
// setSize(500, 500);
// setLayout(null);
// setVisible(true);

// }

// public static void main(String[] args) {
// new jlabel();
// }

// }

// Example : JLabel with ActionListener

// public class jlabel extends Frame implements ActionListener {
// JTextField tf;
// JLabel l;
// JButton b1, b2;

// jlabel() {
// tf = new JTextField();
// tf.setBounds(50, 50, 150, 20);

// l = new JLabel();
// l.setBounds(50, 100, 250, 20);

// b1 = new JButton("Find IP");
// b1.setBounds(50, 150, 95, 30);
// b1.addActionListener(this);

// b2 = new JButton("Remove IP");
// b2.setBounds(50, 200, 95, 30);

// b2.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// tf.setText("");
// }
// });

// add(b1);
// add(b2);
// add(tf);
// add(l);

// setSize(500, 500);
// setLayout(null);
// setVisible(true);
// }

// @Override
// public void actionPerformed(ActionEvent arg0) {
// // TODO Auto-generated method stub
// tf.setText("12345678");
// }

// public static void main(String[] args) {
// new jlabel();
// }

// }
