package Swing;

import javax.swing.*;
import java.awt.event.*;

// JPasswordField
// * Specialized for password entry
// * Allows editing of a single line of text
// * It inherits from JTextField

// Example with ActionListener

public class jPasswordField {
    public static void main(String[] args) {
        JFrame f = new JFrame("JPasswordField");

        // display Username and Password
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);

        // To get password
        final JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);

        // Labels of Username and password
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);

        // Login button
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);

        // Textfield to get text
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);

        f.add(value);
        f.add(label);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = "Username: " + text.getText();
                data = data + ", Password: " + new String(value.getPassword());
                label.setText(data);
            }
        });
    }
}
