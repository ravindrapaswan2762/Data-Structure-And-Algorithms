package talentBattle100days;

import java.util.Scanner;

public class reverseString_28 {
    public static String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);
        int s = 0;
        int e = str.length()-1;
        while (s<=e){
            char temp = str.charAt(s);
            sb.setCharAt(s, str.charAt(e));
            sb.setCharAt(e, temp);
            s++;
            e--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String s = reverseStr(str);
        System.out.println(s);

    }
}
