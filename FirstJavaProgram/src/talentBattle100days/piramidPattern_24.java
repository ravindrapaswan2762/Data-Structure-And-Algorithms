package talentBattle100days;

import java.util.Scanner;

public class piramidPattern_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("*");
        int i = 1;
        while (i<=n-1){
            int j = i+i+1;
            while (j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
