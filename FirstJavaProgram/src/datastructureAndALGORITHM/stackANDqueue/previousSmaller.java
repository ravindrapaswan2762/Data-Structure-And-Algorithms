package datastructureAndALGORITHM.stackANDqueue;

import java.util.*;

public class previousSmaller {
    // Anuj Bhaiya..
    public static int[] preSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];

        for (int i=0; i< arr.length; i++){
            while (st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if (st.empty()){
                pse[i] = -1;
            }else {
                pse[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return pse;
    }
    public static int[] nextSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];

        for (int i=arr.length-1; i>=0 ; i--){
            while (st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if (st.empty()){
                nse[i] = -1;
            }else {
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }

    public static int[] preGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[arr.length];

        for (int i=0; i< arr.length; i++){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if (st.empty()){
                pge[i] = -1;
            }else {
                pge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return pge;
    }
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if (st.empty()){
                nge[i] = -1;
            }else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 10, 5, 8, 8, 20, 15, 3, 12};
        int[] pse = preGreater(arr);
        for (int i=0; i<pse.length; i++){
            System.out.print(pse[i]+" ");
        }
        System.out.println();
        //-----------------------------------------------
        int[] nse = nextGreater(arr);
        for (int i=0; i<nse.length; i++){
            System.out.print(nse[i]+" ");
        }


    }
}
