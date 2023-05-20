package datastructureAndALGORITHM.CNCP.QueueCNCP.queueUsindArray;

import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueEmptyException;
import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueFullException;

public class QueueUsingArrayUSE {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        QueueUsingArray q = new QueueUsingArray();
        int[] arr = new int[]{10, 20, 30, 40, 50};
        for (int i=0; i< arr.length; i++){
            q.enqueue(arr[i]);
        }

        while (!q.isEmpty()){
            System.out.println(q.dequeue());
        }

    }
}
