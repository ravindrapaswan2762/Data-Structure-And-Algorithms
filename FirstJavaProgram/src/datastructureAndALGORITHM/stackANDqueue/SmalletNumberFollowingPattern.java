package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmalletNumberFollowingPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> st = new Stack<>();
        int num = 1;

        for (int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == 'd'){
                st.push(num);
                num = num + 1;
            }
            else{
                st.push(num);
                num = num + 1;

                while (st.size()>0){
                    System.out.print(st.pop()+" ");
                }
            }
        }
        st.push(num);
        while (st.size()>0){
            System.out.print(st.pop()+" ");
        }

    }
}
