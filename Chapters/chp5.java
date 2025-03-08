// Static Scope Rule in Java

// class Box {
//     double x = 10.0;
//     double y = 20.0;
//     double z = 15.0;

//     double area() {
//         return (2*(x*y + y*z + x*z));
//     }
// }

// class Circle {
//     double x = 0.0;
//     double y = 0.0;
//     double r = 5.0;

//     double area() {
//         return ((22/7) *r*r);
//     }
// }

// public class chp5 {
//   static double x = 50.0;
//   double y = 60;
  
//   public static void main(String[] args){
    
//     int z = 10;                                // It's scope is only in main {}
//     Box b = new Box();
//     Circle c = new Circle();

//     // System.out.println("Circle class data: x = " + x);                         // non-static variable x cannot be referenced from a static context
    
//     // if x is static means it is global variable 
//     System.out.println("Circle class data: x = " + x);                         // Circle class data: x = 50.0
//     System.out.println("Box class data: x = " + b.x);                        // Box class data: x = 10.0
//     System.out.println("Area of Box: x = " + b.area());                      // Area of Box: x = 1300.0
//     System.out.println("Circle class data: x = " + c.x);                     // Circle class data: x = 0.0
//     System.out.println("Area of Circle: x = " + c.area());                   // Area of Circle: x = 75.0
//   }  

// //   System.out.println(z);                       // Error
// }


// Instance Variales Vs Class Variables

// 1. Instance Variales -- Variables declare without static keywords inside class.
// 2. Class Variables --  Variables declare with static keywords. It acts as global variable.


// Static method

// class chp5 {
//     public double x, y, r;

//     // All constructors are here
//     // An instance method: Returns the bigger of two Circles.
//     public chp5 bigger(chp5 c){
//         if(c.r > r)  return c;
//         else return this;
//     }

//     // A class method: Returns the bigger of two classes.
//     public static chp5 bigger (chp5 a, chp5 b){
//         if(a.r > b.r)  return a;
//         else return b;
//     }

// public static void main (String[] args){
//         chp5 a = new chp5(2.0);
//         chp5 b = new chp5(3.0);
//         chp5 c = a.bigger (b);
//         chp5 d = chp5.bigger(a, b);

// }
// }  // See it in demonstration  


// Nested class

// public class chp5 {

//     static double x, y, r;
//     chp5(double r){
//         this.r = r;
//     }

//     // Following is the nested class
//     public static class Point {
//         double x, y;
//         void display(){
//             System.out.println("(x, y): {" + this.x + ", " + this.y + ")");
//         }

//         Point(double a, double b){
//             this.x = a;
//             this.y = b;
//         }
//     }

//     public boolean isInside(Point p){
//         double dx = p.x - x;
//         double dy = p.y - y;
//         double distance = Math.sqrt((dx*dx) + (dy*dy));
//         if(distance < r) return true;
//         else return false;
//     }

//     public static void main(String[] args){
//         chp5 a = new chp5(2.0);
//         Point pa = new Point(1.0, 2.0);
//         pa.display();
//         System.out.println("Is the points {1,2} inside the circle with radius 2 : " + a.isInside(pa));

//         chp5 b = new chp5(1.0);
//         Point pb = new Point(3.0, 3.0);
//         pb.display();
//         System.out.println("Is the points {3, 3} inside the circle with radius 1 : " + b.isInside(pb));
//     }
// }



// static keywords-- Types and their definition

// 1. static variable      -- Stored in class memory rather than in each object
// class std {
//     static String schName = "ABC School";
//     String name;

//     std(String name, String schName) {
//         this.name = name;
//         this.schName = schName;
//     }

//     void display() {
//         System.out.println(name + " studies in " + schName);
//     }
// }
// public class Practice {
    
//     public static void main(String[] args) {
//         std s1 = new std("Rohan", "Nps");
//         std s2 = new std("Rohan", " ");                     

//         s1.display();
//         s2.display();

//     }
// }
// change in schName reflect in all instances
// Rohan studies in  
// Rohan studies in 

// 2.static method -- Belongs to class and can be called without creating object
// class MathUtil {
//     static int square(int num) {
//         return num * num;
//     }
// }

// public class Practice {
//       public static void main (String[] args){
//         int result = MathUtil.square(8);          // Method can be called without creating object
        
//         System.out.println("Square is " + result);
//       }
    
// }

// 3.static block    -- Executed once when the class is loaded into the memory

// class Test {
//     static{
//         System.out.println("Static block is executed.");
//     }

//     Test() {
//         System.out.println("Constructor is executed.");
//     }
// }
// public class Practice {
    
//     public static void main(String[] args) {
//         Test obj1 = new Test();
//         Test obj2 = new Test();
//     }    
// }
// Output
// Static block is executed.
// Constructor is executed.
// Constructor is executed.

// 4. Static class(Nested Class) -- static nested class does not depend on outer instance

// class Outer{
//      static class Inner{
//         void display(){
//             System.out.println("Static nested class.");
//         }
//      }

//      class local {
//         void display() {
//             System.out.println("Local class");
//          }
//      }
// }

// public class Practice {
//     public static void main(String[] args){
//         // Nested static class
//         Outer.Inner obj = new Outer.Inner();
//         obj.display();
       
//         // Nested class
//         Outer obj1 = new Outer();
//         Outer.local obj2 = obj1.new local();
//         obj2.display();
//     }
    
// }


import java.util.*;
// Recursive Programs in Java

// 1. Calculation of factorial i.e n!

// public class chp5 {
//     static int n;
//     int factorial(int n){
//         if(n==0) return 1;
//         else 
//            return n*factorial(n-1);    
//     }

//     public static void main(String[] args){
//            chp5 x = new chp5();
//            x.n = Integer.parseInt(args[0]);
           
//            System.out.println("Factorial of " + n + " : " + x.factorial(n));
//     }  
// }


// 2. Calculation of Fibonacci sequence
// public class chp5 {
//       static int n;

//       // fibonacci func
//       int fibonacci(int n) {
//         if(n==0) return 0;
//         else if(n==1)  return 1;
//         else 
//           return fibonacci(n-1) + fibonacci(n-2);
//       }

//       public static void main (String[] args){
//         chp5 x = new chp5();

//         x.n = Integer.parseInt(args[0]);
//         for(int i=0; i<=x.n; i++){
//             System.out.print(x.fibonacci(i) + " ");
//         }
//       }
    
// }

// 3. Calculation of GCD (Greatest common divisor)
// public class chp5 {
//     static int m, n;
    
//     // func for GCD
//     int gcd(int m, int n){
//         if (m > n) return gcd(n,m);
//         else if(m==n) return n;
//         else if(m==0) return n;
//         else if(m==1) return 1;
//         else 
//           return gcd(m, n%m);
//     }


//     public static void main(String[] args){
//          chp5 x = new chp5();
//          x.m = Integer.parseInt(args[0]);
//          x.n = Integer.parseInt(args[1]);
         
//          System.out.println("GCD of (" + x.m + ", " +  x.n + ") " + "is " + x.gcd(x.m, x.n));
//     }    
// }

// 4. Let try:
// public class chp5 {
//      static int count = 0;
//      static void p(){
//         count++;
//         if(count<=5){
//             System.out.println("Hello " + count);
//             p();
//         }
//      }

//      public static void main(String[] args){
//         p();
//      }   
// }

//Output
// Hello 1
// Hello 2
// Hello 3
// Hello 4
// Hello 5