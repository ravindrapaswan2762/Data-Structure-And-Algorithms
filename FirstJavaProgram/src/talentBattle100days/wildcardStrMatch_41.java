package talentBattle100days;

import java.util.Scanner;

public class wildcardStrMatch_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        boolean[][] dp = new boolean[p.length()+1][s.length()+1];

        for(int i=dp.length-1; i>=0; i--){
            for(int j=dp[0].length-1; j>=0; j--){

                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j] = true;
                }else if(i==dp.length-1){
                    dp[i][j] = false;
                }else if(j==dp[0].length-1){
                    if(p.charAt(i)=='*'){
                        dp[i][j] = dp[i+1][j];
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(p.charAt(i)=='?'){
                        dp[i][j] = dp[i+1][j+1];
                    }else if(p.charAt(i)=='*'){
                        dp[i][j] = dp[i+1][j] ||dp[i][j+1];
                    }else if(p.charAt(i)==s.charAt(j)){
                        dp[i][j] = dp[i+1][j+1];
                    }else{
                        dp[i][j] = false;
                    }
                }

            }
        }
        System.out.println(dp[0][0]);
    }
}
