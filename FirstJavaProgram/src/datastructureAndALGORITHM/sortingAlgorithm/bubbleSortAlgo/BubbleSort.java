package datastructureAndALGORITHM.sortingAlgorithm.bubbleSortAlgo;

public class BubbleSort {
    public static void main(String[] args) {
//      BUBBLE SORT : SET GREATEST ELEMENT IN POSITION LAST AND SO ON... (INCREASING ORDER)

//        int[] arr = new int[]{1, 5, 4, 8, 2, 7, 3, 6, 9};
//        int[] result = bubbleSorting(arr);
//        System.out.println(result);
//        int[] r2 = printarray(result);

        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSorting(arr);
        System.out.println("Sorted array");
        ob.printarray(arr);

    }
//  -------------------------------------------
    static int[] bubbleSorting(int[] array) {
        for (int i = array.length; i > 0; i--) {

            boolean isSwapped = false;
            for (int j = 0; j < i - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }

        }
        return array;
    }
//  --------------------------------------------

    static void printarray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++)
            System.out.print(arrays[i] + " ");
        System.out.println();
    }
}
// TIME COMLEXITY O(N^2) = QUADRATIC
// TIME COMLEXITY O(1) IN BEST CASE
