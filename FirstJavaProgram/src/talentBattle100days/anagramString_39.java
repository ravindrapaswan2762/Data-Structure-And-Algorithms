package talentBattle100days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagramString_39 {
    public  static int Cfreq(String s, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s2.length(); i++){
            if (map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            }else {
                return Integer.MIN_VALUE;
            }
        }

        int ct = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            ct += entry.getValue();
        }
        return ct;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int cf = Cfreq(s1, s2);

        if (cf==0){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
