package Swing;

import javax.swing.*;

// Class JMenuBar
// * Used to display menu bar on the window or frame. 
// * Having several menus
// * Declaration : public class JMenuBar extends JComponent implements MenuElement, Accessible

// Class JMenu
// * It is a pull down menu component which is displayed from the menu bar. 
// * It inherits the JMenuItem class. 
// * Declaration : public class JMenu extends JMenuItem implements MenuElement, Accessible 

public class jMenuBar extends JFrame {
    JMenu menu, submenu, Tools, Setting;
    JMenuItem l1, l2, l3, l4, l5;

    jMenuBar() {
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        Tools = new JMenu("Tools");
        Setting = new JMenu("Setting");
        submenu = new JMenu("Sub Menu");

        l1 = new JMenuItem("Item 1");
        l2 = new JMenuItem("Item 2");
        l3 = new JMenuItem("Item 3");
        l4 = new JMenuItem("Item 4");
        l5 = new JMenuItem("Item 5");

        menu.add(l1);
        menu.add(l2);
        menu.add(l3);
        menu.add(l4);
        submenu.add(l5);
        menu.add(submenu);
        mb.add(menu);
        mb.add(Tools);
        mb.add(Setting);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jMenuBar();
    }
}
