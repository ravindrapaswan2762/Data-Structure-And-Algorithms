package CSESproblemSET.IntroductoryProblems;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        3 10 5 16 8 4 2 1

        while (n != 1){

            System.out.print(n+" ");

            if (n%2==0){
               n = n/2;
            }
            else {
                n = (n * 3) + 1;
            }
        }
        if (n == 1){
            System.out.print(n+" ");
        }

    }
}
