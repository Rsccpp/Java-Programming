import java.util.*;

// Constructor
//  class Practice {
//     int a, b ;
//     public  Practice(int x, int y) {
//         a = x;
//         b = y ;
//     }

//     public int mutltiply() {
//         return a * b;
//     }

//     public int add() {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x, y ;
        
//         System.out.println("Enter first numbers : ");
//         x = sc.nextInt();
//         System.out.println("Enter second numbers : ");
//         y = sc.nextInt();
        
//         // Class object creation
//         Practice p = new Practice(x, y);

//         System.out.println("The Product of two numbers is : " + p.mutltiply());
//         System.out.println("The Sum of two numbers is : " + p.add());
//     }
// }

// class base {
//     int a = 10;
// }

// class derived extends base {
//     int a = 20;
    
//     void display() {
//         System.out.println("Base class value: " + super.a );
//         System.out.println("Derved class value: " + a );
//     }
// }

// public class Practice {
//     int x = 10, y = 10 ;
    
//     Practice(int x, int y) {           // Use of this -- to differentiate local or instance variable
//         this.x = x ;
//         this.y = y;
//     }

    
//     public static void main(String[] args) {
//        Practice pr = new Practice(4,5);
//        System.out.println( " x = " + pr.x + " y = " + pr.y);

//        derived dr = new derived();
//        dr.display();
//     }

// }

// static keywords

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

// Upcasting

// class A {
//     void display(){
//         System.out.println("Hello Class A");
//     }
// }

// class B extends A {
//     void display(){
//         System.out.println("Hello Class B");
//     }
    
// }
// public class Practice {
//     public static void main(String[] args){
//         // Upcasting
//             A a = new B();
//             // B a = new A();              // error: incompatible types: A cannot be converted to B
//             a.display();                // Hello Class B
//     }
    
// }

// Week-4 qno.7
class Base {
    public void print(){
        System.out.println("Base class...");
    }
}

class Derived extends  Base {
    public void print(){
        System.out.println("Derived class...");
    }
}   

public class Practice {

    private static void main(String[] args){
        Base b = new Base();
        b.print();

        Derived d = new Derived();
        d.print();
    }
}