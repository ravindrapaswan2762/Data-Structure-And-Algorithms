package datastructureAndALGORITHM.problemSolvingApproach;

import java.util.Scanner;

public class CoutingFrequency {
    public static void main(String[] args) {
////        arr_1 [1, 2, 3, 4],   arr_2 [1, 4, 3, 16]
////        to check, element of arr_2 should be squared element at any position,
////        of each element of given arr_1
//
//        int[] arr_1 = {1, 2, 3, 4, 5};
//        int[] arr_2 = {25, 1, 4, 16, 90};
//
////      n time execution
//        for (int i=0; i<arr_1.length; i++) {
//            boolean isSquare = false;
//
////          n time execution
//            for (int j = 0; j < arr_2.length; j++) {
//
//                if (arr_1[i] * arr_1[i] == arr_2[j]) {
//                    isSquare = true;
//
//                }
//                if (j == arr_2.length - 1) {
//                    if (!isSquare) {
//                        isSquare = false;
//                    }
//                }
//
//            }
//            System.out.print(isSquare + " ");
//
//
//        }
////        TOTAL TIME EXECUTION --> N*N = N^2


//  ################################################ APPROACH TWO ###########################



        int[] arr = new int[]{1,2,3,2,1,2,8,6};
        int[] visitedarr = new int[arr.length];
        int visited = -1;

        //      n time execution
        for (int i=0; i<arr.length; i++){
            int count = 1;

            //      n time execution
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count = count+1;
                    visitedarr[j] = visited;
                }
            }
            if (visitedarr[i] != visited){
                visitedarr[i] = count;
            }

        }
        for (int i=0; i<visitedarr.length; i++){
            if (visitedarr[i] != visited){
                System.out.println(arr[i]+" : "+visitedarr[i]);
            }
        }

//        TOTAL TIME EXECUTION --> N*N = N^2
//  #####################################################################################
//                counting frequency
//        array_1 [1, 2 , 4 , 2]     -->    {1:1, 2:2, 4:1}
//        array_2 [1, 4, 4, 16]      -->    {1:1, 4:2, 16:1}






    }
}
