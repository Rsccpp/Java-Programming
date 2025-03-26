package AWT;
import java.awt.*;
import java.applet.*;


// Interactive applet

import java.applet.Applet;
import javax.swing.InputMap;

public class Program5 extends Applet {
    TextField input1, input2;

    public void init(){
        input1 = new TextField(8);
        input2 = new TextField(8);
        add(input1); add(input2);

        input1.setText("0");
        input2.setText("1");
    }

    public void paint(Graphics g){
        int x = 0, y = 0, z = 0;
        String s;
        g.drawString("Enter two values", 10, 50);
        
        try {
            s = input1.getText(); x = Integer.parseInt(s);
            s = input2.getText(); y = Integer.parseInt(s);

            z = x+y;
            s = String.valueOf(z);
            g.drawString("The sum is :", 10, 75);
            g.drawString(s, 100, 75);
        } catch (Exception e) { }
    }
}
