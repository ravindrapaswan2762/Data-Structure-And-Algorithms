package datastructureAndALGORITHM.HashMap;

import java.util.*;

public class Iterator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (freqMap.get(a) != freqMap.get(b)) {
                    return freqMap.get(b) - freqMap.get(a);
                } else {
                    return a - b;
                }
            }
        });
        for (int num : freqMap.keySet()) {
            pq.offer(num);
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            int num = pq.poll();
            for (int i = 0; i < freqMap.get(num); i++) {
                res.add(num);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i != res.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}


//** short map according to key, value
//** iterate from the last