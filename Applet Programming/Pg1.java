
             
// Applet Programming

import java.applet.*;
import java.awt.*;

// Example 1       

// public class chp10 extends Applet {

//     public void paint(Graphics g){
//         g.drawString("Hello World!", 350, 350);
//     }
// }


// Example 2

// public class chp10 extends Applet {
//     public void init() {
//         resize(300,300);
//     }

//     public void paint(Graphics g){
//         g.drawString("Hello World!", 100, 100);
//     }
// }


// Example 3
public class Pg1  extends Applet {
    int x, y, w, h;
    public void init(){
        x = Integer.parseInt(getParameter("xValue"));
        y = Integer.parseInt(getParameter("yValue"));
        w = Integer.parseInt(getParameter("wValue"));
        h = Integer.parseInt(getParameter("hValue"));
    }

    public void paint(Graphics g){
        g.drawRect(x, y, w, h);
    }

    
}

