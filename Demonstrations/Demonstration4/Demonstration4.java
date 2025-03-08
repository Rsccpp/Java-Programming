// Demonstration4: 

// 1.Example of default access modifier. 
// 2.Example of public access modifier. 
// 3.Example of private access modifier. 
// 4.Example of protected access modifier. 
// 5. Java access modifiers with method overloading. 
// 6. Example of access modifiers: default, public, private and protected. 

// 1. Example of default access modifier.

package Demonstrations.Demonstration4;

class A {
    void msg() {
        System.out.println("Hi I am in class A");
    }
}

public class Demonstration4 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}