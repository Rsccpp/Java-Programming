package Swing;

import javax.swing.*;
import java.awt.event.*;

// JCheckBoxMenuItem
// * Represents checkbox included in a menu. 
// * Having text or a graphic icon or both. 
// * Can be selected or deselected. 
// * Can be  configured and controlled by actions. 

public class jCheckBoxMenuItem {

    public static void main(String[] args) {
        JFrame f = new JFrame("JCheckBoxMenuItem");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem menuItem1 = new JMenuItem("Open", KeyEvent.VK_N);
        fileMenu.add(menuItem1);

        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option1");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);

        ActionListener aListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbstractButton aButton = (AbstractButton) e.getSource();
                boolean selected = aButton.getModel().isSelected();
                String newLabel;
                Icon newIcon;

                if (selected) {
                    newLabel = "Value-1";
                } else {
                    newLabel = "Value-2";
                }
                aButton.setText(newLabel);
            }
        };

        caseMenuItem.addActionListener(aListener);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
