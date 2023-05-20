package talentBattle100days;

import java.util.Scanner;

public class ArmstrongNumber_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int temp2 = n;

        int l = 0;
        while (n>0){
            n  = n/10;
            l++;
        }

        int res = 0;
        while (temp>0){
            int x = temp%10;
            temp = temp/10;

            res += Math.pow(x, l);
        }

        if (res == temp2){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }
    }
}
