package Nptel;
import java.util.*;

// Programming Question 3  -- Multiplication table of a given number upto 5
// public class Week1 {
//      public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);

//           int number = sc.nextInt();

//           // Printing Multiplication table
//           for(int i=1; i<=5; i++) {
//             int ans = i * number;

//             System.out.println(number + " * " + i + " = " + ans);
//           }
//      }
// }

// Programming Question 4 -- Quotient and Remainder of entered numbers

// public class Week1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int quo = num1 / num2;
//         int remain = num1 % num2;

//         System.out.println("The Quotient is = " + quo);
//         System.out.println("The Remainder is = " + remain);

//         sc.close();
//     }
// }

// Programming Question 5 -- Pattern 

// public class Week1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // Pattern loop
         
//         // For upper part
//         for(int i=n; i>1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // System.out.println();
//         // For Lower part
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// Output n = 3
// ***
// **
// *
// **
// ***