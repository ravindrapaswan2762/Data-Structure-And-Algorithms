package datastructureAndALGORITHM.problemSolvingApproach;

public class IsAnagram {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "leloh";
        boolean isAnagram = false;

        if (string1.length() != string2.length()){
            System.out.println(isAnagram);
        }
        if (string1 == string2){

            char[] visitedarr = new char[string1.length()];


            int visited = 0;

            for (char i=0; i<string1.length(); i++){
                int count = 1;
                for (char j=0; j<string2.length(); j++){
                    if (string1.charAt(i) == string2.charAt(j)){
                        count = count+1;
                        System.out.println(count);
                        visitedarr[j] = (char) visited;

                    }
                    else if (string1.charAt(i) != string2.charAt(j)){
                        visitedarr[i] = (char) count;
                    }
                }

            }
            for (int i=0; i<visitedarr.length; i++){
                System.out.println(visitedarr[i]);
                if (visitedarr[i] != visited){
                    System.out.println(visitedarr[i]);
                }
            }



        }


    }
}
