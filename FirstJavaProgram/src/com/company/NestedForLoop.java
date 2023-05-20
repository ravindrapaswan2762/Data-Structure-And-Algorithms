package com.company;
import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {
//########################  table printing ################################################
//        for(int i=1; i<=20; i++){
//
//            for (int j=1; j<=10; j++){
//                System.out.print(i*j +",   ");
//            }
//            System.out.println("-->");
//        }
//########################################## square pattern printing #################################
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
//        int n = sc.nextInt();
//        for(int j=1; j<=n; j++) {
//
//            for (int i = 1; i <= n; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
// ####################################################################################################
//  *
//  * *
//  * * *
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
// #############################################################################################
//  * * *
//    * *
//      *
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//
//            for(int j=1; j<=(i-1); j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print("* ");
//        }
//            System.out.println();
//        }
//############################################################################################
//  * * *
//  * *
//  *
//       int n = sc.nextInt();
//       for(int i=1; i<=n; i++){
//
//           for (int j=1; j<=(n-i+1); j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
// #####################################################################################
//        *
//      * *
//    * * *
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//        }
//            System.out.println();
//        }
//##########################################################################################
//      *
//    *   *
//  *   *   *
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//
//            for (int j=1; j<=(n-i)*2; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*   ");
//            }
//            System.out.println();
//        }
//  ####################################################################################
//      1
//    2   3
//  4   5   6
//        int n = sc.nextInt();
//        int m = 0;
//        for (int i=1; i<=n; i++){
//
//            for (int j=1; j<=(n-i)*2; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                m = m + 1;
//                System.out.print(m+"   ");
//            }
//            System.out.println();
//        }
//  #######################################################################################
//  *
//  * *
//  * * *
//  * *
//  *
//        int n= sc.nextInt();
//        int row = 2 * n - 1;
//
//        for(int i=1; i<=row; i++){
//            if(i<=n){
//                for (int j=1; j<=i; j++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (int j=1; j<=row-i+1; j++){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//  #################################### (i-2) for space ###########################################
//  *         DEvIDE INTO THREE PARTS - (1)first row, (2)middles row, and (3)last row
//  * *       0 space
//  * | *     1 space
//  * | | *   2 space
//  * * * * *
// ---------------------------------------------- for first row
//        int n = sc.nextInt();
//        System.out.println("*");
//------------------------------------------------ for all middle row
//        for(int i=2; i<=n-1; i++){
//            System.out.print("* ");
//
//            for (int j=1; j<=i-2; j++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//            System.out.println();
//        }
//----------------------------------------------- for last row
//        if (n>1) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print("* ");
//            }
//        }
//  #################################### pdf exercise  ################################################
//  * * * * *     i=1  0sp
//      * * * *    1=2  4sp (n-i+1)
//          * * *   i=3 8sp
//              * *   i=4 12sp
//                  *   i=5 16sp
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n+i-1; j++){
//                System.out.print("    ");
//            }
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//  #################################### pdf exercise  ################################################
//        *
//      * *
//    * * *
//  * * * *
//    * * *
//      * *
//        *
//        int n = sc.nextInt();
//        int row = 2*n-1;
//        for (int i=1; i<=row; i++){
//
//            if (i<=n){
//                for (int j=1; j<=n-i+1; j++){
//                    System.out.print("  ");
//                }
//                for (int k=1; k<=i; k++){
//                    System.out.print("* ");
//                }
//            }else {
//                for (int j=1; j<=i-n+1; j++){
//                    System.out.print("  ");
//                }
//                for (int l=1; l<=row-i+1; l++){
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//
//                }
//  ################################## PDF EXERCISE ##############################################
//  * * * | * * *
//  * * | | | * *
//  * | | | | | * --------devided
//  * * | | | * *
//  * * * | * * *
//        int n = sc.nextInt();
//        int row = 2*n;
//        for (int i=1; i<=row; i++){
//            if (i<=n) {
//                for (int j=1; j<= n-i+1; j++) {
//                    System.out.print("* ");
//                }
//                for (int j=1; j<=2*i-1; j++){
//                    System.out.print("  ");
//                }
//                for (int j=1; j<= n-i+1; j++) {
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (int j = 1; j <= i - n; j++) {
//                    System.out.print("* ");
//                }
//                for (int j = 1; j<=2*i-(i+1); j++) {
//                    System.out.print("  ");
//                }
//                for (int j = 1; j <= i - n; j++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//  ###################################### PDF EXERCISE #############################################
//      1
//    1 2 3
//  1 2 3 4 5
//        int n = sc.nextInt();
//        int m = 1;
//        for (int i=1; i<=n; i++){
//            m = 1;
//
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<=2*i-1; j++){
//                System.out.print(m+" ");
//                m = m + 1;
//            }
//            System.out.println();
//        }
//  ##################################### PDF EXERCISE ##############################################
//                *   i j       | = space
//              * *   1 0
//            * | *   2 0
//          * | | *   3 1
//        * | | | *   4 2
//      * | | | | *   5 3
//    * | | | | | *   6 4
//  * * * * * * * *

        int n = sc.nextInt();
//------------------------------------------------------------ for left side main space
        for (int i=1; i<=n; i++) {
            System.out.println();

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");

//  -----------------------
            if (i>=2 & i<=n-1) {
                for (int k=1; k<n-2; k++) {
                    for (int l = 1; l <= i-2; l++) {
                        System.out.print(" ");
                    }
                }
            System.out.print("* ");
            }
        }
//  -------------------------------------------------------------- for last row n stars
        if (n>=1) {
            for (int j = 1; j < n; j++) {
                System.out.print("* ");

            }

        }
//#############################################################################################


    }

}


