package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int z = getValue(n, b1, b2);
        System.out.println(z);

    }
    public static int getValue(int n, int b1, int b2){
        int x = anyBaseToDecimal(n, b1);
        int y = decimalToAnyBase(x, b2);
        return y;
    }
    public static int anyBaseToDecimal(int n, int b){
        int res = 0;
        int p = 1;
        while (n>0){
            int dig = n%10;
            n = n/10;

            res += dig*p;
            p = p*b;
        }
        return res;
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
