package datastructureAndALGORITHM.CNCP.StackCNCP.stackUsingArrays;

import datastructureAndALGORITHM.CNCP.StackCNCP.StackEmptyException;
import datastructureAndALGORITHM.CNCP.StackCNCP.StackFullException;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        System.out.println(stack.top());

        stack.top();
        stack.pop();
        stack.size();
        stack.isEmpty();
    }
}
