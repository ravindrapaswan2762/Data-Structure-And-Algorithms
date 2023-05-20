package talentBattle100days;

import java.util.Scanner;

public class capitalize1stAndLastChar0fWordInStr_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(s.length()-1, Character.toUpperCase(s.charAt(s.length()-1)));

        int j = s.length()-1;
        while (j>=0){
            char ch = s.charAt(j);
            if (ch==' '){
                sb.setCharAt(j+1, Character.toUpperCase(s.charAt(j+1)));
                sb.setCharAt(j-1, Character.toUpperCase(s.charAt(j-1)));
            }
            if (j==0){
                sb.setCharAt(j, Character.toUpperCase(ch));
            }
            j--;

        }
        System.out.println(sb);
    }
}
