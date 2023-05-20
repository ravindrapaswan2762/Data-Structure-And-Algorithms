package datastructureAndALGORITHM.arrays;

public class RotateArray {
    public static void Reverse(String[] arr, int i, int j){
        int li = i;
        int ri = j;
        while (li<ri){
            String temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    public static void Rotate(String[] arr, int k){
        //checking, rotation will be right or left.
        k = k % arr.length;
        if (k<0){
            k = k + arr.length;
        }
        // part 1
        Reverse(arr, 0, arr.length-k-1);
        // part 2
        Reverse(arr, arr.length-k, arr.length-1);
        // all
        Reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
//       k=-1  -->   b  c  d  e  a, ---
//       k=0   -->   a  b  c  d  e  ---|
//       k=1   -->   e  a  b  c  d     |
//       k=2   -->   d  e  a  b  c     |
//       k=3   -->   c  d  e  a  b     |
//       k=4   -->   b  c  d  e  a  <--| if k<0, k = k + arr.length;
//       k=5   -->   a  b  c  d  e  <--| same k = k%arr.length, which is 0 rotation;
//       ----------------------------------------------------------
//          indexed-->    0  1  2  3  4   5  6  7
//       APPROACH: ex:  [ a  b  c  d  e | f  g  h ],     k=3, length=8
//       1: partition
//       2: part1 range [0, 4] which is [0, arr.length-(k-1)]
//       2: part2 range [5, 7] which is [arr.lenth-k, arr.length-1]
//       3: reverse part1
//       4: reverse part2
//       5: reverse all --> part1+part2


        String[] arr = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        Rotate(arr, 3);

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
