package Demonstrations.Demonstration2;
// Demonstration: 
// 1. Use of print(), printf(), println()
// 2. Command line input in Java (chp4)
// 3. Input using Scanner class (chp4)
// 4. Input using DataInputStream (chp4)

// Program-1 Print's

// public class Demonstration2 {
//     public static void main(String[] args){
//         float n = 89.4f;
        
//         System.out.println("n = " + n);               // Move cursor to the next line
//         System.out.print("n = " + n);                 // Did not move cursor to the next line
//         System.out.println();
//         System.out.printf("n = %.6f", n);
//     }
// }
// o/p -- 
// n = 89.4
// n = 89.4
// n = 89.400002

// Program-2    Command Line inputs
// public class Demonstration2 {
//     public static void main(String[] args){
//         if(args.length > 0) {
//             System.out.println("The command line" +
//                                   " arguments are:");

//             for(String val : args){
//                 System.out.println(val);
//             }
//         }
//         else{
//             System.out.println("No command line" +
//                                 "arguments found.");
//         }
//     }   
// }
// O/p--
// The command line arguments are:
// Hello
// Java
// world

// Program-3 Command line input
// public class Demonstration2 {
//         public static void main(String[] args){
//             int i = 0;
//             i = Integer.parseInt(args[0]);
//             System.out.println("The valud of i in Integer is " + i);

//             // }
//             // Caused Error: java.lang.ClassNotFoundException: Demonstration
//             //     System.out.println(args[0] + " ");
//             //     System.exit(0);
//         }
// }