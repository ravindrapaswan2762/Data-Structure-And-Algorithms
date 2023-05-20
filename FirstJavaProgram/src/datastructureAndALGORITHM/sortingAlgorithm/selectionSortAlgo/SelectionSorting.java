package datastructureAndALGORITHM.sortingAlgorithm.selectionSortAlgo;

import datastructureAndALGORITHM.sortingAlgorithm.bubbleSortAlgo.BubbleSort;

public class SelectionSorting {
    public static void main(String[] args) {
//        SELECTION SORT : SET SMALLEST ELEMENT IN POSITION 1 AND SO ON...(INCREASING ORDER)

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        SelectionSorting ob = new SelectionSorting();

        ob.selectionSorting(arr);
        System.out.println("Sorted array");
        ob.printarray(arr);
    }
//  ----------------------------------------------
    static int[] selectionSorting(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]<array[min]) {
                    min = j;
                }
            }
            if (i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }


        }
        return array;
    }
//  ------------------------------------------
    static void printarray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++)
            System.out.print(arrays[i] + " ");
        System.out.println();
    }
}
// TIME COMLEXITY O(N^2) = QUADRATIC