package datastructureAndALGORITHM.arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30};

        int limit = (int) Math.pow(2, arr.length);
        for (int i=0; i<limit; i++){
            String set = "";
            int temp = i;

            for (int j=arr.length-1 ; j>=0; j--){
                int r = temp%2;
                temp = temp/2;
                if(r==0){
                    set = "-\t"+set;
                }else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
