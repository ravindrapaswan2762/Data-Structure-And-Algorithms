package talentBattle100days;

import java.util.Scanner;

public class Factorial_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int fact = 1;
        while (x>0){
            fact = fact*x;
            x--;
        }
        System.out.println(fact);
    }
}
