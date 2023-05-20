package CSESproblemSET.IntroductoryProblems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        for (int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++){
            System.out.print(arr[i]+" ");
        }

        int totalsum = 0;
        for (int i=1; i<=n; i++){
            totalsum = totalsum + i;
        }

        int sum = 0;
        for (int i=0; i<n-1; i++){
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println(totalsum - sum);

    }
}
