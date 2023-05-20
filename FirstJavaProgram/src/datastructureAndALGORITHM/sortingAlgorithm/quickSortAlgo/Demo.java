package datastructureAndALGORITHM.sortingAlgorithm.quickSortAlgo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//         lo                   hi
//        [ 4, 8, 1, 2, 7, 5, 9, 3 ]              ,  pivot = arr[lo] = 4
//          i                    j

//        itrate i till find grater than pivot element
//        itrate j till find smaller than pivot element
//        if found then swap each other

        int[] arr = {4, 8, 1, 2, 7, 5, 9, 3, 6, 10};

        Demo demo = new Demo();

        demo.sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
// -----------------------------------------------------------------------
    public int partition(int[] arr,int lowerBound,int upperBound) {

        int pivot = arr[lowerBound];

        int start = lowerBound;

        int end = upperBound;

        while(start<end) {

            while(arr[start]<=pivot) {
                start++;
            }
            while(arr[end]>pivot) {
                end--;
            }
            if(start<end) {
                swap(arr,start,end);
            }

        }
        swap(arr,lowerBound,end);
        return end;

    }
//  ---------------------------------------------------------------------
    public void sort(int[] arr,int lowerBound,int upperBound) {

        if(lowerBound<upperBound) {

            int location = partition(arr,lowerBound,upperBound);

            sort(arr,lowerBound,location-1);

            sort(arr,location+1,upperBound);

        }

    }
//  ---------------------------------------------------------------

    public void swap(int[] arr,int s,int e) {

        int temp;

        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }
}
