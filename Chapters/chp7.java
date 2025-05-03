package Chapters;

// Exception handling
import java.io.DataInputStream;
import java.lang.*;

// 1. Errors in Java
// i. Compile time error    ii. Run time error

// 2. Errors and Exception in Java

//          Throwable

//    /                  \        
// Error                     Exception
//   /        \               //   /              \
// CTE       RTE                IO Exception            Runtime Exception

// 3. Exception handling is maintained by--
// try ()   -- Statements that may cause exceptions
// catch ()   -- statements that handle the exceptions
// throw      -- exception object
// throws    -- To declare exceptions that a method can throw
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

//     public static void main(String[] args) {
//         int x = 5, y = 1000;

//         try {

//             float z = (float) x / (float) y;
//             if (z < 0.01)
//                 throw new myException("Given data are not proper");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         } finally {
//             System.out.println("It prints always!");
//         }
//     }
// }

// 5. throws in try-catch

// Syntax :

// type method-name(parameter-List) throws exception-List {
// // body of method
// }

// exception-list = comma-separated list of the exceptions that a method can
// throw

// Example
// import java.io.DataInputStream;

// public class chp7 {

// public static void main(String[] args) throws Exception {
// double principleAmount = 0.0;
// double rateOfInterest = 0.0;
// int numberOfYears = 0;

// try{
// DataInputStream in = new DataInputStream(System.in);
// String tempString;

// // Principal Amount
// System.out.println("Enter Principal Amount: ");
// System.out.flush();
// tempString = in.readLine();
// principleAmount = Float.valueOf(tempString);

// // rateOfInterest
// System.out.println("Enter Rate of Interest: ");
// System.out.flush();
// tempString = in.readLine();
// rateOfInterest = Float.valueOf(tempString);

// // Number of Years
// System.out.println("Enter Number of Years: ");
// System.out.flush();
// tempString = in.readLine();
// numberOfYears = Integer.parseInt(tempString);

// // Total interest

// double interestTotal = principleAmount*rateOfInterest*numberOfYears;
// System.out.println("Total interest = " + interestTotal);
// }
// catch(Exception e){
// System.out.println(e); // Detailed -- java.lang.NumberFormatException: empty
// String
// }
// }
// }

// * Nested try-catch

// public class chp7 {

// public void printStackTrace() {};
// public static void main(String[] args){
// try{
// // catch divide-by-zero
// int a = args.length;
// int b = 34/a;

// // divide-by-zero exception
// System.out.println("a = " + a);

// if(a==1){
// a = a/(a-a);
// }

// // another divide-by-zero exception
// try{
// if(a==2){
// int c[] = {1};
// c[a] = 99;
// }

// }
// catch(ArrayIndexOutOfBoundsException e){
// System.out.println("Array index out-of-bounds: \n " + e);
// }
// }
// catch(ArithmeticException e){

// Exception methods

// System.out.println("Divide by 0: " + e.getMessage()); // Divide by 0: / by
// zero
// System.out.println("Divide by 0: " + e.getCause()); // Divide by 0: null
// System.out.println("Divide by 0: " + e.toString()); // C:\Users\rohit\Java
// Journey\chp7.java

// }

// }
// }

// * Exception classes in Java.lang.Throwable

// object

// |
// Throwable
// Error Exception
// RuntimeException

// * Own Exception
import java.io.*;

// InsufficientFundsException
// class InsufficientFundsException extends Exception {
// private double amount;
// public InsufficientFundsException(double amount){
// this.amount = amount;
// }

// public double getAmount(){
// return amount;
// }
// }

// CheckingAccount

// class CheckingAccount {
// private double balance;
// private int number;
// public CheckingAccount(int number){
// this.number = number;
// }

// public void deposit(double amount){
// balance += amount;
// }

// public void withdraw(double amount) throws InsufficientFundsException {
// if(amount <= balance){
// balance -= amount;
// }
// else {
// double needs = amount - balance;
// throw new InsufficientFundsException(needs);
// }
// }

// public double getBalance() {
// return balance;
// }

// public int getNumber(){

// return number;
// }
// }

// Main class
// public class chp7 {

// public static void main(String[] args){
// CheckingAccount c = new CheckingAccount(101);

// System.out.println("Depositing $500");
// c.deposit(500.0);

// try{

// System.out.println("\nWithdrawing $100");
// c.withdraw(100);
// System.out.println("Withdrawing $600");
// c.withdraw(600);
// }
// catch(InsufficientFundsException e){
// System.out.println("Sorry, but you are short $ " + e.getMessage());
// e.printStackTrace();
// }
// }
// }

// * Program with Scanner and array
import java.util.*;

public class chp7 {

    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;

        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Input: ");
        while (input.hasNextInt()) {
            l.add(input.nextInt());
        }

        for (int i = 0; i < l.size(); i++) {
            sum = sum + l.get(i);
        }

        avg = sum / l.size();
        System.out.println("Average : " + avg);
    }
};

// Enter Ctrl+Z to stop scanning