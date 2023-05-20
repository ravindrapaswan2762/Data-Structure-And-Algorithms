package datastructureAndALGORITHM.stackANDqueue;
import java.io.*;
import java.util.Stack;

public class BuildNormalStack {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);
        String str = br.readLine();

        while (str.equals("quit")==false){
            if (str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }
            else if (str.startsWith("pop")){
                int val = st.pop();
                if (val != -1){
                    System.out.println(val);
                }
            }
            else if (str.startsWith("top")){
                int val = st.top();
                if (val != -1){
                    System.out.println(val);
                }
            }
            else if (str.startsWith("size")){
                System.out.println(st.size());
            }
            else if (str.startsWith("display")){
                st.display();
            }
            else if (str.startsWith("min")){
                st.min();
            }

            str = br.readLine();
        }


    }
    public static class CustomStack{
        int data[];
        int tos;

        //for min value, with constant coplexity
        Stack<Integer> minStack;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;

            minStack = new Stack<>();
        }

        void push(int val){
            if (tos== data.length-1){
                System.out.println("Stack Overflow");
            }
            else{
                tos++;
                data[tos] = val;

                if (minStack.size()==0 || val<=minStack.peek()){
                    minStack.push(val);
                }
            }
        }
        int pop(){
            if (tos==-1){
                System.out.println("Stack Underflow");
            }
            else {
                int val = data[tos];
                tos--;

                if (val==minStack.peek()){
                    minStack.pop();
                }
                return val;
            }
            return 0;
        }
        int top(){
            if (tos==-1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                return  data[tos];

            }
        }

        int size(){
            return tos+1;
        }
        void display(){
            for (int i=tos; i>=0; i--){
                System.out.print(data[i]+" ");
            }
            System.out.println();

        }
        void min(){
            if (size()==0){
                System.out.println("Stack Underflow");
            }
            else {
                System.out.println(minStack.peek());
            }
        }

    }
}
