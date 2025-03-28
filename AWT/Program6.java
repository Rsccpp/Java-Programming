package AWT;
// Event Handling in Java 

// Types :
// 1. Foreground events : Require the direct interaction of a user. Eg- clicking a button etc
// 2. Background events : Do not require the direct interaction of a user. Eg - Operating system interrupts etc

// ** In Java, events supported by java.awt.event package 
// ** In Java, there is an abstract superclass called InputEvent for all components input events. 




// import java.awt.*;
// import java.awt.event.*;

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


// Action Listener
import java.awt.*;
import java.awt.event.*;

//1st step
public class Program6 implements ActionListener{
    Frame f;
    TextField tf;
    Button b;

    Program6(){
        f=new Frame("ActionListener Example");
        tf= new TextField();
        tf.setBounds(50, 50, 300, 20);
        b= new Button ("Click Here");
        b.setBounds(50, 100, 70, 30);

        //2nd step
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
    //3rd step
    public void actionPerformed(ActionEvent ae){
        tf.setText("Welcome to the Event Handling Program");
    }

    public static void main(String[] args) {
        Program6 ae = new Program6();
        //new Program6();
    }
}