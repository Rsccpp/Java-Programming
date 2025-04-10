package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // GUI components
    private static JTextField tf;
    private String s0, s1, s2;

    // Constructor
    Calculator() {
        s0 = s1 = s2 = "";

        setTitle("Swing Calculator");
        setSize(200, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the text field (display)
        tf = new JTextField();
        tf.setEditable(false);

        add(tf, BorderLayout.NORTH);

        // Create button panel
        JPanel p = new JPanel();
        p.setBackground(Color.DARK_GRAY);
        add(p);

        // Buttons for numbers and operations
        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*",
                "1", "2", "3", "-", "0", ".", "C", "+" };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            p.add(btn);
        }

        // Equals button
        JButton equalBtn = new JButton("=");
        equalBtn.addActionListener(this);
        p.add(equalBtn);

        add(p, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        // If the button pressed is a number or a decimal point
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.equals(".")) {
            if (!s1.equals("")) {
                s2 += s; // Add to second operand
            } else {
                s0 += s; // Add to first operand
            }
            tf.setText(s0 + s1 + s2);
        }
        // If the button pressed is an operator
        else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            if (!s0.equals("")) {
                s1 = s; // Store operator
                tf.setText(s0 + s1 + s2);
            }
        }
        // If "=" is pressed, calculate the result
        else if (s.equals("=")) {
            double result = 0;
            try {
                if (!s0.isEmpty() && !s1.isEmpty() && !s2.isEmpty()) {
                    double num1 = Double.parseDouble(s0);
                    double num2 = Double.parseDouble(s2);
                    switch (s1) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            break;
                    }
                    s0 = String.valueOf(result);
                    s1 = s2 = ""; // Reset operands and operator
                    tf.setText(s0);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // If "C" is pressed, clear everything
        else if (s.equals("C")) {
            s0 = s1 = s2 = "";
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        new Calculator();
    }
}
