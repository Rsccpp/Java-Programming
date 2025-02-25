// Exception handling
import java.lang.*;
// 1. Errors in Java
// i. Compile time error    ii. Run time error

// 2. Errors and Exception in Java

            //          Throwable

            // Error                     Exception

            //                   IO Exception            Runtime Exception


// 3. Exception handling is maintained by--
// try ()   -- Statements that may cause exceptions
// catch ()   -- statements that handle the exceptions
// throw      -- exception object
// throws  
// finally()  -- statement that execute on exit of the exception handling


// Exception handling in Java

// 1. Simple try-catch 


// public class chp7 {

//     // static int anyFunction (int x, int y){
//     //     // int a = x/y;
//     //     // return (a);
//     // }
   
    
//     public static void main (String[] args){
//         // int result = anyFunction(25, 0);            // Exception occurs as y=0
//         // System.out.println("Result : " + result);

//        // try-catch
//        int a = 10, b=5, c=5;
//        int x, y;

//        try {
//         x  = a/(b-c);
//        }
//        catch (ArithmeticException e) {
//         System.out.println(" b = c: Divide by zero....!");
//        } 

//        y = a / (b+c);
//        System.err.println(" y = "+ y);
//     }
// }


// Example-2

// public class chp7 {

//     public static void main (String[] args){
//         int num;
//         for(int i=0; i<args.length; i++){
//             num = Integer.parseInt(args[i]);
//             System.out.println("Number at " + i + args[i]);
//         }
//     }
// }

// try-catch

// public class chp7 {

//     public static void main (String args[]){
//         int num, InvalidCount = 0, ValidCount = 0;

//         for(int i=0; i<args.length; i++){
//             try{
//                 num = Integer.parseInt(args[i]);
//             } catch(NumberFormatException e) {
//                 InvalidCount++;
//                 System.out.println("Invalid number at " + i + " " +  args[i]);
                
//             }
//             ValidCount++;
//             System.out.println("Valid number at " + i + " " +  args[i]);
              
//         }

//         System.out.println("Invalid entries: " + InvalidCount);
//         System.out.println("Valid entries: "+ ValidCount);
//     }
// }

// 2. try with Multiple catch

// public class chp7 {

//     public static void main (String[] args){
//         int i = args.length;
//         String[] mString = new String[i];             // NullPointerException

//         try {
//             if(args[0].equals("Java"));
//                      System.out.println("First word is Java !");
//             System.out.println("Number of arguments = " + i);
//             int x = 10/i;

//             System.out.println(" x = 10/i  is " +  x);

//             int y[] = {555, 999};
//             y[i] = x;
//         }
//         catch(NullPointerException e){
//             System.out.println("Enter to show.....");
//         }

//         catch(ArithmeticException e){
//             System.out.println("Entered something...");
//         }
        
//         catch(IndexOutOfBoundsException e){
//             System.out.println("Indexout of bound");
//         }
//     }
// }


// 3. Multiple Errors with single catch
// public class chp7 {

//     static int j;
//     public static void main(String[] args){
//         for(int i=0; i<4; i++){
//             try{
//                 switch (i) {
//                     case 0:
//                         int zero = 0;
//                         j = 888/zero;      // Divide by zero
//                         break;
                  
//                     case 1:
//                          int b[] = null;
//                          j = b[0];         // Null pointer error
//                          break;
                    
//                     case 2: 
//                         int[] c = new int[2];
//                         j = c[10];         // Array index is out-of-bound
//                         break;

//                     case 3:
//                         char ch = "Java".charAt(9);  // String index is out-of-bound
//                         break; 
                   
//                 }
//             }
//             catch (Exception e){
//                 System.out.println("In Test case: " + i + "\n");
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }


// 4. Finally in try-catch

// public class chp7 {

//     public static void main(String[] args){
//         int i=0;
        
//         String greeting[] = {"Hello World!", "Hello Java!", "Hello World!"};
//         while (i<4) {
//             try{
//                 System.out.println(greeting[i++]);
//             }
//             catch(Exception e){
//                 System.out.println(e.toString());       // Exception message in string format
//             }

//             finally{
//                 System.out.println("You should quit and reset index value < 3 :");
//             }
//         }
//     }
// }


// 5. throw in try-catch

// class myException extends Exception {
//     myException(String message){
//         super(message);
//     }
// }

// public class chp7 {

//     public static void main(String[] args){
//         int x=5, y = 1000;

//         try{
//             float z = (float)x / (float)y ;
//             if(z < 0.01) throw new myException("Given data are not proper");
//         }
//         catch (Exception e){
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("It prints always!");
//         }
//     }
// }


// throws in try-catch

// Syntax :

//   type method-name(parameter-List) throws exception-List {
//      // body of method
//   }

// exception-list = comma-separated list of the exceptions that a method can throw

