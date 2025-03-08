package Nptel;
// Concept -- Information hiding in Java 

// access Modifiers in Java


// access levels of Modifiers 

// access levels             Class             Packages           Subclass          Everywhere
// \
// Modifiers  

// public                    Yes                Yes                Yes                Yes 
// protected                 Yes                Yes                Yes                No
// Default                   Yes                Yes                No                 No
// private                   Yes                No                 No                 No


// 1. Default access modifiers

// Program-1   Packages
// class a in a.java and class Week3 in Week3.java 

// import Nptel.package1.*;;

// class Week3 {
//     public static void main(String[] args){
//       A obj = new A();
//       obj.msg();                                              // class A is default so it is not accessible from outside package.
//     }
// }


// Program-2     Different sua-class

// class a {
//     void msg() {
//         System.out.println("In class a");
//     }
// }

// class Week3 extends a {
//     pualic static void main(String[] args) {
//         a oaj = new a();                                         // Compile Time Error
//         oaj.msg();                                               
//       }
    
// }

// Program-3 In same directory
// class a {
//     void msg() {
//         System.out.println("In class a");
//     }
// }

// class Week3 {
//     public static void main(String[] args) {
//         a oaj = new a();                                         // Compile Time Error
//         oaj.msg();                                               
//       }
    
// }

// 2. Public access modifier

// Program-1 Packages

// import Nptel.package1.*;

// public class Week3 {
//     public static void main(String[] args){
//       A obj = new A();
//       obj.msg();
//     }
  
// }

// Program-2 Sub-Class

// class top {
//    public int data = 45;
//    void display(){
//     System.out.println("Class: top "); 
//    }
// }
// public class Week3 extends top {
//       public static void main(String[] args) {
//         top t = new top();
//         System.out.println("Data: " + t.data);
//         t.display();
//       }
  
// }

// Program-3 Packages




// 3. Private

// Program-1   Sub-class
// class top {
//   private int data = 45;
//   void display(){
//    System.out.println("Class: top " + data);                   // Private data can be access through methods
//   }
// }
// public class Week3 extends top {
//      public static void main(String[] args) {
//        top t = new top();
//        // System.out.println("Data: " + t.data);                // Compile Time Error: Data is private
//        t.display();                                             // Class: top 45
//      }
 
// }


// Program-2 
// private class top {
//  int data = 45;
//   void display(){
//    System.out.println("Class: top " + data);                   
//   }
// }
// public class Week3 extends top {
//      public static void main(String[] args) {
//        top t = new top();                                    // Compile Time Error: Data is private : IF class is private then data or methods are also private
//        // System.out.println("Data: " + t.data);                
//        t.display();                                             
//      }
 
// }

// Program-3
// class top {
//   private top () {

//   }
//   int data = 45;
//    void display(){
//     System.out.println("Class: top " + data);                   
//    }
//  }
//  public class Week3 extends top {
//       public static void main(String[] args) {
//         top t = new top();                                    // Compile Time Error: Constructor is private  
//         // System.out.println("Data: " + t.data);                
//         t.display();                                             
//       }
  
//  }


// 4. Protected access modifiers

// Applied on -- Data member, method and constructor. 

// Program-1          Same class
// class A {
//     protected int i = 500;
//     protected void display() {
//       System.out.println("Class A: " + i);
//     }
// }

// public class Week3 {
//    public static void main(String[] args){
//       A obj = new A();
//       obj.display();                                 // Class A: 500
//    }
// }

// Program-2     Packages
// import Nptel.package1.*;

// class Week3 extends A {
//   public static void main(String[] args){
//     A obj = new A();
//     obj.msg();
//   }
  
// }


// Java Access modifiers with method overriding
// IF method is protected in super class than it cannot be overriding in sub class.
class A {
  protected void msg(){
    System.out.println("Class A: Hello Java!");
  }
}

public class Week3 extends A {
      // void msg() {                                                // error: msg() in Week3 cannot override msg() in A
      protected void msg() {                                                
        System.out.println("Class B: Welcome!");
      }
  public static void main(String[] args){
    Week3 obj = new Week3();
    obj.msg();
  }
}
