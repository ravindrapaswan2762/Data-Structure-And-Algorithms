package datastructureAndALGORITHM.CNCP.StackCNCP.stackUsingLinkedList;

import datastructureAndALGORITHM.CNCP.StackCNCP.StackEmptyException;
import datastructureAndALGORITHM.CNCP.StackCNCP.StackFullException;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i=0; i< arr.length; i++){
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
