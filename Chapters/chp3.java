package Chapters;
// Class Concept in Java

// A class is a group of objects, which have common properties.
// It is a template or blueprint from which objects are created.
// It is logical entity.


// class contains --
// 1.Fields
// 2.methods
// 3.Constructors
// 4.Blocks
// 5.Nested classes and Interfaces


// ------------------------------------------------------------------------------------------------------------------------------------------------  

// Basics of Class

// class Circle {
//     double x, y;
//     double r;

//     // Methods 
//     double circumference() {
//         return 2*3.14159*r ;
//     }
    
//     double area(){
//         return 3.14159 *r*r;
//     }  
// }

// class box {
//     double width;
//     double height;
//     double depth;

//     double area() {
//         double a;
//          a = (width*height + height*depth + width*depth) * 2;
//          return a;
//     }

//     double volume() {
//         double v;
//         v = width * height * depth ;
//         return v;
//     }

//     void setBox(double width, double height, double depth){
//         this.width = width;
//         this.height = height;
//         this.depth = depth;
//     }
// }


// public class chp3 {
//     public static void main(String [] args) {

//         // Declaration of object
//         // Circle c = new Circle();
//         // c.x = 0.0;
//         // c.y = 0.0;
//         // c.r = 5.0;

//         // System.out.println("Circumference is:" + c.circumference());
//         // System.out.println("Area is: " + c.area());

//         // Mutltiple objects creation
//         Circle c1 = new Circle();
//         Circle c2 = new Circle();
        
//         box b1 = new box();
//         // box b2 = new box();

//         c1.r = 25.0;
//         c2.r = 27.0;

//         // With Parameters
//         b1.setBox(3.0, 7.0, 5.0 );


//         System.out.println("Circumference of Circle 1: " + c1.circumference());
//         System.out.println("Circumference of Circle 2: " + c2.circumference());
        
//         System.out.println();
//         System.out.println("Area of Circle 1: " + c1.area());
//         System.out.println("Area of Circle 2: " + c2.area());

//         System.out.println();
//         System.out.println("Area of box: " + b1.area());
//         System.out.println("Volume of box: " + b1.volume());
        
//     }
// }

// Constructor & this keyword

// In java it is a method. 
// Initializes an object immediately on creation. 
// Has no return type. 
// In fact , the implicit return type of a class Constructor is the class type itself. 


// class Circle {
//     double x, y;
//     double r;

//     double circumference () {
//         return 2*3.14159*r;
//     }

//     double area() {
//         return 3.14159 *r*r;
//     }

//     Circle (double x, double y, double r){
//         this.x = x;
//         this.y = y;
//         this.r = r;
//     }
// }

// public class chp3 {

//     public static void main(String[] args){
//         Circle c1 = new Circle(3.0, 4.0, 5.0);
//         Circle c2 = new Circle(4.0, 5.0, 6.0);

//         System.out.println("Circumference of Circle 1: " + c1.circumference());
//         System.out.println("Circumference of Circle 2: " + c2.circumference());

//         System.out.println("Area of Circle1 :" + c1.area());
//         System.out.println("Area of Circle2 :" + c2.area());

//     }
// }

// this with multiple Constructors 

// It should appear only as the first statement in a constructor.

// class Circle {
//     double x, y;
//     double r;

//     Circle(double x, double y, double r){
//         this.x = x; 
//         this.y = y;
//         this.r = r;
//     }

//     Circle(double r){
//         this(0.0, 0.0, r);
//     }

//     Circle(Circle c){
//         this(c.x, c.y, c.r);
//     }

//     Circle(){
//         this(0.0);
//     }

//     double circumference() {
//         return 2*3.14159*r;
//     }

//     double area(){
//         return 3.14159*r*r;
//     }
// }

// public class chp3 {

//     public static void main(String[] args){
//         Circle c1 = new Circle(3.0, 4.0, 5.0);
//         Circle c2 = new Circle(4.0, 5.0, 6.0);

//         Circle c3 = new Circle(3.0);
//         System.out.println(c3);

//         System.out.println("Circumference of Circle 1: " + c1.circumference());
//         System.out.println("Circumference of Circle 2: " + c2.circumference());

//         System.out.println("Area of Circle1 :" + c1.area());
//         System.out.println("Area of Circle2 :" + c2.area());

//     }
// }


// 5. Interfaces