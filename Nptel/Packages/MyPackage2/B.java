package Nptel.Packages.MyPackage2;

class B {             // class with default protection
    B(){
        // Create an object of class X
        Demonstrations.Demonstration5.Packages.MyPackage1.X x = new Demonstrations.Demonstration5.Packages.MyPackage1.X();
        System.out.println("I am constructor from class B of MyPackage2");
        // System.out.println("n from B of myPackage2 " + x.n );          // default not accessible in this package
        // System.out.println("p from B of myPackage2 " + x.p);         // Error
        // System.out.println("q from B of myPackage2 " + x.q );        // Error protection
        System.out.println("r from B of myPackage2 " +  x.r);            

    }
}
