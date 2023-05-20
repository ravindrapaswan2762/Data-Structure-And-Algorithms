package datastructureAndALGORITHM.CNCP.QueueCNCP.queueUsingLL;

import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueEmptyException;
import datastructureAndALGORITHM.CNCP.QueueCNCP.queueUsindArray.QueueUsingArray;

public class queueUSE {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL q = new QueueUsingLL();
        int[] arr = new int[]{10, 20, 30, 40, 50};
        for (int val: arr){
            q.enqueue(val);
        }

        while (!q.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}
