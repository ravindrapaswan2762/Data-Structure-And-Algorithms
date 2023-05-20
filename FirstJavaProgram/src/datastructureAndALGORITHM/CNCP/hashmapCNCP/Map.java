package datastructureAndALGORITHM.CNCP.hashmapCNCP;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> bucket;
    int count;
    int numBuckets;
    Map(){
        bucket = new ArrayList<>();
        numBuckets = 5;
        for (int i=0; i<numBuckets; i++){
            bucket.add(null);
        }
    }


    public void reHash(){
        ArrayList<MapNode<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        for (int i=0; i<2*numBuckets; i++){
            bucket.add(null);
        }
        count = 0;
        numBuckets = 2*numBuckets;
        for (int i=0; i< temp.size(); i++){
            MapNode<K, V> head = temp.get(i);
            while (head != null){
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }
    public double LoadFacter(){
        return (1.0*count)/numBuckets;
    }
    //--------------------------------------
    public int getBucketIdx(K key){
        int hc = key.hashCode(); //Hashcoding
        int idx = hc%numBuckets;//compressing
        return idx;
    }
    public void insert(K key, V value){
        int bucketIdx = getBucketIdx(key);
        MapNode<K, V> head = bucket.get(bucketIdx);
        //if element is present, then just update it's value
        while (head != null){
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucket.get(bucketIdx);// head is resetting from null.

        //if element is not present then indert at 0th possition in linked list.
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        bucket.set(bucketIdx, newNode);
        count++;

        //rehashing
        double LoadFacter = (1.0*count)/numBuckets;
        if (LoadFacter>0.7){
            reHash();
        }

    }
    //--------------------------------------
    public int size(){
        return count;
    }
    //-------------------------------------
    public V getValue(K key){
        int bucketIdx = getBucketIdx(key);
        MapNode<K, V> head = bucket.get(bucketIdx);

        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    //-------------------------------------
    public V removeKey(K key){
        int bucketIdx = getBucketIdx(key);
        MapNode<K, V> head = bucket.get(bucketIdx);
        MapNode<K, V> prev = null;
        while (head != null){
            if (head.key.equals(key)){
                if (prev != null){
                    prev.next = head.next;
                }else {
                    bucket.set(bucketIdx, head.next);
                }
                count--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}
