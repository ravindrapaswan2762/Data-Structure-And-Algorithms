package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class SubstractOfTwoArray {
    public static void main(String[] args) {
        // 5  6  7  8 |      1 0 0 0   |     1 0 0 0
        // 1  2  3  4 |            1   |       9 9 9
// sub    ----------- |      --------  |     --------
//         4  2  4  4 |      0 9 9 9   |     0 0 0 1
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }

        int[] sub = new int[n1>n2?n1: n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sub.length-1;
        int c = 0;

        while (k>=0){
            int d = 0;
            int a2val = j>=0? a2[j]: 0; // if arr2 have no element then consider 0

            if (a1[i]+c>=a2val){
                d = a1[i]+c - a2val;
                c = 0;
            }else {
                d = a1[i]+c+10 - a2val;
                c = -1;
            }
            sub[k] = d;
            i--;
            j--;
            k--;
        }
        // avoid leading zeeros
        int idx = 0;
        while (idx< sub.length){
            if (sub[idx]==0){
                idx++;
            }else {
                break;
            }
        }
        // print element without leading zeeros
        while (idx< sub.length){
            System.out.print(sub[idx]+"");
            idx++;
        }
    }
}
