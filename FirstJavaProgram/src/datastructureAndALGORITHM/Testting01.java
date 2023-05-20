/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Testting01
{
    public static void main (String[] args) throws java.lang.Exception {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-->0){
                long n = sc.nextLong();
                long[] arr = new long[(int) n];
                for (long i = 0; i < n; i++) {
                    arr[(int) i] = sc.nextLong();
                }
                int ct = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j < n; j++) {
                        int x = gcd(arr[i], arr[j]);
                        int y = lcm(arr[i], arr[j]);
                        if (x==y){
                            ct++;
                        }
                    }
                }
                System.out.println(ct);
            }


        }catch (Exception e){
            return;
        }


    }

    public static int gcd(long a, long b) {
        // Everything divides 0
        if (a == 0)
            return (int) b;
        if (b == 0)
            return (int) a;

        // base case
        if (a == b)
            return (int) a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static int lcm(long a, long b){
        int lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (int) ((a > b) ? a : b);

        // Always true
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}
