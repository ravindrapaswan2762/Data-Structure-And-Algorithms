package datastructureAndALGORITHM.slidingWindows;

import java.util.*;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -4, -5, 6, 7, 8};
        int k = 3;

        Queue<Integer> ans = new LinkedList<>();
        int i = 0;
        int j = 0;

        while (j< arr.length){
            if (arr[j]<0){
                ans.add(arr[j]); // calculation area
            }
            if (j-i+1<k){ // making our slide of k size
                j++;
            }else if (j-i+1==k){
                //------------------------ geting answers from calculation area
                if (ans.size()==0){
                    System.out.print(0+" ");
                }else {
                    System.out.print(ans.peek()+" ");
                    if (arr[i]<0){
                        ans.remove();
                    }
                }
                //------------------------- window is sliding
                i++;
                j++;
            }
        }

    }
}
