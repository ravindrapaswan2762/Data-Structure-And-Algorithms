package talentBattle100days;

import java.util.Scanner;

public class StrongNumber_16 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sum = 0;
            for (int i=1; i<=n/2; i++){
                if (n%i==0){
                    sum += i;
                }
            }
            if (sum==n){
                System.out.println("Perfect Number");
            }else {
                System.out.println("Not a perfect number");
            }

        }catch (Exception e){
            return;
        }
    }
}
