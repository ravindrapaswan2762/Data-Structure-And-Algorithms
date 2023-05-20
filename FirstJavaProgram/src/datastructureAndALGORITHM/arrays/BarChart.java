package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bh = new int[n]; // bh = building height
        for (int i=0; i<n; i++){
            bh[i] = sc.nextInt();
        }

        int maxH = bh[0];
        int minH = bh[0];
        for (int i=0; i<bh.length; i++){
            if (bh[i]>maxH){
                maxH = bh[i];
            }
            if (bh[i]<minH){
                minH = bh[i];
            }
        }

        for (int floor=maxH; floor>=1; floor--){
            for (int j=0; j< bh.length; j++){
                if (bh[j]>=floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
