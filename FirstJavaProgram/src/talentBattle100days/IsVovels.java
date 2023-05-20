package talentBattle100days;

import java.util.Scanner;

public class IsVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  a-z 97-122,  A-Z 65-90
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            char ch = s.charAt(0);
            if (ch>='a' && ch<='z' || ch>='A'&&ch<='Z'){
                if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                    System.out.println("Vovels");
                }else{
                    System.out.println("Constant");
                }
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}
