package AWT;
import  java.awt.*;

// Button

// Way : 1

// public class Program3 extends  Frame {

//     public Program3()  {
//         Button b = new Button("Click");
//         b.setBounds(100,100,80, 30);
//         add(b);
//         setSize(300, 300);
//         setLayout(null);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         Program3 b = new Program3();
//     }
      
// }

// Way: 2

// public class Program3 extends  Component {

//     public Program3() {
//         Frame f = new Frame("Buttons Example");
//         Button b1 = new Button("ON");
//         Button b2 = new Button("OFF");
//         f.add(b1); f.add(b2);

//         b1.setBounds(80, 100, 80, 30);
//         b2.setBounds(160, 100, 80, 30);

//         f.setSize(500, 500);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public static void main(String[] args) {
//         Program3 b = new Program3();
//     }  
// }



// One more example
 // Create a html file
// import  java.applet.Applet;
// import  java.awt.*;
// import javax.swing.plaf.basic.BasicBorders;

// public class Program3 extends  Applet {

//     public void init(){
//         Button b1, b2;
//         b1 = new Button("Welcome");
//         add(b1);

//         b2 = new Button("");
//         add(b2);
//     }
// }



// ******** Checkbox ******** 

// It is a graphical component that can be in either an "on"(true) or "off"(false) state.

public class Program3 {

    public Program3() {
        Frame f = new Frame("Checkbox Example");
        Checkbox checkbox1, checkbox2 , checkbox3, checkbox4;
        
        System.out.println("Select languages: ");
        checkbox1 = new Checkbox("C++");
        checkbox2 = new Checkbox("Java", true);
        checkbox3 = new Checkbox("Python");
        checkbox4 = new Checkbox("JavaScript");

        
        checkbox1.setBounds(100, 100, 50, 50);
        checkbox2.setBounds(100, 150, 50, 50);
        checkbox3.setBounds(100, 200, 50, 50);
        checkbox4.setBounds(100, 250, 50, 50);
        
        f.add(checkbox1); f.add(checkbox2);
        f.add(checkbox3); f.add(checkbox4);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Program3 b = new Program3();
    }

    
}