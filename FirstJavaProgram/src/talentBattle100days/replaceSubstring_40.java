package talentBattle100days;

import java.util.Scanner;

public class replaceSubstring_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int i=0;
        int temp = i;
        while (i<s1.length()){
            if (s2.charAt(0) != s1.charAt(i)){
                i++;
            }else {
                break;
            }
        }

        int j = 0;
        while (j<s2.length()){
            if (s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else {
                break;
            }
        }
        System.out.println(s3+s1.substring(0, temp)+s1.substring(j));

    }
}
