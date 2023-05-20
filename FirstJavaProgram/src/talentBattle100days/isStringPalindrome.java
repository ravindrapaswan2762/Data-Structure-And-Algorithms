package talentBattle100days;

import java.util.Scanner;

public class isStringPalindrome {
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        boolean is = true;
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)){
                is = false;
                return is;
            }
            i++;
            j--;
        }
        return is;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(isPalindrome(s));

    }
}
