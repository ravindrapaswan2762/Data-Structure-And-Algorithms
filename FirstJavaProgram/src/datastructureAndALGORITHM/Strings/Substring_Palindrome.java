package datastructureAndALGORITHM.Strings;

import java.util.Scanner;

public class Substring_Palindrome {
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "sbccbc";

        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                String sbs = s.substring(i, j);
                if(isPalindrome(sbs)){
                    System.out.println(sbs);
                }
            }
        }
    }
}
