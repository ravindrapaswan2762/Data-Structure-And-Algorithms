package datastructureAndALGORITHM.problemSolvingApproach;

import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args) {

//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter element for finding position : ");
//        int n = sc.nextInt();
//
//        for (int i=0; i<arr.length; i++){
//            if (n == arr[i]){
//                System.out.println(i);
//            }
//        }
//################################### DEVIDE AND CONQUERER METHODS ########################
//      In Shorted Arrays Only
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element for finding position : ");
        int n = sc.nextInt();

        int min = 0;
        int max = arr.length-1;

        while (min<=max){

            int middleIndex = (min+max)/2;

            if (n<arr[middleIndex]){
                max = middleIndex-1;
            }
            else if (n>arr[middleIndex]){
                min = middleIndex + 1;
            }else {
                System.out.println(middleIndex);
                break;

            }


        }

    }
}
