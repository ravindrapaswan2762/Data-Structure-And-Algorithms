package CSESproblemSET.IntroductoryProblems;

import java.util.*;
import java.lang.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();
        str.trim().split(" ");

        char[] arr = new char[n];
        for (int i=0; i<n; i++){
            arr[i] = str.charAt(i);
        }
//
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//      -----------------------------------
        int gct = 0;
        int ct = 1;

        for (int i=0; i<arr.length; i++){
            ct = 1;

            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    ct++;
                }
                else {

                    if (ct>gct){
                        gct = ct;
                    }
                    break;

                }

            }

        }
//        System.out.println();
        System.out.println(gct);


    }
}
