package AWT;

import java.awt.*;


// Layout Managers

// There are five predefined layout manager classes:
// 1. FlowLayout
// 2. BorderLayout
// 3. GridLayout
// 4. GridBagLayout
// 5. CardLayout


// 1. FlowLayout Manager
// Used to arrange the components in a line, one after another

// public class Program5 {

//     public static void main(String[] args) {
        // Frame f = new Frame("FlowLayout Example");
        // Button b1, b2, b3, b4, b5;

        // b1 = new Button("1");
        // b2 = new Button("2");
        // b3 = new Button("3");
        // b4 = new Button("4");
        // b5 = new Button("5");

        // f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);

        // f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        // f.setSize(500, 500);
        // f.setVisible(true);
//     }
// }


// 2. BorderLayout Manager
// BorderLayout manager is used to arrange components in a particular manner -- East, West, North, South, and Center

// public class Program5 {

//     public static void main(String[] args) {
//         Frame f = new Frame("FlowLayout Example");
//         Button b1, b2, b3, b4, b5;

//         b1 = new Button("NORTH");
//         b2 = new Button("SOUTH");
//         b3 = new Button("EAST");
//         b4 = new Button("WEST");
//         b5 = new Button("CENTER");

//         f.add(b1, BorderLayout.NORTH);
//         f.add(b2, BorderLayout.SOUTH);
//         f.add(b3, BorderLayout.EAST);
//         f.add(b4, BorderLayout.WEST);
//         f.add(b5, BorderLayout.CENTER);


//         f.setSize(500, 500);
//         f.setVisible(true);
//     }
// }



// GridLayout Manager
// Used to arrange the components in rectangular grid. [In Matrix]

public class Program5 {

    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout Example");
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
        GridLayout g = new GridLayout(2, 5);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("10");


        f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);
        f.add(b6); f.add(b7); f.add(b8); f.add(b9); f.add(b10);

        f.setLayout(g);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}