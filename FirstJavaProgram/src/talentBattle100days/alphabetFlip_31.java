package talentBattle100days;

import java.util.Scanner;

public class alphabetFlip_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                sb.setCharAt(i, Character.toLowerCase(ch));
            }else {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
