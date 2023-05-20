package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class anybaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int x = decimalToAnyBase(n, b);
        System.out.println(x);
    }
    public static int decimalToAnyBase(int n, int b){
        int res = 0;
        int p = 1;
        while (n>0){
            int dig = n%b;
            n = n/b;

            res += dig*p;
            p = p*10;
        }
        return res;
    }
}
