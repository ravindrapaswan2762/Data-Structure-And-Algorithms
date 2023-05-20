package datastructureAndALGORITHM.binarySearchAlgo;

public class BinarySearch {
    public static void main(String[] args) {

//        BINARY SEARCH : binary is more efficient than lenear, it's work only sorted arrays
//        In binary case : there will be some cases
//                         (1) firstly check sorted arr is accending or decending order.
//                         (2) search perticular element randomly with according to given order wise formulas
//                         (3) if found then retun element or of it's index.

        int[] arr = new int[]{5, 6, 7, 8, 9, 1, 2, 3};
        int result = searchInRotatedArr(arr, 9, 0, arr.length-1);
        System.out.println(result);

    }
    static boolean binarySearch(int[] array, int n){
        int lastIndex = array.length-1;
        int firstIndex = 0;

        int midIndex = (lastIndex + firstIndex)/2;

        while (firstIndex<=lastIndex && array[midIndex] != n){
            if (n>array[midIndex]){
                firstIndex = midIndex + 1;
            }
            else if (n<array[midIndex]){
                lastIndex = midIndex-1;
            }
            midIndex = (lastIndex + firstIndex)/2;

        }
        if (array[midIndex]==n){
            return true;
        }
        else {
            return false;
        }


    }

    static int binarySearch1(int[] array, int target){
        int low = 0;
        int high = array.length-1;

        if (array.length==1 && array[0]==target){
            return 0;
        }
        //          condition fo accending order.
        if (array.length>1 && array[0]<=array[array.length-1]) {
                while (low <= high) {

                    int mid = low + (high - low) / 2;

                    if (array[mid] == target) {
                        return mid;
                    }

                    else if (target > array[mid]) {
                        low = mid + 1;
                    }
                    else {
                        high = mid - 1;
                    }
                }
            }
        //          condition fo decending order.
        else if (array.length>1 && array[0]>array[array.length-1]){

                while (low<=high){

                    int mid = low + (high - low)/2;

                    if (array[mid]==target){
                        return mid;
                    }
                    else if (target<array[mid]){
                        low = mid + 1;
                    }
                    else {
                        high = mid - 1;
                    }
                }
            }

        return -1;
    }
    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e - s)/2;

        if (arr[mid]==target){
            return mid;
        }
        if (target<arr[mid]){
            return search(arr, target, s, mid-1);
        }
        else{
            return search(arr, target, mid+1, e);
        }

    }
    //------------------------------- kunal logic-------------
    public static int searchInRotatedArr(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }

        int mid = s + (e - s)/2;
        if (arr[mid]==target){
            return mid;
        }

        if (arr[s]<=arr[mid]){
            if (target>=arr[s] && target<=arr[mid]){
                return searchInRotatedArr(arr, target, s, mid-1);
            }else {
                return searchInRotatedArr(arr, target, mid+1, e);
            }
        }
        if (target>=arr[mid] && target<=arr[e]){
            return searchInRotatedArr(arr, target, mid+1, e);
        }
        else {
            return searchInRotatedArr(arr, target, s, mid-1);
        }
    }
}
//    TIME COMPLEXITY = 0(log(n)), Because it's use divide and conquerer methods