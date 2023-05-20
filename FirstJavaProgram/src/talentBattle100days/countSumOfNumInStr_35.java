package talentBattle100days;

import java.util.*;

public class countSumOfNumInStr_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int sum = 0;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch-0>=48 && ch-0<=57){
                System.out.println(ch);
                sum += ch-48;
            }
        }
        System.out.println(sum);
    }
}
