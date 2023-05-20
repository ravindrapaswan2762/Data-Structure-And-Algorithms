package datastructureAndALGORITHM.slidingWindows;

public class MainClass {
    //To, find out a sliding window problem :-
    //(1) First thing is, we have given something like an "Array" | OR | "String"
    //(2) Second thing is, they are talking about either "subsequence" | OR | "substring"
    //(3) And third most thing is, either we have given a "window size i.e. k" | OR | we have to "manually find out window size"
    //Now, using above keys let's understand wether this problem is of a sliding window or not.

    //> Are they talking about, "Array" or "String" --> yes they are talking about "string" +1 point
    //> Are they asking to find out "subsequence" or "substring" --> yes they are talking about "substring" +1 point
    //> Do, we have given a window size --> No, we don't have

    //Total score is "2 / 3" so, it's a 100% sliding window problem. If your score lies from 2/3 to 3/3 that's a gauranteed sliding window problem //

    public static void TemplateForFixSizeWindow(){
//         while(j<size()){

//             calculation happens here

//             if(WindowSize<k){
//                 j++;
//             }
//             if(WindowSize==k){
//                 (1): get answer from calculation.
//                 (2): and do window slide.
//             }
//         }
    }
    public static void main(String[] args) {
        // array/string + sub-array/sub-string + window size(k)

        //TWO TYPES:
        //Fix size sliding window {means K is given}
        //Variable size sliding window {means K is not given}, <-- extra use ds like, map, set...

        int[] arr = new int[]{4, 2, 7, 8, 5, 3, 1, 4, 1, 3, 2, 8};
        int i = 0;
        int j = 0;
        int k = 3; // window size
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j<arr.length){
            sum += arr[j]; // calculation area

            if (j-i+1<k){
                j++;
            }
            else if (j-i+1==k){
                max = Math.max(max, sum); // finding ans from calculation area

                sum -= arr[i]; // removing first element from sum

                i++; // for maintaining window size of k
                j++; // for maintaining window size of k

            }
        }
        System.out.println(max);
    }
}
