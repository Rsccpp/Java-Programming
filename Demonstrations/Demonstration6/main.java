package Demonstrations.Demonstration6;
// import Demonstration6.myInterface.anInterface;

//1.  A class that implement Interface
// public class main implements anInterface{
//     public void display(){
//         System.out.println("Fine!");
//     }

//     // Main method
//     public static void main(String[] args){
//         main m = new main();
//         m.display();
//         System.out.println("The final value a in myInterface " + a);
//     }
// }


// 2. Attempting to create an object of interface

// 1. modifier for the interface field only public, static & final are permitted
// 2. modifiers for the interface method  only one of abstract, default, or static permitted

// interface C {
   
//     public static final double PI = 3.14134; // OK
//     static final double lambda = 0.04; // OK public is implicit

//   int a;          // Error : variable cannot be declare
//   int a = 10;        // Ok

//   private static final int p = 90;    // Error: private/ protected is Not allowed

//   abstract public static void method(); // static method is not allowed

    // public void methodC2();  // Error 
//    void methodC2();      // public abstract by default

// }

// class A1 implements C {
//     public int a1 = 89;
//     public void methodC1(){
//         System.out.println("From C " + PI);
//     }

//     public void methodC2(){
//        System.out.println("Again from C " + lambda);
//     }
// }

// public class main {
//     public static void main(String[] args){
//         // C c = new C();     // Error: Object cannot be instantiated
         
//         C c2;  // ok: declaration of object is possible
//         C c3[] = new C[3]; // This is also possible -- array of objects for an interface is permitted.

//         A1 a = new A1();
//         a.methodC1();
//         a.methodC2();
//     }
    
// }


// 3. 
// We have learnt that a class must implements an interface and the class will be used as normal class,
// However the reverse is not true. That, is an interface cannot be implement another interface

// interface T1 {
//     public static int i = 666;
//     void printInterface();
// }

// The following code is invalid

// interface T2 implement T1 {     // Error

// }

// Valid
// interface T2 extends T1 {

// }

// class I2 implements T1 {
//   public static int j = 456;
// //   void printInterface(){                 // Error: Cannot reduce the visibility of the inherited method from T1
    
//     public void printInterface(){ 
//         System.out.println( "Geek!");
//     }
// }


// 4. An interface acts like a class , i.e. we can do everything as we do with class except the object creation 
// interface A {
//     void method1();
// }

// interface B extends A {
//     void method2();
// }

// class MyClass implements B {
//    public  void method1(){
//        System.out.println("Method1");
//    }
//    public void method2() {
//        System.out.println("Method2");
//    }
// }


// public class main {
//   public static void main(String[] args) {
//     MyClass obj = new MyClass();
//     obj.method1();
//     obj.method2();
//   }
   
// }


// 5. An interface is a significant feature in Java in the sense that
// Case 1: Example of class which implements two interfaces


interface T1 {
    int i = 123;
    void printT1();
}

interface T2 {
    public static int j = 456;
    void printT2();
}

class A implements T1, T2 {
    public int aValue = 999;

    public void printT1() {
        System.out.println("I am from T1 " + i);
    }

    public void printT2(){
        System.out.println("I am from T2 " + j);
    }

    public void printA(){
        System.out.println("I am from A " + (aValue = i+j));
    }
}

interface I {
    public static int i = 888;
    void printInterface();
}

class B extends A implements I {
    public int aValue = 999; 

    public void printInterface(){
        System.out.println("I am from I " + aValue);
    }
    
    A a = new A();
    public void printA(){ 
        a.printT1();
        a.printT2();
        a.printA();
    }
    public void printB(){
        // super.print();
        printInterface();
    }
}


// Driver code in main class
public class main {

    public static void main(String[] args) {
        B b = new B();
        b.printB();
        b.printA();
    }
}