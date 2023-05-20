package datastructureAndALGORITHM.Strings;

public class StringCompression {
    public static String Compression1(String s){
        String res = s.charAt(0)+"";

        for (int i=1; i<s.length(); i++){
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            if (curr != pre){
                res += curr+"";
            }
        }
        return res;
    }
    public static String Compression2(String s){
        String res = s.charAt(0)+"";
        int ct = 1;

        for (int i=1; i<s.length(); i++){
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            if (curr == pre){
                ct++;
            }else {
                if(ct>1){
                    res += ct+"";
                    ct = 1;
                }
                res += curr+"";
            }
        }
        if (ct>1){
            res += ct+"";
            ct = 1;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "aaabbcccxyxddaeefff";
        String x = Compression1(s);
        System.out.println(x);
        String y = Compression2(s);
        System.out.println(y);
    }
}
