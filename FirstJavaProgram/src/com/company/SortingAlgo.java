package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgo {
    public static void main(String[] args) {
//######################## BUBBLE SORT ##########################################################
// [7, 5, 4, 2, 0]==>>[5, 4, 2, 0, 7]-->[4, 2, 0, 5, 0]-->[2, 0, 4, 5, 7]-->[0, 2, 4, 5, 7]-->(n-1)
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int[] a = {7, 5, 4, 2, 0};
        n = a.length;

        boolean sorted = true;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){

//  ------------- compare right_index element with left_index and swap
                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    sorted = false;
                }
//  -----------------------------------------------------------------
            }
            if (sorted){
                break;
            }
        }
        for (int item: a){
            System.out.print(item+" ");
        }
//  ############################################ SELECTION SORT ################################
//  found smallest no. and replace position one, then second smallest no., then third......
//  {5, 2, -1, 6, 3}-->> (1){-1, _2_, _5_, _6_, _3_}-->(2){-1, 2, _5_, _6_, _3_}-->(3){-1, 2, 3, _6_, _5_}
//                       (4){-1, 2, 3, 5, _6_}--(n-1)

//        int[] a = {3, 1, -2, 7, 4, 0};
//        int n = a.length;
//        for (int i=0; i<n-1; i++){
//
//            int MinIndex = i;
//
//            for (int j=i; j<n; j++) {
//
//      --------find index of a  minimum value---------
//                if (a[j] < a[MinIndex]) {
//                    MinIndex = j;
//                }
//      -------------------------------------------
//            }
//      ------------  swap them on first position -------
//            int temp = a[i];
//            a[i] = a[MinIndex];
//            a[MinIndex] = temp;
//      -------------------------------------------------

//        }
//        for (int e: a){
//            System.out.print (e+" ");
//        }
//
    }
}
