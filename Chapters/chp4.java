// import java.lang.*;
// import java.util.*;

// Java Runtime Data Input types

// 1. Input with Command line 

// Program1
// public class chp4 {

//     public static void main(String[] args){
//         for(int i=0; i<args.length; i++){
//             System.out.print(args[i] + " ");
//             System.out.println();
//         }
//         System.exit(0);
//     }
// }

// Program-2
// public class chp4 {

//     public static void main(String[] args){
//         System.out.print("Hi, ");
//         System.out.print(args[0]);
//         System.out.println(", How are you?");
//     }
// }

// Program-3

// class Calculator {
//     double i;
//     double x;
//     void calculateSquareRoot(){
//          x = Math.sqrt(i);
//     }
// }
// public class chp4 {
//       public static void main(String[] args){
//         Calculator a = new Calculator();
//         a.i = Integer.parseInt(args[0]);
//         a.calculateSquareRoot();

//         System.out.printf("Square root of " + a.i +  " is "+ "%.5f%n ", a.x);                   // Square root of 5.0 is 2.23607
//       }
    
// }


// 2. Input with Scanner Class
import java.util.*;

// Program-1

// public class chp4 {
//    public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);    
//          System.out.println("Enter number: ");

//          int num = sc.nextInt();
//          if(num % 2 == 0){
//             System.out.println(num + " is Even.");
//          }
//          else{
//             System.out.println(num + " is Odd.");
//          }
//    }   
// }

// Scanner with Array

// Program-2
// public class chp4 {
//     public static void main(String[] args){
//         int sum = 0;
//         float avg = 0;
        
//         ArrayList <Integer> l = new ArrayList<Integer>();

//         System.out.println("Enter the input: ");
//         Scanner sc = new Scanner(System.in);

//         while(sc.hasNextInt()) {
//               l.add(sc.nextInt());
//         }
         
//         for(int i=0; i<l.size(); i++){
//             sum += l.get(i);
//         }

//         avg = sum / l.size();
//         System.out.println("Average: " + avg);
        
//     }
    
// }


// 3. Input with DataInputStream
import java.io.*;
// Program - 1

public class chp4 {
     public static void main(String[] args){
        try {
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("Enter number: ");
            int num = Integer.parseInt(in.readLine());
            System.out.println("Entered Number: " + num);

        } catch(IOException e) {
            System.out.println("Error reading Input.");
        }  
     }  
}
















