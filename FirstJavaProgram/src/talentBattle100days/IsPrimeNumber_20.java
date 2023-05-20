package talentBattle100days;

import java.util.Scanner;

public class IsPrimeNumber_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "";

        if(n==1){
            s = " is not a prime number";
        }else if (n==2){
            s = " is a prime number";
        }else {
            for (int i=2; i<n; i++){
                if (n%i==0){
                    s = " is not a prime number";
                    break;
                }else {
                    s = " is a prime number";
                }

            }

        }
        System.out.println(n+s);
    }
}
