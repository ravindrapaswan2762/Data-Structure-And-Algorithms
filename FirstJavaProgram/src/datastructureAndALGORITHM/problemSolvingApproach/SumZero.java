package datastructureAndALGORITHM.problemSolvingApproach;

public class SumZero {
    public static void main(String[] args) {
//        int[] arr = new int[]{-5, -4, -3, -2, 0, 2, 4, 6, 8};

//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i]+arr[j]==0){
//                    System.out.println("["+arr[i]+" : "+arr[j]+"]");
//                }
//            }
//        }
//        TIME COMPLEXITY = N*N = N^2 = QUADRATIC

//  ####################################################################################
//        SECOND APPROACH - WITH TWO POINTERS
        int[] arr2 = new int[]{-5, -4, -3, -2, 0, 2, 4, 6, 8};

        int right = arr2.length-1;
        int left = 0;
        while (left<right){

            int sum = arr2[left]+arr2[right];

            if (sum==0){
                System.out.println(arr2[left]+" "+arr2[right]);
            }else if (sum>0){
                right--;
            }
            else{
                left++;
            }
        }
//        TIME COMPLEXITY 0(N) = LENEAR


    }
}
