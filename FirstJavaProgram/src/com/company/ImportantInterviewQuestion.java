package com.company;

public class ImportantInterviewQuestion {
    public static void main(String[] args) {
//        String str1 = "cat";
//        String str2 = "ac ";
//        boolean IsAnagram = false;
//
//        boolean visited[] = new boolean[str2.length()];
//
//        if (str1.length() == str2.length()){
//
//            for (int i = 0; i < str1.length(); i++) {
//
//                char c = str1.charAt(i);
//
//                for (int j = 0; j < str2.length(); j++) {
//
////                  # matching and checking visited or not
//                    if (str2.charAt(j) == c && !visited[j]) {
//                        visited[j] = true;
//                        IsAnagram = true;
//                        break;
//                    }
//
//                }
////              # if anagram=false, and visited[j]=false then break
//                if (!IsAnagram){
//                    break;
//                }
//
//
//            }
//        }
////      # if anagram=true then..(if true puted, under anagram variable)
//        if (IsAnagram){
//            System.out.println("IsAnagrame is : "+IsAnagram);
//        }
//        else {
//            System.out.println("IsAnagrame is : "+IsAnagram);
//        }
// #####################################  OR OR OR ####################################
//        String a = "121";
//        String b = "121";
//        boolean IsAnagram = true;
//
//        int al[] = new int[256];
//        int bl[] = new int[256];
//
//        for (char c: a.toCharArray()){
//            int index = (int) c;
//            al[index]++;
//        }
//        for (char c: b.toCharArray()){
//            int index = (int) c;
//            al[index]--;
//        }
//        for (int i=0; i<256; i++){
//            if (al[i] != bl[i]){
//                IsAnagram = false;
//                break;
//            }
//        }
//        if (IsAnagram){
//            System.out.println("IsAnagrame is : "+IsAnagram);
//        }
//        else {
//            System.out.println("IsAnagrame is : "+IsAnagram);
//        }
//################################## REVERSE WORD OF SENTENCE ########################
//        INPUT : The sky is blue
//        OUTPUT : blue is sky The

        String s = "   Ram eats mango          ";
        int i = s.length()-1;
        String ans = "";

        while (i >= 0){
            while (i>=0 && s.charAt(i)==' ')i--;
            int j = i;

            if(i<0) break;


            while (i>=0 && s.charAt(i) != ' ')i--;

            if (ans.isEmpty()){
                ans = ans.concat(s.substring(i+1, j+1));
            }
            else {
                ans = ans.concat(" "+s.substring(i+1, j+1));
            }

        }
        System.out.println(ans);










    }
}

