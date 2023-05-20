package datastructureAndALGORITHM.problemSolvingApproach;

import com.sun.jdi.AbsentInformationException;

public class CountUniqueNumber {
    public static void main(String[] args) throws AbsentInformationException {
//         i
//        {1, 2, 3, 10, 3, 10};
//            j
//        unique number {1, 2, 3, 10}

        int[] arr = new int[]{1, 1, 2, 2, 3, 10};

        if (arr.length>0){
            int i = 0;
            for (int j=1; j< arr.length; j++){

                if (arr[i] != arr[j]){
                    i++;
                    arr[i] = arr[j];
                }

            }
            System.out.print(i+1+" ");
        }else {
            throw new AbsentInformationException("Array should be not empty ");
        }
//  #####################################################################################


    }
}
