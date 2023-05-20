package talentBattle100days;

import java.util.Scanner;

public class removeAlphabets_32 {

    public static boolean isAlphabet(char ch){
        if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        for (int i=0; i<sb.length(); i++){
            if (isAlphabet(sb.charAt(i))){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}
