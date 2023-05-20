package datastructureAndALGORITHM.CNCP.hashmapCNCP;

public class Notes {
//    KEY--> [Hash Function]
//                |
//                |---[Hashcode function]--> i (Large Integer).
//                |---[Compression function]--> i, final integer in bucket/arr size range.

//    Colission Handling: when same Integer gives twice by hashcode then colission happens.
//                      1. seperate chaining/closed hashing-> store multiple pairs through linkedList in same idx
//                      2. open addressing-> HashFunction(key)+f(i)
//                                                     1. linear probing->    f(i)==> i          where f(0)==>0
//                                                     2. Quadratic probing-> f(i)==> i^2        where f(0)==>0
//                                                     3. Double Hashing->    f(i)==> i * h'(a), where f(0)==>0
//
//   int[] pair = new int[n];
//   array[i] = {Key, Value}
//    ---------------------------------------------------------------------- TIME COMPLEXITY
//    HashCode + traversing on linkedList at perticular idx ==> O(l)+O(n)==> O(n)==> total number of entries/nodes
//                                  total number of entries/nodes may be large at perticular index of buckets


//    --------------------------------------- BUT---------------------------
//    Rehashing: increase bucket size, and add only 3 nodes at every index
//               then O(l)+O(3)--> O(1)      b/c [ O(l)~O(1) and O(3)~O(1) ]
//               [n/b<=0.7], if n/b crosses 0.7 then increase bucket size
//                           n is the total number of nodes in the bucket.
//                           b is the bucket size.
//                           (n/b)==Load Facter


    public static void main(String[] args) {

    }
}
