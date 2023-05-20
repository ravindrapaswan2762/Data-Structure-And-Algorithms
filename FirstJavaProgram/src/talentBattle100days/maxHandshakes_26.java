package talentBattle100days;

import java.util.Scanner;

public class maxHandshakes_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hs = (n*(n-1))/2;

        System.out.println(hs);
    }
}
