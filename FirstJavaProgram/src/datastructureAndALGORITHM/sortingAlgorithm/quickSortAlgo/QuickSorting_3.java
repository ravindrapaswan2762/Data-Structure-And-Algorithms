package datastructureAndALGORITHM.sortingAlgorithm.quickSortAlgo;

public class QuickSorting_3 {
    public static void main(String[] args) {
//          lo                   hi
//        [ 1, 3, 2, 4, 5, 7, 8, 9]              ,  pivot = arr[lo] = 4
//          i
//             j

//        itrate i till find grater than pivot element
//        itrate j till find smaller than pivot element
//        if found then swap each other

        int[] arr = {4, 8, 1, 2, 7, 5, 9, 3};
        QuickSorting_3 obj = new QuickSorting_3();
        obj.quicksorting1(arr, 0, arr.length-1);
        obj.printarray(arr);
    }


    static int partioning(int[] array, int lo, int hi){
        int pivotElement = array[lo];
        int i = lo, j = hi;
        while (i<j){
            do {
                i++;
            }while (array[i]<=pivotElement);

            do {
                j--;
            }while (array[j]>pivotElement);

            if (i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp2 = array[lo];
        array[lo] = array[j];
        array[j] = temp2;

//        printarray(array);
//        System.out.println();
//        System.out.println(array[j]);
        return j;
    }
    static int[] quicksorting1(int[] array, int lo, int hi){
        if (lo<hi){
            int pi = partioning(array,lo, array.length-1);
            quicksorting1(array, lo, pi-1);
            quicksorting1(array, pi+1, array.length-1);

        }
        return array;
    }
//  --------------------------------------------------
    static void printarray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
