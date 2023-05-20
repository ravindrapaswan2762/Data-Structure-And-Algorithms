package datastructureAndALGORITHM.kmpAlgorithm;

import com.company.Arrays;

public class CalculatingIPStable {
    public static void main(String[] args) {
//       LPS : Longest Prefix Sufix, Table
//       a a b a a a c
//       0 1 0 1 2 2 0

        int[] result = calculatingIPStable("aabaaac");
        System.out.println(result);

    }
    static int[] calculatingIPStable(String SUBstr){
        int i = 1;
        int j = 0;
        int[] LPSarr = new int[SUBstr.length()];
//        Arrays.fill(SUBstr, 0);

        while (i<SUBstr.length()){
            if (SUBstr.charAt(i) == SUBstr.charAt(j)){
                LPSarr[i] = j + 1;
                i = i+1;
                j = j+1;
            }
            else {
                if (j != 0){
                    j = LPSarr[j-1];
                }
                else {
                    i = i+1;
                }
            }
        }
        return LPSarr;
    }
}
