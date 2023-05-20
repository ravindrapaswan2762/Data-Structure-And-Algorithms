package talentBattle100days;

import java.util.Scanner;

public class FactSum_15 {
    public static int factSum(int n, int sum){
        if (n==0){
            return sum;
        }

        sum = n * factSum(n-1, sum);

        return sum;
    }
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp = n;
            int sum = 0;
            while (n>0){
                int dig = n%10;
                n = n/10;
                sum += factSum(dig, 1);
            }

            if (sum==temp){
                System.out.println("Strong number");
            }else {
                System.out.println("Not a strong number");
            }

        }catch (Exception e){
            return;
        }
    }
}
