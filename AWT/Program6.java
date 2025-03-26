package AWT;
// Event Handling in Java 

// Types :
// 1. Foreground events : Require the direct interaction of a user. Eg- clicking a button etc
// 2. Background events : Do not require the direct interaction of a user. Eg - Operating system interrupts etc

// ** In Java, events supported by java.awt.event package 
// ** In Java, there is an abstract superclass called InputEvent for all components input events. 




import java.awt.*;
import java.awt.event.*;

// Example 1 : 

// public class Program6 extends Frame implements MouseListener, MouseMotionListener {
    
//     private int last_x, last_y ;

//     public void init(){
//         this.addMouseListener(this);
//         this.addMouseMotionListener(this);
//     }

//     public void mousePressed(MouseEvent e){
//         last_x = e.getX();
//         last_y = e.getY();
//     }
//     public void mouseDragged(MouseEvent e){
//         Graphics g = this.getGraphics();
//         int x = e.getX(), y = e.getY();

//         g.drawLine(last_x, last_y, x, y);
//         last_x = x;
//         last_y = y;
//     }
    
// }


// Example : MouseListener

// public class Program6 extends Frame implements MouseListener{
//        Label l;
       
    //    Program6(){
    //      addMouseListener(this);

    //      l = new Label();
    //      l.setBounds(26, 50, 100, 20);
    //      add(l);
    //      setSize(500, 500);
    //      setLayout(null);
    //      setVisible(true);
    //    }

//        public void mouseClicked(MouseEvent e){
//         l.setText("Mouse Clicked");
//        }
//        public void mouseEntered(MouseEvent e){
//         l.setText("Mouse Entered");
//        }
//        public void mouseExited(MouseEvent e){
//         l.setText("Mouse Exited");
//        }
//        public void mousePressed(MouseEvent e){
//         l.setText("Mouse Pressed");
//        }
//        public void mouseReleased(MouseEvent e){
//         l.setText("Mouse Released");
//        }

//        public static void main(String[] args) {
//            new Program6();
//        }
// }