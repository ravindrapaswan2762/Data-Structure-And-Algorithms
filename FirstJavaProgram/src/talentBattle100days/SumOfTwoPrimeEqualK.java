package talentBattle100days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfTwoPrimeEqualK {
    public static boolean isPrime(int x){
        for (int i=2; i<x; i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=2; i<n; i++){
            if (isPrime(i)){
                list.add(i);
            }
        }

        Collections.sort(list);
        int s = 0;
        int e = list.size()-1;
        while (s<=e){
            if (list.get(s)+list.get(e)<n){
                s++;
            }else if (list.get(s)+list.get(e)>n){
                e--;
            }else {
                System.out.println(n+" can be expressed as sum of "+list.get(s)+" "+list.get(e));
                break;
            }

        }
    }
}
