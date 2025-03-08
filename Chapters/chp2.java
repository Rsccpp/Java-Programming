// Arrays in Java

import java.util.*;

public class chp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        
        // 1D Array

        // int arr1[]= {1, 2, 3, 4, 5};

        // for(int i=0; i<5; i++){

        //      System.out.println(arr1[i]);
        // }
        
        // int arr[];
        // arr = new int[5];

        // for(int i=0; i<5; i++){
        //     arr[i] = sc.nextInt();
        // }
        
        // System.out.println("Entered elements: ");

        // for(int i=0; i<5; i++){
            
        //     System.out.println(arr[i]);
    //    }

//    2D Array

//    Initialization of 2D Array     
        //    Static Initialization
        //    int arr[][] = {{1, 2, 3}, { 4, 5, 6}};

        //    for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        //    }
        
           //  Dyanmic Initialization

//         System.out.println("Enter no. of Rows: ");
//         int rows = sc.nextInt();

//         System.out.println("Enter no. of Columns: ");
//         int cols = sc.nextInt();

//         int arr[][] = new int[rows][cols];
        
//         System.out.println("Enter elements in Array: ");
//         for(int i=0; i<rows; i++){
            
//             for(int j=0; j<cols; j++){
//               arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Entered elements of 2D Array: ");

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){

//                System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         System.out.println("Length of Array: " + arr.length);
//         sc.close();

// 3D Array
         
        // arr[][][] = new int[size1][size2][size3];
        // 1. size1 = Number of 2D Arrays 
        // 2. size2 = Number of rows in each 2D Arrays 
        // 3. size3 = Number of columns in each row

        // Static Initialization
        // int arr[][][] = {
        //      {{1, 2, 3}, {4, 5, 6}},
        //      {{7, 8, 9}, {10, 11, 12}}
        // };

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         for(int k=0; k<arr[i][j].length; k++){
        //             System.out.print(arr[i][j][k] +  " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
      
        // Dynamic Initialization
        int size1, size2, size3;
        
        System.out.println("Enter Number of 2D Arrays: ");
        size1 = sc.nextInt();
        
        System.out.println("Enter Number of rows in each 2D Arrays: ");
        size2 = sc.nextInt();
        
        System.out.println("Enter Number of columns in each rows: ");
        size3 = sc.nextInt();
        
        int arr[][][] = new int[size1][size2][size3];

        System.out.println("Enter elements: ");

       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            for(int k=0; k<arr[i][j].length; k++){
               arr[i][j][k]  = sc.nextInt();
            }
        }
        System.out.println();
        
       }

       for(int i=0; i<size1; i++){
        for(int j=0; j<size2; j++){
            for(int k=0; k<size3; k++){
                System.out.print(arr[i][j][k] +  " ");
            }
            System.out.println();
        }
       
    }
    }
}
