// Interface


// Concept of Abstract class
// It is neccessary to implement abstract class methods in child class

// abstract class Geometry {
//     static final double PI = 3.14159;
//     public abstract double area();
//     public abstract double circumference();
// }

// // Extending Geometry for Circle
// class Circle extends Geometry {
//     public double r;

//     public Circle(double r){
//         this.r = r;
//     }

//     public double area(){
//         return PI*r*r;
//     }

//     public double circumference(){
//         return 2*PI*r;
//     }
// }

// // Extending Geometry for Rectangle
// class Rectangle extends Geometry {
//     protected double l, w;

//     public Rectangle(double l, double w){
//         this.l = l;
//         this.w = w;
//     }

//     public double area(){
//         return l*w;
//     }

//     public double circumference(){
//         return 2*(l+w);
//     }
// }


// // Main class
// public class chp6 {

//     public static void main(String[] args){
//         Geometry[] geometries = new Geometry[2];
//         geometries[0] = new Circle(2.0);
//         geometries[1] = new Rectangle(1.0,3.0 );   
        
//         //totalArea
//         double totalArea = 0 ;
//         for(int i=0; i < 2; i++){
//             totalArea = totalArea + geometries[i].area();
//         }
//         System.out.println("Total area = " + totalArea);
//     }
// }


// Multiple Inheritance -- Two base class and One derived class

// -- Java doesn't support multiple inheritance but Java interface solve this problem. 

// Interface
// 1.In interface all members are final and all methods are abstract.
// 2. If a class doesn't implement all method then it must be an abstract class 

// --Methods in Interface
// -- May be public or abstract but not static

// Variables in Interface may be public, static, and final. 

// Declaration of --
// Variables-- static final type varName = value;
// Methods--  Return-type methodName(parameter list);

// Example-- 

// interface GeoAnalyzer {
//     final static double pi = 3.142F;
//     double area();
//     double perimeter();
// }

// // Circle
// class Circle implements GeoAnalyzer{
//     double radius;
//     Circle(double r){
//         radius = r;
//     }
//     public double area(){
//         return (pi*radius*radius);
//     }
//     public double perimeter(){
//         return (2*pi*radius);
//     }
// }

// // Ellipse class
// class Ellipse implements GeoAnalyzer {
//     double major;
//     double minor;

//     Ellipse(double m, double n){
//         major = m;
//         minor = n;
//     }
//     public double area(){
//         return (pi*major*minor);
//     }
//     public double perimeter(){
//         return (pi*(major+minor));
//     }
// }

// // Rectangle
// class Rectangle implements GeoAnalyzer{
//     double length;
//     double width;
//     Rectangle(double l, double w){
//         length = l;
//         width = w;
//     }
//     public double area(){
//         return (length*width);
//     }
//     public double perimeter(){
//         return (2*(length + width));
//     }
// }

// public class chp6  {
//     static void display(double x, double y){
//         System.out.println("Area = " + x + " Perimeter = " + y);
//     }

//     public static void main(String[] args){
//         Circle c = new Circle(5.2);
//         Ellipse e = new Ellipse(4.5, 3.6);
//         Rectangle r = new Rectangle(6.5,4.3);

//         GeoAnalyzer geoItem;
//         geoItem = c;
//         display(geoItem.area(), geoItem.perimeter());

//         geoItem = e;
//         display(geoItem.area(), geoItem.perimeter());

//         geoItem = r;
//         display(geoItem.area(), geoItem.perimeter());
//     }
    
// }


// Java most used Interfaces
// 1. Iterator -- To run through a collection of objects
// 2. Cloneable -- To make a copy of an existing object via the clone() method on the class object.
// 3. Serializable -- Pack a web of objects
// 4. Comaparable -- To make a total order of objects

// Example-- In demonstration

// Variables in Interfaces -- 
// import java.util.Random;

// interface SharedConstants {
//    int NO = 0;
//    int YES = 1;
//    int MAYBE = 2;
//    int LATER = 3;
//    int SOON = 4;
//    int NEVER = 5;
// }

// class Question implements SharedConstants {
//     Random rand = new Random();
//     int ask(){
//         int prob = (int) (100 * rand.nextDouble());

//         if (prob < 30){
//             return NO;  // 30%
//         }
//         else if (prob < 60){
//             return YES;   // 15%
//         } 
//         else if (prob < 75){
//             return LATER;  // 13%
//         }
//         else {
//             return NEVER;  // 2%
//         }
//     }
// }

// class AskMe implements SharedConstants {
//     static void answer(int result) {
//         switch (result){
//             case NO:
//                System.out.println("NO");
//                break;
//             case YES:
//                System.out.println("Yes");
//                break;
//             case MAYBE:
//                System.out.println("MayBe");
//                break;
//             case LATER:
//                System.out.println("Later");
//                break;
//             case SOON:
//                System.out.println("Soon");
//                break;
//             case NEVER:
//                System.out.println("Never");
//                break;
//         }
//     }
// }

// public class chp6 extends AskMe {

//     public static void main(String[] args){
//         Question q = new Question();
//         answer(q.ask());
//         answer(q.ask());
//         answer(q.ask());
//         answer(q.ask());
//     }
// }


// Interfaces can be extended
interface A {
     void method1();
}

interface B extends A {
     void method2();
}

class MyClass implements B {
    public  void method1(){
        System.out.println("Method1");
    }
    public void method2() {
        System.out.println("Method2");
    }
}

public class chp6  extends MyClass{
   public static void main(String[] args) {
     MyClass obj = new MyClass();
     obj.method1();
     obj.method2();
   }
    
}



// Why we go for an interface? What is the usage of the interface? 
// It has 2 important applications--
//  one is that whenever you use an interface it will it may if it includes some
// members which are declared as a final, static and then a final static public they can be
// used as a global variable look like and this variable can be shared. So, it is just like a
// library of different variables that can be shareable from one class to another class.

//  another example; obviously, the great example the most
// significant example that we can inherit in a multiple sense as you know Java does not
// support single inheritance, but in an indirect way Java also helps a programmer to have
// the multiple inheritance implementation. These are the two main usage and one usage
// also it is there runtime polymorphism; 