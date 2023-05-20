package datastructureAndALGORITHM.stackANDqueue;

import com.company.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MergeOverlapingINTERVALS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++){
            String line = br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[0]);
        }

        mergeOverlappingIntervals(arr);
    }
    public static void mergeOverlappingIntervals(int[][] arr){
        pair[] pairs = new pair[arr.length];

        for (int i=0; i<arr.length; i++){
            pairs[i] = new pair(arr[i][0], arr[i][1]);
        }
//        Arrays.sort(pairs);

        Stack<pair> st = new Stack<>();
        for (int i=0; i<pairs.length; i++){
            if (i==0){
                st.push(pairs[i]);
            }
            else {
                pair top = st.peek();

                if (pairs[i].strt > top.end){
                    st.push(pairs[i]);
                }
                else {
                    top.end = Math.max(top.end, pairs[i].end);
                }
            }
        }
        Stack<pair> res = new Stack<>();
        while (st.size()>0){
            res.push(st.pop());
        }
        while (st.size()>0){
           pair p = res.pop();
            System.out.println(p.strt+" "+p.end);
        }
    }

    public static class pair implements Comparable<pair>{
        int strt;
        int end;
        pair(int strt, int end){
            this.strt = strt;
            this.end = end;
        }

        @Override
//      this > other return +ve
//      this < other return -ve
//      this = other return 0
        public int compareTo(pair other) {
            if (this.strt != other.strt){
                return other.strt - other.strt;
            }
            else {
                return other.end - other.end;
            }
        }
    }
}


