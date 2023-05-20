package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class Decimal_Octate {
    public static void main(String[] args) {
//      converting into  octet from decimal.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int x = getValueInBase(n,b);
        System.out.println(x);
    }
    public static int getValueInBase(int n, int b){
        int res = 0;
        int p = 1;
        while (n>0){
            int dig = n%b;
            res += dig*p;
            n = n/b;

            p = p*10;

        }
        return res;
    }
}
