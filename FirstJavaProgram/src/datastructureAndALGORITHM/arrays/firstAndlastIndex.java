package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class firstAndlastIndex {
    public static int firstIndex(int[] arr, int data){
        int lo = 0;
        int hi = arr.length-1;
        int res = -1;
        while (lo<=hi){
            int mid = (lo + hi)/2;
            if (data<arr[mid]){
                hi = mid-1;
            }else if(data>arr[mid]){
                lo = mid+1;
            }else {
                res = mid;
                hi = mid-1;
            }
        }
        return  res;
    }
    public static int lastIndex(int[] arr, int data){
        int lo = 0;
        int hi = arr.length-1;
        int res = -1;
        while (lo<=hi){
            int mid = (lo + hi)/2;
            if (data<arr[mid]){
                hi = mid-1;
            }else if(data>arr[mid]){
                lo = mid+1;
            }else {
                res = mid;
                lo = mid+1;
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{10, 20, 20, 20, 20, 20, 40, 50, 60, 70, 80, 90, 100};
        int data = 20;
        int x = firstIndex(arr, data);
        int y = lastIndex(arr, data);
//        System.out.println(x);
//        System.out.println(y);
        System.out.println(-5%5);

    }
}
