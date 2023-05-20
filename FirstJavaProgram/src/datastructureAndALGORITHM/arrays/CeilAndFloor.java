package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data = sc.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int ceil = 0;
        int floor = 0;
        while (lo<=hi){
            int mid = (lo + hi)/2;
            if (data<arr[mid]){
                hi = mid-1;
                ceil = arr[mid];
            }else if(data>arr[mid]){
                lo = mid+1;
                floor = arr[mid];
            }else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(floor+"__"+ceil);
    }
}
