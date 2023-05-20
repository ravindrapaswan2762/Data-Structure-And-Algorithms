package datastructureAndALGORITHM.stackANDqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuildCustomQueue {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue q = new CustomQueue(n);
        String str = br.readLine();

        while (str.equals("quit")==false){
            if (str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                q.add(val);
            }
            else if (str.startsWith("remove")){
                int val = q.remove();
                if (val != -1){
                    System.out.println(val);
                }
            }
            else if (str.startsWith("peek")){
                int val = q.peek();
                if (val != -1){
                    System.out.println(val);
                }
            }
            else if (str.startsWith("size")){
                System.out.println(q.size());
            }
            else if (str.startsWith("display")){
                q.display();
            }
            str = br.readLine();
        }

    }

    public static class CustomQueue{
        int data[];
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        void add(int val){
            if (size== data.length){
//                System.out.println("Queue Overflow");

//                ------------------------------------ for dynamic Queue.
                int[] newData = new int[2 * data.length];
                for (int i=0; i<size; i++){
                    int idx = (front+i)%data.length;
                    newData[i] = data[idx];
                }
                data = newData;
                front = 0;

                int idx = (front+size)%data.length;
                data[idx] = val;
                size++;
            }
            else{
                int idx = (front+size)%data.length;
                data[idx] = val;
                size++;
            }
        }
        int remove(){
            if (size==0){
                System.out.println("Stack Underflow");
            }
            else {
                int val = data[front];
                front = (front+1)%data.length;
                size--;
                return val;
            }
            return 0;

        }
        int peek(){
            if (size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            else {
                return  data[front];

            }
        }

        int size(){
            return size;
        }
        void display(){
            for (int i=0; i<size; i++){
                int idx = (front+i)%data.length;
                System.out.print(data[idx]+" ");
            }
            System.out.println();

        }
    }
}
