package datastructureAndALGORITHM.arrays.kadansalgorithms;

public class KadansAlgo {
    public static int maxSubArray(int[] nums) {
        //Kadan's Algorithm O(N), subarrays
        int maxSum = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {

            curSum += nums[i];

            maxSum = Math.max(curSum, maxSum);

            if (curSum<0){
                curSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(arr);
        System.out.println(res); // MaxSumSubArayS -> [4,-1,2,1]
    }
}
