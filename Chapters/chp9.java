package Chapters;
import java.io.*;

// ***************************  JAVA Input / Output  STREAM  **************************** 

// * Stream : Java treats flow of data as stream. 
                     
            //          Stream
            //         /      \
            // Input stream     Output stream

// * Stream supported by java.io 

// * Reading  - Source to Program
// * Writing - Program to Source

// *                              I-O stream classes
//                      /                                \
//     Byte stream classes                                 Character stream classes
// (Support for handling I/O operations on bytes)          (Support for handling I/O operations on Characters)


// * Byte stream classes  -- Input(used for reading) and Output(used for writing) stream class 
// * Character stream classes -- Reader and Writer class


// Example: Get input using DataInputStream class
// Calculator Program

// public class chp9 {

//     public static void main(String[] args){
//         Float principalAmount = new Float(0);
//         Float rateOfInterest = new Float(0);
//         int numberOfYears = 0;

//         try {
//         DataInputStream in = new DataInputStream(System.in);
//         String tempString;

//         System.out.println("Enter Principal Amount: ");
//         System.out.flush();
//         tempString = in.readLine();
//         System.out.flush();
//         principalAmount = Float.valueOf(tempString);

//         System.out.println("Enter Rate of Interest: ");
//         System.out.flush();
//         tempString = in.readLine();
//         rateOfInterest = Float.valueOf(tempString);

//         System.out.println("Enter Number of Years: ");
//         System.out.flush();
//         tempString = in.readLine();
//         numberOfYears = Integer.parseInt(tempString);

//         // Input is over: Calculate the interest

//         float interestTotal = (principalAmount * rateOfInterest * numberOfYears) / 100;
//         System.out.println("Total Interest = "+ interestTotal);

//        }
//        catch(IOException e){
//         System.out.println("Error reading Input.");
//        }
//     }
// }


// ************** Java File I/O  *************** 
// * Four major classes--
// 1.File
// 2.FileInputStream
// 3.FileOutputStream
// 4.RandomAccessFile

// **** Opening a File object 
// File myFile ; 
// Way 1:   myFile = new File(fileName)
// Way2:    myFile = new File(pathName, filename)
// Way3:    myFile = new File(myDir, fileName)


// **** Dealing with file names
// String getName()
// String getPath()
// String getAbsolutePath()
// String getParent()
// String renameTo(File newFilename)

// *** Testing a file
// boolean exists()
// boolean canWrite()
// boolean canRead()
// boolean isFile()
// boolean isDirectory()
// boolean isAbsolute()

// ** Getting file information
// long lastModified()
// long length()
// boolean delete()

// ** Directory utilities
// boolean mkDir(File newDir)
// boolean mkDir(File newDir)
// String [] list()


// Using Class File: An Example
import java.io.File;

// public class chp9 {
    
//     public static void getPaths (File f) throws IOException{
//         System.out.println("Name :" + f.getName());
//         System.out.println("Path : " + f.getPath());
//         System.out.println("Parent : " + f.getParent());
//     }

//     public static void getInfo (File f) throws IOException{
//                if(f != null) {
//                 System.out.println("File exists");
//                 System.out.println(f.canRead() ? " and is readable" : "");
//                 System.out.println(f.canWrite() ? " and is writable" : "");
//                 System.out.println("File is last modified : " + f.lastModified());
//                 System.out.println("File is " + f.length() + "bytes long");
//                }
//                else 
//                  System.err.println(" File does not exist.");
//     }
//     public static void main(String[] args){
//         File fileToCheck;

//         if(args.length > 0){
//               for(int i=0; i<args.length; i++){
//                 fileToCheck = new File(args[i]);
//                 getPaths(fileToCheck);
//                 getInfo(fileToCheck);
//               }
//         }
//         else 
//           System.out.println("Usage: Java file test <filename>");
//     }
// }


// Example: class FileInputStream

public class chp9 {

    public static void main(String[] args){
        int size;

        // To open a file stream
        FileInputStream fin;
        fin = new FileInputStream(" C:\WINDOWS\SYSTEM\SYSTEM.INI ");
        size = fin.available();

        // returns the number of bytes available
    }
}