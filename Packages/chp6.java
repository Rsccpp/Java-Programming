package Packages;
// Two unique features in Java
// 1. Packages
// 2. Interfaces


// Using API packages
// import java.util.Date;

// public class chp6 {

//     public static void main(String[] args){
//         //    java.util.Date today = new java.util.Date();
//         //    System.out.println(today);

//         Date today = new Date();
//         System.out.println(today);
//     }
// }


// User defined packages: 
// import Nptel.Packages.myPackage;

// public class chp6 {

//     public static void main(String[] args){
//         myPackage theClass = new myPackage();
//         theClass.test();
//     }
// }


// Access Protection
//                                    Private          No Modifier        Protected          public
// Same class                            Yes              Yes                Yes              Yes
// Same package subclass                 No                Yes               Yes              Yes  
// Same package non-subclass             No                Yes                Yes             Yes
// Different package subclass            No                No                 Yes             Yes
// Different package non-subclass        No                 No                 No             Yes


