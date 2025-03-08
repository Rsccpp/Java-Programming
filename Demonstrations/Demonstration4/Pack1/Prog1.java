package Demonstrations.Demonstration4.Pack1;

// Demonstration4: 

// 1.Example of default access modifier. 
// 2.Example of public access modifier. 
// 3.Example of private access modifier. 
// 4.Example of protected access modifier. 
// 5. Java access modifiers with method overloading. 
// 6. Example of access modifiers: default, public, private and protected. 

// 1. Example of default access modifier.

// class A {
//     void msg() {
//         System.out.println("Hi I am in class A");
//     }
// }


// public class Prog1 {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.msg();                                           // Hi I am in class A
//     }
// }


// 2. Different Folder
// import Demonstration4.Pack2.*;

// public class Prog1 {
//     public static void main(String[] args) {
//         Prog2 obj = new Prog2();                                     // Throw error without package use
//         obj.msg();                                           // Hi I am in class A
//     }
// }


// Public access modifier
// class A {
//     private int data = 10;
//     public void msg(){
//          System.out.println("Class A: Hello Java " + data);
//     }
// }

// public class Prog1 {

//     public static void main(String[] args){
//         A obj = new A();
//         // System.out.println(obj.data);                       // OK: data is public/protected/default
//         // System.out.println(obj.data);                       // Error: data is private 
//         obj.msg();                                          // OK: msg is public             or Private data member can be accessed with the help of public method
//     }
// }



// Private Constructor

// class A {
//     // public A(){                                         // ok: public constructor

//     // }

//     // private A(){ }                                         // Error: 
//     // protected A(){ }                                       // OK: protected constructor
//     A() { }                                                   // OK: Default constructor
//     void msg(){
//         System.out.println("Class A");
//     }
// }

// public class Prog1 {
//         public static void main(String[] args){
//             A obj = new A();                                 
//             obj.msg();
//         }
    
// }


// * In main function there is no any access modifiers of data member
// public class Prog1 {

//     public static void main(String[] args){
//         // public int data2 = 90;                           // Error
//         int data2 = 89;                                  // OK
//     }
// }


// Example -- Access modifier in class hierarchy

// Superclass

class A {
    int i;
    // private int j;                   // Not accessibel
    protected int j;                    // Accessible

    void setij(int x, int y){
        i = x;
        j = y;
    }
}

// Subclass
class B extends A {
    int total;
    int  msg() {
        return (total = i+j);
    }
}
public class Prog1 {
   public static void main(String[] args){
    B obj = new B();
    obj.setij(46, 56);
    
    int n = obj.msg();
    System.out.println("Sum : " + n );
   }
     
}