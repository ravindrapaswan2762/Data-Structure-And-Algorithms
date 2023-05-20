package datastructureAndALGORITHM.sortingAlgorithm.insertionSortAlgo;

public class InsertionSorting {
    public static void main(String[] args) {

//  START BY PICKING SECOND ELEMENT OF AN ARRAY
//  COMPARE SECOND ELEMENT WITH FIRST ONE AND PLACE THEM IN ORDER(INCREASING)
//  NOW SIMILARLY TAKE THIERD ELEMENT AND COMPARE IT WITH REST TWO and Place them
//  REPEAT THE SAME STEP TILL LAST ELEMENT OF ARRAY

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        InsertionSorting ob = new InsertionSorting();

        ob.insertionSorting(arr);
        System.out.println("Sorted array");
        ob.printarray(arr);

    }
//  ------------------------------------------
    static void insertionSorting(int[] array){

        for (int i=1; i<array.length; i++)
        {
            int key = array[i];
            int j = i-1 ;

            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;

            }
            array[j+1] = key;
        }
    }
//  -------------------------------------------
    static void printarray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++)
            System.out.print(arrays[i] + " ");
        System.out.println();
    }
}




