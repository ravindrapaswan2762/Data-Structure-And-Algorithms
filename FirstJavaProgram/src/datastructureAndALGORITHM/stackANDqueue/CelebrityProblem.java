package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++){
            String line = br.readLine();

            for (int j=0; j<n; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
    }
    public static void findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();

        for (int i=0; i< arr.length; i++){
            st.push(i);
        }
        while (st.size()>=2){
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1){
//              if i knows j then i is not celebrity.
                st.push(j);
            }
            else {
//              if i doesn't knows j then j is not celebrity.
                st.push(i);
            }
        }
        int pot = st.pop();
        for (int i=0; i< arr.length; i++){
            if (i != pot){
                if (arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("none");
                    return;
                }

            }
        }
        System.out.println(pot);
    }
}
