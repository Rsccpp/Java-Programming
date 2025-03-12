package Nptel;

// Assignment 7

// Qno.1 What will be the output of the following Java program
// import java.io.*;

// public class Week7 {

//     public static void main(String[] args) throws IOException{
//           FileReader fr = new FileReader("NPTEL.txt");
//           BufferedReader br =new BufferedReader(fr);
//           System.out.println(br.readLine());
//           br.close();
//     }   
// }
// O/p : This is Programming in Java online course.

// Qno.2 Which of these classes is used to write primitive data types to an output stream in Java?
// a. FileWriter
// b. DataOutputStream
// c. PrintWriter
// d. BufferedOutputStream

// Ans: b. DataOutputStream

//Qno.3 What will the following code print

// import java.io.*;
// public class Week7 {

//     public static void main(String[] args) throws IOException {
//         RandomAccessFile file = new RandomAccessFile("test.dat","rw");
//         file.writeInt(100);
//         file.seek(0);
//         System.out.println(file.readInt());
//         file.close();
//     }
// }
//o/p : 100

// Qno. 4 Complete the following snippet with the required code
// FIle file = new File("file.txt");
// if(_____________)  // fill in the blanks
// {
//     System.out.println("File exists");
// }
// else {
//     System.out.println("File does not exist");
// }
// Ans : file.exists()

//Qno.5 What will the following Java program output
// import java.io.*;
// public class Week7 {
    
//     public static void main(String[] args) throws IOException {
//         ByteArrayInputStream input1 = new ByteArrayInputStream("123".getBytes());
//         ByteArrayInputStream input2 = new ByteArrayInputStream("ABC".getBytes());
//         SequenceInputStream sequence = new SequenceInputStream(input1, input2);
//         int i;
                
//         while((i = sequence.read()) != -1) {
//             System.out.print((char) i);
//         }
//     }       
// o/p : 123ABC

// Qno.6 What will the following Java program output
// public class Week7 {

//     public static void main(String[] ars ) {
//         final int i;
//         i = 20;
//         i = 30;
//         System.out.println(i);
//     }
// }
// Compilation Error

// Qno.7 What will the following Java program output
// import java.io.*;
// public class Week7 {

//     public static void main(String[] args){
//         String obj = "abcdefgh";
//         int length = obj.length();
//         char c[] = new char[length];

//         obj.getChars(0, length, c, 0);
//         CharArrayReader input1 = new CharArrayReader(c);
//         CharArrayReader input2 = new CharArrayReader(c, 1, 4);
//         int i, j;

//         try {
//             while((i = input1.read()) == (j = input2.read())){
//                 System.out.println((char) i);
//             }
//         }
//         catch (IOException e){
//             e.printStackTrace();
//         }
//     }
// }
// None 

// Qno. 8 What will the following Java program output
// public class Week7 {

//     int num = 100;
//     public void calc(int num){
//         this.num = num * 10;
//     }
//     public void printNum() {
//         System.out.println(num);
//     }
//     public static void main(String[] args)  {
//         Week7 obj = new Week7();
//         obj.calc(2);
//         obj.printNum();
//     }
// }
// o/p : 20

// Qno. 9 What will be the output of the following code
// import java.io.*;
// public class Week7 {

//     public static void main(String[] args) {
//         try{
//             PrintWriter writer = new PrintWriter(System.out);
//             writer.write(9 + 97);
//             writer.close();
//         }
//         catch (Exception e){
//             System.out.println(e);
//         }
//     }
// };
// o/p : j

// Qno. 10 What will be the output of the following code
import java.io.File;
public class Week7 {

    public static void main(String[] args) {
        String filePath = "file.txt";

        File file = new File(filePath);
        long fileSize = file.length();

        System.out.println(fileSize);
    }
}