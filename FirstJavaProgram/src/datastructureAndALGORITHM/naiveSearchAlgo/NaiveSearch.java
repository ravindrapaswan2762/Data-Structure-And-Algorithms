package datastructureAndALGORITHM.naiveSearchAlgo;

public class NaiveSearch {
    public static void main(String[] args) {
        boolean result = naiveSearch("hello world", "worl");
        System.out.println(result);

    }
    static boolean naiveSearch(String str, String SubStr){

        for (int i=0; i<str.length(); i++){

            for (int j=0; j<SubStr.length(); j++){

                if (str.charAt(i+j) != SubStr.charAt(j)){
                    break;
                }
                else if (j == SubStr.length()-1){
                    return true;
                }
                System.out.println();
            }
        }
        return false;
    }
}
//    TIME COMLEXITY = O(N*N) = O(N^2) = QUADRATIC