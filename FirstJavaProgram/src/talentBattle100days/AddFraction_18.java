package talentBattle100days;

import java.util.Scanner;

public class AddFraction_18 {
    static int gcd(int a, int b){
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();

        int x = (n1*d2) + (d1*n2);
        int y = d1*d2;

        int gcdNo = gcd(x, y);

        System.out.println(x/gcdNo+"/"+y/gcdNo);


    }
}
