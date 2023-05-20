package datastructureAndALGORITHM.bigOnotation;

import java.util.Scanner;

public class FindMinimumNumber {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array : ");
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];

//        for (int i=0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println();

//      --------------------------------------- finding minimum number

        //        BLOCK - 1
//        if (arr.length==0){
//            throw new ArrayIndexOutOfBoundsException("Array should not be empty : ");
//        }
        //        BLOCK - 2
//        else if (arr.length == 1){
//            System.out.println(arr[0]);
//        }
//        //        BLOCK - 3, 1 TIME EXECUTION
//        else {
//            int currentMIN = arr[0];
//            for (int i=1; i<size; i++){

        //        BLOCK - 4, n-1 TIME EXECUTION
//                if (arr[i]<currentMIN){
//                    currentMIN = arr[i];
//                }
//            }
//            System.out.println(currentMIN);
//        }
//        TIME COMPLEXITY = BIG O NOTATION = C1 + C2 + 1 + n-1 = o(n-1) + 1 = o(n) = lenear



//  ########################################################################### Second Approach
//        [4, 3, 1, 5] arrange into increasing order --> [ 1, 3, 4, 5]
//        then access first element,
//        compare i+1<i then swap them, now still compare ith element till end of the arr,
//        and then i++(i+1), for compare with second with all element of arr

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        //        1 TIME EXECUTION
        for (int i=0; i<arr.length; i++){

            //        N-1 TIME EXECUTION
            int outerElement = arr[i];
            //        1 TIME EXECUTION
            for (int j=i+1; j<arr.length; j++){

                //        N-1 TIME EXECUTION
                int innerElement = arr[j];

                if (outerElement>innerElement){
                    arr[i] = innerElement;
                    arr[j] = outerElement;

                    innerElement = arr[j];
                    outerElement = arr[i];

                }
            }
        }
        System.out.print(arr[0]);

//  TIME COMPLEXITY = N*N = O(N^2) = QUADRATIC TIME COMPLEXITY

    }
}
