package com.company;


import java.util.Scanner;

public class Testing2 {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        sc.nextLine();
//
//        for(int i=0; i<T; i++){
//            String str = sc.nextLine();
//
//            int even=0, odd=0, length = str.length();
//            char[] strEven = new char[length];
//            char[] strOdd = new char[length];
//
//            for (int j=0; j<length; j++){
//                if (j%2==0){
//                    strEven[even] = str.charAt(j);
//                    even++;
//                }
//                if (j%2==1){
//                    strOdd[odd] = str.charAt(j);
//                    odd++;
//                }
//            }
//            System.out.print(strEven);
//            System.out.print(" ");
//            System.out.println(strOdd);
//
//
//        }
//        --------------------------------------------------------------------------------
//        5
//        1 3 2 4 6
//        3
//        1
//        2
//        3
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();



        boolean check = true;
        int l = a.length-1;
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            for (int j=0; j<a.length; j++){

                for (int k=0; k<a.length; k++){
                    if (a[k] % x == 0 && a[l] % x != 0) {
                        l--;
                    } else if (a[i] % x != 0 && a[l] % x == 0) {
                        i++;
                    }
//                    System.out.print(a[i]);
                }
                System.out.print(a[i]);
            }
//            System.out.print(a[i]);


        }


    }
}
