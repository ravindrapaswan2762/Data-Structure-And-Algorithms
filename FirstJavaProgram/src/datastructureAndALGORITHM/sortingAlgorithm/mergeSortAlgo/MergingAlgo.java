package datastructureAndALGORITHM.sortingAlgorithm.mergeSortAlgo;

import java.util.Arrays;

public class MergingAlgo {
    public static void main(String[] args) {

        MergingAlgo obj = new MergingAlgo();

        int[] arr2 = new int[]{1, 5, 10, 2, 7, 19, 6, 18};

        obj.mergeSortAlgorithm(arr2);

    }
//  ------------------------------------------------- merging with accending order
    static int[] mergeSortArrays(int[] array1, int[] array2){
        System.out.println("merging these two arrays ");
        System.out.print("left array : ");
        printarray(array1);
        System.out.println();
        System.out.print("right array : ");
        printarray(array2);
        System.out.println();

        int i = 0, j = 0, k = 0;
        int[] result = new int[array1.length+array2.length];
        MergingAlgo obj = null;

        while (i<array1.length && j<array2.length){
            if (array1[i]<array2[j]){
                result[k] = array1[i];
                i++;
                k++;
            }else {
                result[k] = array2[j];
                j++;
                k++;
            }

        }
        while (i<array1.length){
            result[k] = array1[i];
            i++;
            k++;
        }
        while (j<array2.length){
            result[k] = array2[j];
            j++;
            k++;
        }
        printarray(result);
        System.out.println();
        return result;


    }
//  -------------------------------------- create subArray till single element
    static int[] mergeSortAlgorithm(int[] array){
        if (array.length<=1){
            return array;
        }

        int midPoint = (array.length)/2;
        Arrays arrays = null;
        int[] leftArray = mergeSortAlgorithm(arrays.copyOfRange(array, 0, midPoint));
        int[] rightArray = mergeSortAlgorithm(arrays.copyOfRange(array, midPoint, array.length));


        return mergeSortArrays(leftArray, rightArray);
    }
//   -------------------------------------
    static void printarray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
//-----------------------------------------------------------------------------
// [1, 5, 10, 2, 7, 19, 6, 18],  TIME COMLEXITY O(LOG(N), very very very good

// SPLITING TILL SINGLE ELEMENT.....

//  left array                         right array
// [1, 5, 10, 2],                    [7, 19, 6, 18]                 .....(1)
// [1, 5], [10, 2]                   [7, 19,], [6, 18]              .....(2)
// [1],[5], [10],[2]                 [7],[19], [6],18]              .....(3)

// NO. OF STEP TO SPLIT OF 8 ELEMENT OF ARRAY  =  3
// 2^3 = 8

// NOW MERGING......
// [1, 2, 5, 10]                     [6, 7, 18, 19]

//          [1, 2, 5, 6, 7, 10, 18, 19]