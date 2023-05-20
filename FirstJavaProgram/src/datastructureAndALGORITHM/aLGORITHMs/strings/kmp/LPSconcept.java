package datastructureAndALGORITHM.kmp;

public class LPSconcept {
    public static void main(String[] args) {
        //LPS: longest proper prefix which is also a proper suffix
        // In proper prefix and proper suffix we cannot consider all string.

        String s = "ababacd";
        int i = 1;
        int len = 0;

        int[] lps = new int[s.length()];

        while (i < s.length()){
            if (s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else {
                if (len>0){
                    len = lps[len-1];
                }else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        for (int j=0; j<lps.length; j++){
            System.out.print(lps[j]+" ");
        }
    }
}
