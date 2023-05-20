package datastructureAndALGORITHM.Strings;

public class isPrimeNumber {
    public static boolean isPrime(int val){

        // p * q = x, then p&q !> root x, only one of them.
        // root val = x, so x*x = val, iterating till root val.
        for (int div=2; div*div<=val; div++){
            if (val%div==0){
                return false; // for not prime
            }
        }
        return true; // prime
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 12, 13, 15, 17, 20, 325};
        for (int i=0; i<arr.length; i++){
            boolean x = isPrime(arr[i]);
            if (x==false){
                System.out.println(arr[i]+": "+"Not Prime");
            }else {
                System.out.println(arr[i]+": "+"Prime");
            }
        }
    }
}
