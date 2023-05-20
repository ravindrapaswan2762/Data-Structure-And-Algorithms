package talentBattle100days;

import java.util.Scanner;

public class replace0with1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==0){
            System.out.println(1);
            return;
        }

        int res = 0;
        int p = 1;
        while (n>0){
            int dig = n%10;
            n = n/10;
            if (dig==0){
               res = res + 1*p;
            }else {
                res = res + dig*p;
            }
            p = p*10;
        }
        System.out.println(res);
    }
}
