package datastructureAndALGORITHM.problemSolvingApproach;

import java.util.Scanner;

public class CountLargestSumOFgroupedWise {
    public static void main(String[] args) {
////   {1, 2, 3, 4, 3, 5, 4, 6, 7, 8}  do addition of (4 - 4 grouped)
//
////    {1, 2, 3, 4},{2, 3, 4, 3},{3, 4, 3, 5},{4, 3, 5, 4},{3, 5, 4, 6},{5, 4, 6, 7},{4, 6, 7, 8}
//
////   then  7=(arr.length-n+1) time can iterate the loop
////
//        int[] arr = new int[]{1, 2, 3, 4, 3, 5, 4, 6, 7, 8};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter group size : ");
//        int n = sc.nextInt();
////      ---------------------------------------
//
//        if (n>arr.length){
//            throw new ArrayIndexOutOfBoundsException("Group size should be smaller than Array size");
//        }else {
//            int sumMax = 0;
//            for (int i=0; i<arr.length-n+1; i++){
//                int tempSum = 0;

//                for (int j=0; j<n; j++){
//                    tempSum = tempSum + arr[i+j];
//                }
//                if (tempSum>sumMax){
//                    sumMax = tempSum;
//                }
//            }
//            System.out.println(sumMax);
//
//        }
////         TIME COMPLEXITY = N*N = N^2 = QUADRATIC
//  ################################################################################
        //        ANOTHER APPROACH
//        {1, 2, 3, 4, 3, 5, 4, 6, 7, 8}
//        calculate first group, using loop {1, 2, 3, 4}
//        2, 3, 4 is common between group, so replace first element with groupSize+1 elements
//        And then calculate second group, using second loop {2, 3, 4, 3}
//        And last compare between them.

        int[] arr = new int[]{1, 2, 3, 4, 3, 5, 4, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter group size : ");
        int n = sc.nextInt();
//      ---------------------------------------

        if (n>arr.length){
            throw new ArrayIndexOutOfBoundsException("Group size should be smaller than Array size");
        }else {
            int sumMax = 0;
            int tempSum = 0;
//            n time execution
            for (int i=0; i<n; i++){
                tempSum = tempSum + arr[i];
            }

            sumMax = tempSum;
//            n time execution
            for (int j=n; j<arr.length; j++){
                tempSum = tempSum - arr[j-n] + arr[j];
            }
            if (tempSum>sumMax){
                System.out.println(tempSum);

            }else if (n==arr.length){
                int maxprosize = 0;
                for (int i=0; i<arr.length; i++){
                    maxprosize = maxprosize + arr[i];
                }
                System.out.println(maxprosize);
            }

        }
//        TIME COMPLEXITY = N = O(N) = Lnear


    }
}
