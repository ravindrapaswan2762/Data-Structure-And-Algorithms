package talentBattle100days;

import java.util.Scanner;

public class IsPalindrome {
    public static Boolean IaPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);
        if (IaPalindrome(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }


    }
}
