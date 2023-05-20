package talentBattle100days;

import java.util.Scanner;

public class fibonacci_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f = 0;
        int s = 1;
        if (n==1){
            System.out.println(0);
        }
        if (n>1){
            System.out.print(f+" ");
            System.out.print(s+" ");
        }

        for (int i=2; i<n; i++){
            int x = f+s;
            System.out.print(x+" ");
            f = s;
            s = x;
        }
    }
}
