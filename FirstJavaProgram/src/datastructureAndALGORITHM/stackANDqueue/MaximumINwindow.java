package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumINwindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
//      -------------------------
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;
//      puting the next greater element in nge
        for (int i= args.length-2; i>=0; i--){
            while (st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if (st.size()==0){
                nge[i] = arr.length;
            }else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
//      -----------------------
//      entering a loop to find the max of window starting ata i.
        int j = 0;
        for (int i=0; i<= arr.length-k; i++){
            if (j<i){
                j = i;
            }
            while (nge[j] < i+k){
//              continue jump on next greater till window range
                j = nge[j];
            }
            System.out.println(arr[j]);
        }
    }
}
