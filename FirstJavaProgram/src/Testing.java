
import java.util.*;
import java.lang.*;

class Testing {

    public static String trimeSpace(String s){
        int i = 0;
        int j = s.length()-1;

        if (s.charAt(i)==' '){
            while (s.charAt(i)==' '){
                i++;
            }
        }
        if (s.charAt(j)==' '){
            while (s.charAt(j)==' '){
                j--;
            }
        }
        String sub = s.substring(i, j+1);
        System.out.println("trim:");
        System.out.println(sub);
        return sub;
    }

    public static String reverseWords(String s) {
        String str = trimeSpace(s);//the sky    is blue

        int i = str.length()-1;
        int j = str.length();

        String res = "";
        while(i>=0){
            if (j<str.length() && str.charAt(i)==' '&& str.charAt(j)==' '){
                j = i;
            }
            else if(str.charAt(i)==' '){
                String sub = str.substring(i+1, j);
                res = res+sub+" ";
                j = i;
            }else if(i==0){
                String sub = str.substring(i, j);
                res = res+sub;
            }

            i--;
        }
        System.out.println("reverse:");
        System.out.println(res);
        return res;
    }

    public static void main(String agrs[])
    {
        String str = "the sky    is blue";

        String x = reverseWords(str);
        System.out.println(x.length());
        System.out.println(x);


    }
}
