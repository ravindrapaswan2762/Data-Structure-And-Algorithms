package com.company;

import java.util.*;

public class TwoPointersAlgorithms {

    public boolean twosum(int[] a, int x, int i) {

    //   TWO POINTERS ALGORITHM(two sum algorithm) IS MOSTLY USED IN SORTED ARRAYS

        Scanner sc = new Scanner(System.in);
        i = 0;
        int j = a.length-1;
        boolean check = true;

//      after sorted arrays then, use two pointers,    (i+j+k=0) so (i= -[j+k]) concept used in this

//      int[] a = { ,  ,  ,  ,  ,  ,};
//                  i              j                 SUPOSE  X = 5

            while (i<j){

            if (a[i]+a[j]>x){
                j--;
            }else if (a[i]+a[j]<x){
                i++;
            }else {
                return check;
            }

        }
        check = false;
        return check;
    }
//  ------------------------- for triplets ------------------------------------

    public boolean findTriplets(int a[], int i, int x) {

        int j = a.length-1;

        for (i = 0; i < a.length - 2; i++) {

            if (twosum(a, -a[i], i+1))
//      ex:-    twosum(arr a se, -x chaiye, start from i=i+1)
                return true;
        }
        return false;
    }


}
