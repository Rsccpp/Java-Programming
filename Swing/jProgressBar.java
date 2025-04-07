package Swing;

import javax.swing.*;

// Class JProgressBar
// * Used to display the progress of the task. 
// * It inherits JComponent class.

public class jProgressBar extends JFrame {
    JProgressBar jb;
    int i = 0, num = 0;

    jProgressBar() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250, 150);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 20;

            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        jProgressBar pb = new jProgressBar();
        pb.setVisible(true);
        pb.iterate();
    }
}
