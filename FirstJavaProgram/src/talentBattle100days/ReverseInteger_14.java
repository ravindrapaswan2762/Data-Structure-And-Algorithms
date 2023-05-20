package talentBattle100days;

import java.util.Scanner;

class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = n+"";
        int l = s.length();

        int p = 1;
        int ans = 0;
        while (l>1){
            p = p*10;
            l--;
        }

        while (n>0){
            int dig = n%10;
            n = n/10;

            ans += dig*p;
            p = p/10;
        }
        System.out.println(ans);
    }
}
