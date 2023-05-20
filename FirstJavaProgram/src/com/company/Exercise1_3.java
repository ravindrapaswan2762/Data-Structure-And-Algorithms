package com.company;

import java.util.Scanner;

public class Exercise1_3 {
    static int armstrong_2(int n) {
        int temp = 0;
        int LastDigits = n %10;
        n /= 10;
        temp =  temp+LastDigits*LastDigits*LastDigits;
        return temp;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int sum = 0;
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int[] arr_even = new int[n];
//
//
//        for (int i=0; i<n; i++){
//
//            if (i==0){
//                arr[i] = 0;
//            }else if (i==1){
//                arr[i] = 2;
//            } else {
//                arr[i] = arr[i-1]+2;
//            }
//
//        }
//
//        for (int i=0; i<n; i++){
//            if (arr[i]%3==0){
//                arr_even[i] = arr[i];
//            }
//        }
//
//        for (int i=0; i<n; i++){
//            sum = sum + arr_even[i];
//        }

//------------------- testing ------------------
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        System.out.print("Even number divisible by 3:");
//        System.out.print(arr_even[0]+" ");
//        for (int i=0; i<n; i++){
//            if (arr_even[i] != 0){
//                System.out.print(arr_even[i]+" ");
//            }
//        }
//        System.out.println();
//        System.out.println("sum:"+sum);
//#######################################################################################

        int n = sc.nextInt();

        int temp = n;
        int armstrong = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int reversed = 0;
        int sum = 0;


        while (temp > 0) {

            int LastDigits1 = temp % 10;
            temp /= 10;

            armstrong = armstrong + LastDigits1 * LastDigits1 * LastDigits1;

        }
//      ---------------------------------------------------------------------------
            for (int i = 0; i < arr2.length; i++) {
                int LastDigits2 = temp % 10;

                temp /= 10;

                reversed = reversed * 10 + LastDigits2;
                arr2[i] = LastDigits2;

            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
//
            System.out.println();
            for (int i = 0; i < arr2.length; i++) {
                sum = sum + arr2[i] * arr2[i] * arr2[i];
            }
            System.out.print(armstrong);
            System.out.println();
            System.out.print(sum);
//

//            if (armstrong == sum) {
//                System.out.println(n + " is armstrong");
//            } else {
//                System.out.println(n + " is not armstrong");
//            }





    }
}
