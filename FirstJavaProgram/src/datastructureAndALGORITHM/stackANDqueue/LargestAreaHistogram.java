package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
//      ------------------------ next smaller element index on the right
//      traverse RIGHT TO LEFT. and pop greater element.
        int[] rb = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr.length-1);
        rb[arr.length-1] = arr.length;

        for (int i = arr.length-2; i>=0; i--){
            while (st.size()>0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                rb[i] = arr.length;
            }
            else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

//      -------------------------- next smaller element index on the left
//      Traverse LEFT TO RIGHT. and pop greater element.
        int[] lb = new int[arr.length];
        st = new Stack<>();

        st.push(0);
        lb[0] = -1;

        for (int i=1; i<arr.length; i++){
            while (st.size()>0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                lb[i] = -1;
            }
            else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i=0; i<arr.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;

            if (area>maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);

    }
}
