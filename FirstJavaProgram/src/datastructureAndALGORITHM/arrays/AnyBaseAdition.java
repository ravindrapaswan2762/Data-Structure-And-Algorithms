package datastructureAndALGORITHM.arrays;

import java.util.Scanner;

public class AnyBaseAdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(); // b == base
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int x = getValue(b, n1, n2);
        System.out.println(x);
    }
    public static int getValue(int b, int n1, int n2){
        int res = 0;
        int c = 0; // c == carry
        int p = 1; // p == power

        while (n1>0 || n2>0 || c>0){
            int d1 = n1%10; // digit 1
            int d2 = n2%10; // digit 2
            n1 = n1/10;
            n2 = n2/10;

            int d = d1+d2+c;

            c = d/b;
            d = d%b;

            res += d*p;
            p = p*10;
        }
        return res;
    }
}
