package datastructureAndALGORITHM.recursion;

public class RecursiveFunction {
    public static void main(String[] args) {
        CountTillNumber(10);
    }
    static void CountTillNumber(int number){

        int count = 0;
        count = count + 1;
        if (count>number){
            return;
        }
        System.out.println("Count is : "+count);

        CountTillNumber(number);

    }
}
