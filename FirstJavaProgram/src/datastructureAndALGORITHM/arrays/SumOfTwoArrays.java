package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        // 1  2  3  4
        // 5  6  7  8
// add     ----------
//         6  9  1  2

        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[]{1, 2, 9};
        int[] arr2 = new int[]{1};

        int c = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;

        int[] sum = new int[arr1.length> arr2.length? arr1.length : arr2.length];
        int k = sum.length-1;

        while (k>=0){
            int d = c;

            if (i>=0){
                d += arr1[i];
            }
            if (j>=0){
                d += arr2[j];
            }

            c = d/10;
            d = d%10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if (c!=0){
            System.out.print(c);
        }
        for (int value: sum){
            System.out.print(value);
        }


    }
}
