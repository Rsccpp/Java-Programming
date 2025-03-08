package Chapters;
// Basics and Strings

import java.util.*;
import java.io.*;

// public class  chp1 {              // File name

//     public static void main (String [] args) {
         
        //  int a = 10;
        //  int b = 20;
        //  int c = a + b;

        //  System.out.println(c);

        //  String str = new String("Hello World");
        //  System.out.println(str);

        //  // Array
        //  int[] arr = new int[3];
        //  arr[0] = 97;
        //  arr[1] = 98;
        //  arr[2] = 99;
         
        //  System.out.println(arr[0]);

        // HomeWork Problem

        // 1. Find area area of circle

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the radius of a Circle: ");

        // int radius = sc.nextInt();

        // double area = 3.14 * radius * radius;
        // System.out.println("The area of the circle is: " + area);

        // 2. Print Table
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
        
//         System.out.println("The table of " + num + " is : \n");

//         for(int i = 1; i<=10; i++) {
//             int pr = num * i;

//             System.out.println( num + " * " + i + " = " + pr);
//         }
//     }
  
// }


// Strings -- Java Strings are immutable

// public class chp1 {

//    public static void main(String[] args){
        // Declaration : 
        // String name = "Tony";


        // Taking Input:
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // System.out.println("Entered name: " + name);                  // Entered name: Raunak

        // Concatenation of String
        
        // String firstname = "Tony";
        // String lastname = "Stark";

        // String fullname = firstname + ' ' + lastname;                  // Tony Stark
        // System.out.println(fullname);
       
        // Length of String
        // System.out.println(fullname.length());                         // 10

        // Access characters of a String
        // for(int i=0; i<fullname.length(); i++){
        //         System.out.print(fullname.charAt(i) + " ");           // T o n y   S t a r k        
        // }


        // Compare 2 strings                        // They are different strings

        // if(firstname.equals(lastname)){
        //         System.out.println("They are the same string.");
        // } else {
        //         System.out.println("They are different strings");
        // }

        
        // Do not use == to check for string equality
        
        // Gives correct answer here                                  // They are different strings
        // if(firstname == lastname){
        //         System.out.println("They are the same string.");
        // } else {
        //         System.out.println("They are different strings");
        // }

        // Gives incorrect answer here                             // They are different strings
        // if(new String("Tony") == new String("Tony") ) {
        //         System.out.println("They are the same string");
        // } else {
        //         System.out.println("They are different strings");
        // }


        // Substring

        // String name = "Tony Stark";
        // System.out.println(name.substring(0, 4));             // Tony

        // ParseInt Method of Integer class
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println((number));


        // ToString Method of String class
        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str.length());                              // 3
        // System.out.println(str.getClass().getName());                  // java.lang.String
    
//    }
// }



// Problems:

// 1. Take an array of Strings input from user & find the cummulative(combined) length of all those strings.

// public class chp1 {

//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);

//                 String arr[] = new String[4];
//                 int toLength = 0;

//                 for(int i=0; i<arr.length; i++){
//                        arr[i] = sc.next();
//                        toLength += arr[i].length();  
//                 }
//                 System.out.println(toLength);
//         }
// }
// Output
// Rqa
// jaj
// aj
// jakl
// 12

// 2. Input a string from the user . Create a new string called 'result' in which you wil replace the letter 'e' in the original string with letter 'i'.
// original= "eavakj" result="iavakj"

// public class chp1 {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter string : ");

//                 // String str = sc.next();                  // Take only first string
//                 String str = sc.nextLine();                  // Take full string
//                 String result = " ";

//                 for(int i=0; i<str.length(); i++){
//                     if(str.charAt(i) == 'e'){
//                        result += 'i';
//                     }
//                     else {
//                         result += str.charAt(i);
//                     }
//                 }
//                 System.out.println("Entered string: " + str);
//                 System.out.println("Modified string: " + result);
//         }
// }

// Entered string: Rohet Sengh
// Modified string:  Rohit Singh


// 3. Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'

public class chp1 {

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter email: ");

                String email = sc.next();
                String userName = " ";

                for(int i=0; i<email.length(); i++){
                        if(email.charAt(i) == '@'){
                                break;
                        }
                        else {
                                userName += email.charAt(i);
                        }
                }
                System.out.println("Entered Email: " + email);
                System.out.println("Usename: " + userName);

        }
}
// Entered Email: rohitsingh@gmail.com
// Usename:  rohitsingh