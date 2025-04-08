package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

// Class JFileChooser
// * It represents a dialog window from which the user can select file. 
// * It inherits JComponent class. 

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TextFileReader extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta;

    TextFileReader() {
        open = new JMenuItem("Open file");
        open.addActionListener(this);

        file = new JMenu("File");
        file.add(open);

        mb = new JMenuBar();
        mb.add(file);

        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(ta);

        setLayout(new java.awt.BorderLayout());
        add(mb, java.awt.BorderLayout.NORTH);
        add(scrollPane, java.awt.BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                    ta.setText(""); // Clear previous content
                    String line;
                    while ((line = br.readLine()) != null) {
                        ta.append(line + "\n");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        new TextFileReader();
    }
}