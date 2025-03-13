package Chapters;
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
import java.io.*;

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
// import java.io.*;
// public class chp9 {

//     public static void main(String[] args)  {
//         int size;

//         // To open a file stream
//         try {
//         FileInputStream fin;
//         fin = new FileInputStream(" C:\\WINDOWS\\SYSTEM\\SYSTEM.INI ");
//         size = fin.available();

//         // returns the number of bytes available
//         System.out.println("Total bytes :: " + size);
//         System.out.println("First 1/4 is displayed : Using read()");
        
//         for(int i=0; i< size/4; i++){
//             System.out.println((char) fin.read());
//         }

//         System.out.println("Remaining bytes :" + fin.available());
//         System.out.println("Next 1/4 is displayed : Using read(b[])");
//         byte b[] = new byte[size/4];

//         if(fin.read(b) != b.length)
//           System.out.println("File reading error : ");
//         else {
//             //Convert the bytes into string
//             String temp = new String(b, 0, b.length);
//             // display text string
//             System.out.println(temp);
//             System.out.println("Still available : " + fin.available());
//             System.out.println("skipping 1/4 : Using skip ()");
//             fin.skip(size/4);
//             System.out.println("File remaining for read ::" + fin.available());
            
//         }
//         fin.close();
//     }
//     catch (FileNotFoundException e){
//         System.out.println("File not found" + e.getMessage());
//     }
//     catch (IOException e) {
//         System.out.println("An I/O error occurred: " + e.getMessage());
//     }
// }
// }
// o/p : ile not found C:\WINDOWS\SYSTEM\SYSTEM.INI  (The filename, directory name, or volume label syntax is incorrect)


// Example : Writing bytes into file

// import java.io.*;
// public class chp9 {

//     public static void main(String[] args){
        
//         byte[] cities = {'D', 'E', 'L', 'H', 'I', '\n', 'R', 'A', 'I', 'P', 'U', 'R', '\n'};
//         FileOutputStream outfile = null;
//         try {
//             outfile = new FileOutputStream("city.txt");
//             outfile.write(cities);
//             outfile.close();
//         }
//         catch(IOException e){
//             System.out.println("An I/O error occurred: " + e.getMessage());
//             System.out.println(-1);
//         }
//     }
// }


// Example : Reading bytes from file

// import java.io.*;
// public class chp9 {

//     public static void main(String[] args){
//         FileInputStream infile = null;
//         int b;
//         try{
//             infile = new FileInputStream("city.txt");
//             while ((b = infile.read()) != -1){
//                 System.out.print((char) b );
//             }
//             System.out.println();
//             infile.close();
//         }
//         catch(IOException ioe){
//            System.out.println(ioe);
//         }
//     }
// }
// O/p : DELHI
        // RAIPUR



// Example: Reading / Writing characters

// Copying characters from one file to another
// import java.io.*;

// public class chp9 {

//     public static void main(String[] args) {
//         // Declare and create input and output files
//         File inFile = new File ("input.txt");
//         File outFile = new File ("output.txt");

//         FileReader ins = null; // Creates file stream ins
//         FileWriter outs = null; // Creates file stream outs

//         try{
//             // Opens infile & outfile
//             ins = new FileReader(inFile);
//             outs = new FileWriter(outFile);
            
//             int ch;  
//             while ((ch = ins.read()) != -1){
//                  outs.write(ch);
//             }
//         }
//         catch(IOException e){
//             System.out.println(e);
//             System.out.println(-1);
//         }
//         finally{
//             try {
//                 ins.close();
//                 outs.close();
//             }
//             catch(IOException e) {}
//         }
//     }
// }


// Example: Copying bytes from one file to another
// import java.io.*;

// public class chp9 {

//     public static void main(String[] args){
//         FileInputStream infile = null;
//         FileOutputStream outfile = null;
//         byte byteRead;

//         try {
//             infile = new FileInputStream("in.dat");
//             outfile = new FileOutputStream("out.dat");

//             do{
//                 byteRead = (byte) infile.read();
//                 outfile.write(byteRead);
//             }
//             while(byteRead != -1);
//         }
//         catch(FileNotFoundException e){
//             System.out.println("File not found");
//         }
//         catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//         finally {
//             try{
//                 infile.close();
//                 outfile.close();
//             }
//             catch(IOException e) {}
//         }
//     }
// }


// Example: Storing and Reading data
// import java.io.*;
// public class chp9 {

//     public static void main(String[] ars) throws IOException{
//         File primitive = new File("prim.dat");
//         FileOutputStream fos = new FileOutputStream(primitive);
//         DataOutputStream dos = new DataOutputStream(fos);

//         // Write primitive data to the prim.data file
//         dos.writeInt(1999);
//         dos.writeDouble(123.78);
//         dos.writeBoolean(false);
//         dos.writeChar('Z');
//         dos.close();
//         fos.close();

