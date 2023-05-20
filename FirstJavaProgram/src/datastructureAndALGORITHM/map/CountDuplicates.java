package datastructureAndALGORITHM.map;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.*;

public class CountDuplicates {


    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 1, 2, 2, 2, 30, 56, 56};

        HashMap<Integer, Integer> map = new HashMap();

        for(int val  : arr) {
            if(  map.containsKey(val)   ) {
                map.put(val, map.get(val) + 1);
            }
            else {
                map.put(val, 1);
            }
        }
        map = sortByValue(map);
        System.out.println(map);

        for(Entry<Integer, Integer> entry: map.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() %2==1) {
//                System.out.println(entry.getKey());
                break;
            }
        }
}}
