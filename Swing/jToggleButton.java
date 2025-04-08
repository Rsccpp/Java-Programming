package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class JToggleButton
// * Used to create toggle button. 
// * It is two-states button to switch on or off.

public class jToggleButton extends JFrame implements ItemListener {
    private JToggleButton button;

    jToggleButton() {
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        button = new JToggleButton("Toggle Me");
        button.addItemListener(this);

        add(button);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            button.setText("ON");
        } else {
            button.setText("OFF");
        }
    }

    public static void main(String[] args) {
        new jToggleButton();
    }
}
