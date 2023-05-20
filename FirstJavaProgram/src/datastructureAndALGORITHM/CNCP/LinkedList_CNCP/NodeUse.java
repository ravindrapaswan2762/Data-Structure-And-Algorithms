package datastructureAndALGORITHM.CNCP.LinkedList_CNCP;

import java.util.Scanner;

public class NodeUse {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> InsertRecursivly(Node<Integer> head, int data, int pos){
        if (head==null && pos>0){
            return head;
        }

        if (pos==0){
            Node<Integer> newNode = new  Node<>(data);
            newNode.next = head;
            return newNode;
        }else {
            head.next = InsertRecursivly(head.next, data, pos-1);
            return head;
        }
    }
    public static Node<Integer> DeleteRecursivly(Node<Integer> head, int pos){
        if (head==null && pos>0){
            return head;
        }

        if (pos==0){
            head = head.next;
            return head;
        }

        if (pos==1){
            head.next = head.next.next;
            return head;
        }else {
            head.next = DeleteRecursivly(head.next, pos-1);
            return head;
        }
    }
    public static Node<Integer> ReverseRecursivly(Node<Integer> head){
        if (head==null){// for empty list or null point exceptions
            return head;
        }

        if (head.next==null){// for one length
            return head;
        }
        else {
            Node<Integer> smallHead = ReverseRecursivly(head.next);
            Node<Integer> reverseTail = head.next;
            reverseTail.next = head; // 1->[2->3->4]
            head.next = null;

            return smallHead;
        }
    }

    public static Node<Integer> CreateLinkedList(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null;
        Node<Integer> tail = null;

        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> currnode = new Node<>(data);
            if (head==null){
                // Make this node as head and tail
                head = currnode;
                tail = currnode;
            }else {
                tail.next = currnode;
                tail = currnode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList();
        head = ReverseRecursivly(head);
        print(head);
    }
}
