package a2ojLadders;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();

            int[] arr = new int[3];

            while (n-->0){

                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                arr[0] = arr[0] + x;
                arr[1] = arr[1] + y;
                arr[2] = arr[2] + z;


            }
            int co = arr[0] + arr[1] + arr[2];

            if (co==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }catch (Exception e){
            return;
        }
    }
}
