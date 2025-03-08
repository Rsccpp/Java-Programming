package Demonstrations.Demonstration3;
// Demonstration :

// 1. Program to demonstrate loop control using
//         1. While loop 
//         2. Do-while loop 
//         3. For loop
//         4. Loop with continue statement
//         5. Loop with break statement
//         6. Example of recursion (chp5)

// 2. Programs to demonstrate scope of Variables
// 3. Programs in Java with recursion


// 1. While loop
// public class Demonstration3 {

//     public static void main(String[] args){
//         int count = 1;
//         while (count <= 10) {
//             System.out.print(" " + ((2*count)-1));                         // 1 3 5 7 9 11 13 15 17 19
//             count++;
//         }
//     }
// }


// 2. Do-while loop
// public class Demonstration3 {

//     public static void main(String[] args){
//         int count = 1;
//         System.out.println("Printing first 10 even numbers:");

//         do {
//             System.out.print( " " + 2*count);                      // 2 4 6 8 10 12 14 16 18 20
//             count++;
//         } while(count < 11);
//     }
// }


// 3. For loop
// public class Demonstration3 {

//     public static void main(String[] args){
        
//         for(int i=1; i<=10; i++){
            
//             System.out.print(" " + i);                     // 1 2 3 4 5 6 7 8 9 10
//         }
//     }
// }


// 4. Loop example with continue
// public class Demonstration3 {
//     public static void main(String[] args){
//         for(int i=0; i<10; i++){
//             System.out.print(i + " ");
//             if(i%2 == 0) continue;
//             System.out.println(" ");
//         }
//     }  
// }


// 5. Loop example with break
public class Demonstration3 {
    public static void main(String[] args){

        System.out.println("i: ");
        for(int i=1;  ; i++){
            if(i%10 == 0) break;           // terminate the loop
            System.out.print(" " + i);    // 1 2 3 4 5 6 7 8 9
        }
        System.out.println();
        System.out.println(" Loop complete.");
    }
    
}