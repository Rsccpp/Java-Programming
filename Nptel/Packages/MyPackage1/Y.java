package Nptel.Packages.MyPackage1;
import Demonstrations.Demonstration5.Packages.MyPackage1.*;;

public class Y extends X {
    Y(){
        System.out.println("I am constructor from class Y:");
        System.out.println("n = " + n);
        // System.out.println("p = " + p);        // p is private not accessible
        System.out.println("q = " + q);
        System.out.println("r = " + r);
    }
}
