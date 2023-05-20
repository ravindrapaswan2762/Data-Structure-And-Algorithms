package CP;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 7, 9};
        int result = findFloor(arr, 10);
        int result1 = findSeel(arr, 10);
        System.out.println("floor "+result);
        System.out.println("seel "+result1);


//        int f1 = findInFisrtSortedArray(arr, result, 10);
//        int f2 = findInSecondSortedArray(arr, result, 10);
//        if (f1!=-1){
//            System.out.println(f1);
//        }
//        else if (f2!=-1){
//            System.out.println(f2);
//        }
//        else {
//            System.out.println(-1);
//        }

    }
    static int binarySearch1(int[] array, int x){
        int low = 0;
        int high = array.length-1;

        if (array.length==1 && array[0]==x){
            return array[0];
        }

        //          condition fo Ascending order.
        if (array.length>1 && array[0]<=array[array.length-1]) {
            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (array[mid] == x) {
                    return array[mid];
                }

                else if (x > array[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        //          condition fo Descending order.
        else if (array.length>1 && array[0]>array[array.length-1]){

            while (low<=high){

                int mid = low + (high - low)/2;

                if (array[mid]==x){
                    return array[mid];
                }
                else if (x<array[mid]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return 0;
    }

//  ---------------------------------------------------
    static int FirstOccurency(int[] array, int x){
        int low = 0;
        int high = array.length-1;
        int FirstOcurrence = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                FirstOcurrence = mid;
                high = mid-1;
            }

            else if (x > array[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (FirstOcurrence>0){
            return FirstOcurrence;
        }
        return 0;
    }

    static int LastOccurencey(int[] array, int x){

        int low = 0;
        int high = array.length-1;
        int LastOcurrence = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                LastOcurrence = mid;
                low = mid+1;
            }

            else if (x > array[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (LastOcurrence>0){
            return LastOcurrence;
        }
        return 0;
    }
//  ---------------------------------------------------
    static int countElements(int[] array, int x){

        int low = 0;
        int high = array.length-1;
        int firstOccurence1 = 0;

        //this is for first Occurence
        while (low<=high){

            int mid = low + (high - low)/2;

            if (x==array[mid]){
                firstOccurence1 = mid;
                high = mid - 1;
            }
            if (x>array[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // this is for second Occurence
        int low1 = 0;
        int high1 = array.length-1;
        int LastOccurence1 = 0;
        while (low1 <= high1) {

            int mid = low1 + (high1 - low1) / 2;

            if (array[mid] == x) {
                LastOccurence1 = mid;
                low1 = mid + 1;
            }

            else if (x > array[mid]) {
                low1 = mid + 1;
            }
            else {
                high1 = mid - 1;
            }
        }

        int res = (LastOccurence1 - firstOccurence1) + 1;
        System.out.println("f "+firstOccurence1);
        System.out.println("l "+LastOccurence1);

        if (LastOccurence1>0 && firstOccurence1>0){
            return res;
        }


        return 0;

    }
//  ---------------------------------------------------
    static int howManyTimeSortedArraryIsRotated(int[] Array, int n){
//      find smallest element and return that indexes and done.
        int low = 0;
        int high = n-1;

        while (low<=high){
//          may be given initial array is sorted so return lowest index.
            if (Array[low]<=Array[high]){
                return low;
            }

            int mid = low + (high - low)/2;

            int privious = (mid + n-1)%n;
            int next = (mid+1)%n;

//          checking smallest element.
            if (Array[mid]<=privious && Array[mid]<=next){
                return mid;
            }
//          then checking smallest element in those half where half is unsorted.
            else if (Array[low]<=Array[mid]){
                low = mid + 1;
            }
            else if (Array[mid]<=Array[high]){
                high = mid - 1;
            }
        }
        return 0;
    }
//  ---------------------------------------------------
    static int findElementSortedArrayRotated(int[] Array, int n){

        int low = 0;
        int high = n-1;

        while (low<=high){

            if (Array[low]<=Array[high]){
                return low;
            }
            int mid = low + (high - low)/2;

            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;

            if (Array[mid]<=Array[prev] && Array[mid]<=Array[next]){
                return mid;
            }
            else if (Array[low]<=Array[mid]){
                low = mid + 1;
            }
            else if (Array[mid]<=Array[high]){
                high = mid - 1;
            }

        }

        return -1;
    }
    static int findInFisrtSortedArray(int[] Array, int minIndex, int x){
        int low = 0;
        int high = minIndex - 1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (Array[mid]==x){
                return mid;
            }
            else if (x<Array[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    static int findInSecondSortedArray(int[] Array, int minIndex, int x){
        int low = minIndex;
        int high = Array.length-1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (Array[mid]==x){
                return mid;
            }
            else if (x<Array[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
//  ---------------------------------------------------
    static int findFloor(int[] array, int x){

        int low = 0;
        int high = array.length-1;
        int res = -1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (array[mid]==x){
                return array[mid];
            }
            else if (x<array[mid]){
                high = mid - 1;
            }
            else if (x>array[mid]){
                res = array[mid];
                low = mid + 1;
            }


        }
        return res;
    }
    static int findSeel(int[] array, int x){

        int low = 0;
        int high = array.length-1;
        int res = -1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (array[mid]==x){
                return array[mid];
            }
            else if (x<array[mid]){
                res = array[mid];
                high = mid - 1;
            }
            else if (x>array[mid]){
                low = mid + 1;
            }


        }
        return res;
    }


    
    




}
