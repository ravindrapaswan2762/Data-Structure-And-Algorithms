package datastructureAndALGORITHM.kmpAlgorithm;

public class CalculatingKMP extends CalculatingIPStable {
    private static int[] LPSarr;

    public static void main(String[] args) {
//       i
//       a b c a b c a b l p s

//       j
//       a b c a b s

//       0 0 0 1 2 0

        boolean result;
        if (searchingSUBstring("abcabcablps", "abcabs")) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);

    }
    static boolean searchingSUBstring(String str, String substr){
        int length0f_str = str.length();
        int length0f_substr = substr.length();
        int[] lps = calculatingIPStable(substr);
        int i = 0;
        int j = 0;
        while (i<length0f_str){
            if (str.charAt(i) == substr.charAt(j)){
                i += 1;
                j += 1;
            }
            else {
                if (j != 0){
                    j = LPSarr[j-1];
                }
                else {
                    i = i+1;
                }
            }
            if (j == length0f_str){
                return true;
            }
        }
        return false;
    }
}
