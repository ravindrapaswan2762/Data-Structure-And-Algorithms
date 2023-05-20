package datastructureAndALGORITHM.lenearSearchAlgo;

import java.util.Scanner;

public class LenearSearch {

    public static void main(String[] args) {

//        In lenear case : ther will be two case
//                         (1) search perticular element line by line(lenearly)
//                         (2) if found then retun element or of it's index

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = inClude(arr);
        System.out.println(result);
        }
//      -----------------------------------------
        static boolean inClude(int[] array){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element to search : ");
            int n = sc.nextInt();

            for (int i=0; i<array.length; i++){
                if (n == array[i]){
                    return true;
                }
            }
            return false;

        }
    }
//    TIME COMLEXITY = O(N) = LENEAR
