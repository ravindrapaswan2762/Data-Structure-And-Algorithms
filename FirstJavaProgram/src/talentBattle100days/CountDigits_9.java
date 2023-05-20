package talentBattle100days;

import java.util.Scanner;

public class CountDigits_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();

        int ct = 0;
        while (dig>0){
            int x = dig%10;
            dig = dig/10;
            ct++;
        }
        System.out.println(ct);
    }
}
