package datastructureAndALGORITHM.sortingAlgorithm.redixSortAlgo;

public class RedixSorting {
    public static void main(String[] args) {

        RedixSorting obj = new RedixSorting();
        int[] array = new int[]{5, 12, 234, 7, 9875, 62};
        obj.radixSort(array);

    }
//  ----------------------------------------------------
    static void countSort(int[] arr, int exp){
        int[] ans = new int[arr.length];

        int[] farr = new int[10];

        for (int i=0; i<arr.length; i++){
            farr[arr[i] / exp % 10]++;
        }

//      creating prefix sum array, that denoted is,
//      till where is the last position of frequent element
        for (int i=1; i<farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

        for (int i=arr.length-1; i>=0; i--){
            int pos = farr[arr[i] / exp % 10] - 1;
            ans[pos] = arr[i];
            farr[arr[i] / exp % 10]--;
        }
        for (int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
        System.out.print("After sorting on "+exp+" place --> ");
        printarray(arr);
        System.out.println();

    }
//  ----------------------------------------------------------
    static void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int val : arr){
            if (val>max){
                max = val;
            }
        }
        int exp = 1;
        while (exp <= max){
            countSort(arr, exp);
            exp = exp * 10;
        }

    }
//  TIME COMPLEXITY --> O(K * N),  K = maximum no. od digits of a integer
//  -------------------------------------------------------
    static void printarray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}
