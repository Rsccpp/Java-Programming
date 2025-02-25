package Demonstration5.Packages.MyPackage1;

class A {              // class with default protection
    A(){
        X x = new X();
        System.out.println("Same package constructor...");
        System.out.println("n from A " + x.n);
        //Default variable is accessible in the same package
        // System.out.println("p from A " + x.p);  // Error
        System.out.println("q from A "+ x.q);   // Error protection
        System.out.println("r from A "+ x.r);
    
    }

}
