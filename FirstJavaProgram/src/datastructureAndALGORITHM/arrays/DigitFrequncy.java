package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class DigitFrequncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int ct = 0;
        while (n!=0){
            int dig = n%10;
            if(dig==target){
                ct++;
            }
            n = n/10;
        }
        System.out.println(ct);
    }
}