//         // Read data from prim.data file
//         FileInputStream fis  = new FileInputStream(primitive);
//         DataInputStream dis = new DataInputStream(fis);
//         System.out.println(dis.readInt());
//         System.out.println(dis.readDouble());
//         System.out.println(dis.readBoolean());
//         System.out.println(dis.readChar());

//         dis.close();
//         fis.close();
//     }
// }


// Storing and reading data in same file
// import java.io.*;

// public class chp9 {

//     public static void main(String[] ars){
//         DataInputStream dis = null;
//         DataOutputStream dos = null;
//         File intFile = new File("rand.dat");
        
//         // Writing integers to rand.dat file
//         try{
//              dos = new  DataOutputStream(new FileOutputStream(intFile));
//             for(int i=0; i<20; i++){
//                 dos.writeInt((int) (Math.random()*100));
//             }
//         }
//         catch(IOException ioe){
//             System.out.println(ioe.getMessage());
//         }
//         finally {
//             try{
//                 dos.close();
//             }
//             catch(IOException ioe){}
//         }
//         // Reading integers to rand.dat file
//         try{
//             dis = new DataInputStream(new FileInputStream(intFile));
//             for(int j=0; j<20; j++){
//                 int n = dis.readInt();
//                 System.out.println(n + " ");
//             }
//         }
//         catch(IOException ioe){
//             System.out.println(ioe.getMessage());
//         }
//         finally{
//             try{
//                 dis.close();
//             }
//             catch(IOException ioe){ }
//         }
//     }
// }


// Example: Concatenation and buffering
// import java.io.*;

// public class chp9 {

//     public static void main(String[] args) throws IOException {
//          // Declare file stream
//          FileInputStream file1 = null;
//          FileInputStream file2 = null;
//          SequenceInputStream file3 = null;
         
//          // Open the files to be concatenated
//          file1 = new FileInputStream("text1.dat");
//          file2 = new FileInputStream("text2.dat");
         
//          // concatenate file1 and file2
//          file3 = new SequenceInputStream(file1, file2);

//          // create buffered input and output streams
//          BufferedInputStream inBuffer = new BufferedInputStream(file3);
//          BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

//          //Read and write till the end of buffers 
//          int ch;
//          while((ch = inBuffer.read()) != -1){
//             outBuffer.write((char) ch);
//             inBuffer.close();
//             outBuffer.close();
//             file1.close();
//             file2.close();
//          }
//     }
// }


// RandomAccessFile

// As the name it allows to handle file randomly
// Allows to move file pointer randomly
// Allows read or write simultaneously

// Example : RandomAccessFile

// import java.io.*;
// public class chp9 {

//     public static void main(String[] args){
//         RandomAccessFile file = null;
//         try{
//             file = new RandomAccessFile("rand.txt", "rw");

//             // Writing to the file
//             file.writeChar('A');
//             file.writeInt(789);
//             file.writeDouble(3.14159);
//             file.seek(0);              // Go to the beginning
            
//             // Reading from the file
//             System.out.println(file.readChar());
//             System.out.println(file.readInt());
//             System.out.println(file.readDouble());
//             file.seek(2);
//             System.out.println(file.readInt());

//             // Go to the end and append false to the file
//             file.seek(file.length());
//             file.writeBoolean(false);
//             file.seek(4);

//             System.out.println(file.readBoolean());
//             file.close();
//         }
//         catch(IOException e){
//             System.out.println(e);
//         }
//     }
// }


// Example : Appending to a RAF

// import java.io.*;

// public class chp9 {

//     public static void main(String[] args){
//         RandomAccessFile rfile;

//         try{
//             rfile = new RandomAccessFile("city.txt", "rw");
//             rfile.seek(rfile.length());         // Go to the end
//             rfile.writeUTF("GOA\n");      // Append GOA
//             rfile.close();
//         }
//         catch(IOException e){
//             System.out.println(e);
//         }
//     }
// }


// Example : Interactive input and output

import java.io.*;
import java.util.*;

public class chp9 {

    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(("invent.dat")));

        // Reading from console
        System.out.println("Enter code number: ");
        st = new StringTokenizer(din.readLine());
        int code = Integer.parseInt(st.nextToken());

        System.out.println("Enter number of items: ");
        st = new StringTokenizer(din.readLine());
        int items = Integer.parseInt(st.nextToken());

        System.out.println("Enter cost: ");
        st = new StringTokenizer(din.readLine());
        Double cost = new Double(st.nextToken());

        // Writing to the file "invent.dat"
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);

        // Processing data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("invent.dat"));
        int codeNum = dis.readInt();
        int totalItems = dis.readInt();
        double itemCost = dis.readDouble();

        double toalCost = totalItems * itemCost;
        dis.close();

        // Writing to console
        System.out.println();
        System.out.println("Code Number : " + codeNum);
        System.out.println("Item Cost : " + itemCost);
        System.out.println("Total Items : " + totalItems);
        System.out.println("Total Cost : " + toalCost);
    }
}