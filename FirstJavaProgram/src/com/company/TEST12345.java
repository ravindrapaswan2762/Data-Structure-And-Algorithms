
// Java program to find the
// longest substring of vowels.
import java.util.*;

class TEST12345
{

    static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u');
    }

    static int longestVowel(String word){
        int count = 0, res = 0;
        char[] s = word.toCharArray();
//                      p
        String vovel = "a e i o u ";
        char[] volArr = vovel.toCharArray();
        int p = 0;
//
//        String str = "eiaaio aaaaeiiiiouuu ooaauuaeiu";
        if (word.length()<5){
            return 0;
        }

        for (int i = 0; i < s.length; i++){

            if (isVowel(s[i]) && s[i]==volArr[p]) {
                count++;

            }
            else if (p<volArr.length-1){
                if (isVowel(s[i]) && s[i]==volArr[p+1]) {
                    count++;
                }
            }
            else if (p == volArr.length-1){
                if (isVowel(s[i]) && s[i]==volArr[p]) {

                }
            }
            else
            {
                res = Math.max(res, count);
                count = 0;

                p = 0;



            }
        }


        int max = Math.max(res, count);
        System.out.println(max);
        System.out.println(s);
        return max;
    }

    // Driver code
    public static void main (String[] args)
    {
        TEST12345 obj = new TEST12345();
        String str = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        obj.longestVowel(str);


    }
}
// This code is contributed by Mr. Somesh Awasthi
