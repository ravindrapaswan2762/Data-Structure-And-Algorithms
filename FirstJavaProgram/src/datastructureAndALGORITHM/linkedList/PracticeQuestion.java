package datastructureAndALGORITHM.linkedList;

import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {

        LinkedList1 obj = new LinkedList1();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList");
        int size = sc.nextInt();
        System.out.println("Enter the element of LinkedList");
        for (int i=1; i<=size; i++){
            int val = sc.nextInt();
            obj.addLast(val);
        }

        obj.display();
        obj.reverse();
        obj.display();


    }
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList1{
        node head;
        node tail;
        int size;

        public void addLast(int val){
            if (this.size == 0){
                node temp = new node();

                temp.data = val;
                temp.next = null;

                head = tail = temp;
                size++;
            }
            else {
                node temp = new node();

                temp.data = val;
                temp.next = null;

                tail.next = temp;

                tail = temp;
                size++;
            }
        }
        public void display(){
            node temp = this.head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void reverse_Helper(node right, int floor){
            if (right == null){
                return;
            }
            reverse_Helper(right.next, floor+1);
            if (floor>=this.size/2){
                int temp = right.data;
                right.data = left.data;
                left.data = temp;

                left = left.next;
            }

        }
        node left;
        public void reverse(){
            left = head;
            reverse_Helper(head, 0);
        }


//  ----------------------
    }
}
