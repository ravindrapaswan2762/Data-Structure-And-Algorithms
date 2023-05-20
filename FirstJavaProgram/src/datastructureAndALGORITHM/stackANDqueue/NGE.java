package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class NGE {

    public static void main(String[] args) throws IOException {
//      NGETR - Next Greater Element To,the Right.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] arr1 = NGETR1(arr);
        int[] arr2 = NGETR_Alternate(arr);

        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }

    public static int[] NGETR1(int[] array){
//      Traversing right to left.
        Stack<Integer> st = new Stack<>();
        int[] ngetr = new int[array.length];

        st.push(array[array.length-1]);
        ngetr[array.length-1] = -1;

        for (int i=array.length-2; i>=0; i--){
            while (st.size()>0 && array[i]>=st.peek()){
                st.pop();
            }
            if (st.size()==0){
                ngetr[i] = -1;
            }
            else {
                ngetr[i] = st.peek();
            }
            st.push(array[i]);
        }
        return ngetr;
    }
    public static int[] NGETR_Alternate(int[] array){
//      Traversing left to right.
        Stack<Integer> st = new Stack<>();
        int[] ngetr = new int[array.length];

        st.push(0);
        for (int i=1; i<array.length; i++){
            while (st.size()>0 && array[i]>array[st.peek()]){
                int poss = st.peek();
                ngetr[poss] = array[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0){
            int poss = st.peek();
            ngetr[poss] = -1;
            st.pop();
        }
        return ngetr;
    }

    public static int[] apan(int[] arr){
//      APPROACH - POP ANS PUSH
//      Next greater in the left.
//      span = differ b/w ith ant NGETL.

        Stack<Integer> st = new Stack<>();
        int[] span = new int[arr.length];
        st.push(0);

        for (int i=1; i<arr.length; i++){
            while (st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                span[i] = i+1;
            }
            else {
                span[i] = i - st.peek();
            }
        }
        return span;
    }






}
