package com.company;

import java.util.Scanner;

public class MultyDimensionArrays {
    public static void main(String[] args) {
//        int b[][] = new int[5][3];
//  ---------------------------------------------------------------------
//        int b[][] = {
//                {3, 2, 1, 5, 4, 6},
//                {8, 5, 6},
//                {4, 24, 12, 45}
//        };
//        System.out.println(b[0][3]);
//  --------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the row size : ");
//        int rows = sc.nextInt();
//        System.out.println("Enter the cols size : ");
//        int cols = sc.nextInt();
//
//        int a[][] = new int[rows][cols];
//        int b[][] = new int[rows][cols];
//
//        System.out.println("Enter value for 'A' matrix : ");
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter value for 'B' matrix : ");
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//        int c[][] = new int[rows][cols];
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.println("Addition of the matrix 'C=A+B' is : ");
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//        }
//  ????????????????????????????????????? multy of two matrix #????????????????????????????

//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter test cases");
//        int n = sc.nextInt();
//
//        for(int i=0; i<n-1; i++){
//            System.out.println("Enter the array size : ");
//            int size1 = sc.nextInt();
//
//            int[] array1 = new int[size1];
//
//
//            for(int j=0; j<size1; j++){
//                for (int k=0; k<size1; k++){
//                    array1[i] = sc.nextInt();
//                }
//            }
//            for(int j=0; j<size1; j++){
//                System.out.print(array1[i]+" ");
//            }
//            System.out.println();
//            // ------------------------------------
//            System.out.println("Enter the array size again : ");
//            int size2 = sc.nextInt();
//
//            int[] array2 = new int[size2];
//            for(int k=0; k<size2; k++){
//                array2[i] = sc.nextInt();
//            }
//            for(int k=0; k<size2; k++){
//                System.out.print(array2[i]+" ");
//            }
//
//
//
//        }
//        ##################################################################################


                Scanner sc = new Scanner(System.in);

                int testcases = sc.nextInt();
                int product = 1;

                for(int i=0;i<testcases;i++) {


                    int ArrSize = sc.nextInt();

                    int[] array = new int[ArrSize];

                    for(int j=0;j<ArrSize;j++) {
                        array[j] = sc.nextInt();
                    }
                    for(int j=0;j<ArrSize;j++) {
                        product = product * array[j];
                    }
                    System.out.println(product);

                }


//            public static long product(int[] arr,int n){
//                long result = 0;
//                for(int k=0;k<n;k++) {
//                    if(result ==0){
//                        result = arr[k];
//                    }
//                    else{
//                        result = result * arr[k];
//                    }
//                }
//                return result;




    }
}
