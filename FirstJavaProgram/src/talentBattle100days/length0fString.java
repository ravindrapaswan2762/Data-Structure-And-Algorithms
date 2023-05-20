package talentBattle100days;

import java.util.Scanner;

public class length0fString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s+"@";

        int l = 0;
        int i = 0;
        while (s.charAt(i) != '@'){
            l++;
            i++;
        }
        System.out.println(l);

    }
}
