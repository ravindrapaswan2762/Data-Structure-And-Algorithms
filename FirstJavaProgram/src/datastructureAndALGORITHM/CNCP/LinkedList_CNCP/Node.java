package datastructureAndALGORITHM.CNCP.LinkedList_CNCP;

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node(T data){
        this.data = data;
    }

    public static void print(Node head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
