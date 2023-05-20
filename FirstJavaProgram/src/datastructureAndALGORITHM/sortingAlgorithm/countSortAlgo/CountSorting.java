package datastructureAndALGORITHM.sortingAlgorithm.countSortAlgo;

public class CountSorting {
    public static void main(String[] args) {
        int[] array = new int[]{9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};

        CountSorting obj = new CountSorting();
        obj.countSort(array, 3, 9);

    }
    static void countSort(int[] arr, int min, int max){
        int range =  max - min + 1;
        int[] farr = new int[range];


        for (int i=0; i<arr.length; i++){
            int idx = arr[i] - min;
            farr[idx]++;
        }

//      creating prefix sum array, that denoted is,
//      till where is the last position of frequent element
        for (int i=1; i<farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

//      stable sorting(filling ans array)
        int[] ans = new int[arr.length];
        for (int i=arr.length-1; i>=0; i--){
            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            farr[val-min]--;
        }
        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
