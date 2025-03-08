package Demonstrations.Demonstration8;

// 4. Demonstrating thred's stated and inter process communication.
// Data Races

// public class chp8  extends Thread {

//     static int x;
//     public void run(){
//         for (int i=0; i<=500; i++){
//             x = x + 1;
//             x = x - 1;
//         }
//     }

//     public static void main(String[] args){
//         x = 0;
//         for(int i=0; i<=500; i++){
//             new chp8().start();
//             System.out.println(x);                  // x not always 0!
//         }
//     }

// }
