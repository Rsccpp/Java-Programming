package Packages.MyPackage2;

public class Z extends Demonstration5.Packages.MyPackage1.X {
    Z(){
        System.out.println("I am constructor from class Z: ");
        // System.out.println("n from Z " + n);        // Error  -- Default not accessible outside its package
        // System.out.println("p from Z "+ p);         // Error -- Private
        System.out.println("q from Z "+ q);         // Protected member is accessible by inheritance
        System.out.println("r from Z "+ r);          // public is accessible
    }
    
}
