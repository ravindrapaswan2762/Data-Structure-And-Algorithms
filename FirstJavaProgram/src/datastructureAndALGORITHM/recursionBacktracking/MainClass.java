package datastructureAndALGORITHM.recursionBacktracking;

import java.util.ArrayList;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
//      high level thinking:  1 Expectation
//                            2 Feth
//                            3 Connection of (Expectation -><- Feth)

//      low level thinking: dry run in stack for find base case.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,2};




    }
//  ---------------------------------------------------------------------------
//    Feth And Expectation Recursion :     ___
//                                        |    |
//                                   up   |    |   down
//                                        |    ---> store and print the value.

    public static void prrintDecreasing(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        prrintDecreasing(n-1);

    }
    public static void prrintIncresing(int n){
        if (n==0){
            return;
        }

        prrintIncresing(n-1);
        System.out.println(n);

    }
    public static void pdi(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }

//      feth on my child
        int fact1 = factorial(n-1);

        int fact = n*fact1;

        return fact;

    }
    public static int xToThePowerN(int x, int n){
        if (n==0){
            return 1;
        }

//      feth
        int xnm1 = xToThePowerN(x, n-1);   // xnm1 = x^n-1
        int xn = x * xnm1;  //  and then multiply itself(x) = x^n

        return xn;
    }
    public static int power(int x, int n){
        if (n==0){
            return 1;
        }

//      b/c  x^n == (x^n/2 + x^n/2) == 2* (x^n/2) if n even, otherwise  2*(x^n/2) * x
        int xnb2 = power(x, n/2);
        int xn = xnb2 * xnb2;

        if (n%2==1){
            xn = xn * x;
        }

        return xn;
    }
    public static void TowerofHanoi(int n, String T1, String T2, String T3){
//       |             |          |             T = Tower
//     1 |  --->     1 |          |             RULES:  1  move one disk at a time
//     2 |  --->     2 |          |                     2  never place large disk on a smaller disk
//     3 |  --->     3 |          |                     3  you can move the disk only on the top
//   ---------     ---------  ---------
//       T1            T2        T3

        if (n==0){
            return;
        }
        TowerofHanoi(n-1, T1, T3, T2);      //feth:- moving (n-1) disks in [T3] to T1 with folowing rules
        System.out.println(n+"["+T1+" --> "+T2+"]");     // moving largest disk in [T2] to T1
        TowerofHanoi(n-1, T3, T2, T1);      //feth:- then moving (n-1)disks in [T2] to T3



    }
    public static int idx = 5;
    public static void displayAraay(int[] arr, int idx){
        if (idx>=arr.length){
            return;
        }

//      expectation: if passing, display(arr, idx=0) = print  arr[0], arr[1], arr[2].......arr[n-1]
//      feth: display(arr, idx=1) = print arr[1], arr[2].......arr[n-1]

        System.out.println(arr[idx]);
        displayAraay(arr, idx+1);


    }
    public static void displayAraayReverse(int[] arr, int idx){
        if (idx>=arr.length){
            return;
        }

//      expectation: if passing, display(arr, idx=0) = print  arr[n-1], arr[n-2],.......arr[1], arr[0]
//      feth: display(arr, idx=1) = print arr[n-1], arr[n-2].......arr[1]


        displayAraayReverse(arr, idx+1);
        System.out.println(arr[idx]);


    }
    public static int max0fArray(int[] arr, int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int x = max0fArray(arr, idx+1);
        int z = Math.max(x, arr[idx]);
        return z;
    }
    public static int first0curenceIndex(int[] arr, int idx, int data){

        if (idx==arr.length){
            return -1;
        }


        if (arr[idx]==data){
            return idx;
        }
        else {
            int x = first0curenceIndex(arr, idx+1, data);
            return x;
        }

    }
    public static int last0curenceIndex(int[] arr, int idx, int data){
        if (idx >= arr.length){
            return -1;
        }
//      feth
        int x = last0curenceIndex(arr, idx+1, data);

        if (x==-1){
            if (arr[idx]==data){
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return x;
        }
    }
//  ---------------------------------------------------------------------
    public static ArrayList all0curenceIndex(int[] arr, int idx, int data, ArrayList<Integer> list){

        if (idx==arr.length){
            return list;
        }

        if (arr[idx]==data){
            list.add(idx);
        }

        ArrayList res = all0curenceIndex(arr, idx+1, data, list);

        return res;

    }
    public static ArrayList all(int[] arr){
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList x =  all0curenceIndex(arr, 0, 3, alist);
        return x;
    }
//  ----------------------------------------------------------------------
    public static ArrayList getAllSubSequences(String str){
        // ** unlike substring, subsequences do not need to be contigious so for aba -> aa is perfect
        // it can have duplicates element in substrings, also can have duplicate substring
        // a epty and full string is also like a subString
        // total 2^n subsequences, n = str.length()
        // subsequences ex:- aba = "", a, b, ab, aa, ba, a, aba


        //A subString is a contiguous part of string, (oreder is same like original)
        // canot have duplicates element in substring, also cannot duplicate substring
        // a epty and full string is also like a subString
        // n = str.length(), then it will be total n(n+1)/2 subSrings
        // subSrings ex:- abcd = "",a,ab,abc,abcd,   b,bc,bcd,  c,cd, d (oreder is same like original)
//                   ex:- aba = "",a, b, ab, ba, aba, in this duplicates in not present, but can only in original

        if (str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);  // only one character of starting index
        String ros = str.substring(1); // from index 1 to (n-1) index

        //feth: from index 1 to n-1
        ArrayList<String> rres = getAllSubSequences(ros);

        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : rres){
            mres.add("_"+rstr);
        }
        for (String rstr : rres){
            mres.add(ch+rstr);
        }
        return mres;
    }
//  ----------------------------------------------------------------------
    static String[] codes = new String[]{".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList getKeypadCombination(String str){
        if (str.length()==0){
            ArrayList<String> tlist = new ArrayList<>();
            tlist.add("");
            return tlist;
        }
        // ex:- 678
        int ch = str.charAt(0);  // "6"

        String subStr = str.substring(1); // "78"

        ArrayList list =  getKeypadCombination(subStr); // 6 words of 78 is geting

        ArrayList<String> mlist = new ArrayList<>();  // but we need 24 words to 678

        String codeforch = codes[ch-'0']; // "6" --> 6
        for (int i=0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);

            for (Object item: list){
                mlist.add(chcode+""+item);
            }

        }

        return mlist;

    }
    //--------------------------------------------------------------------
    public static ArrayList<String> getStairsPath(int n, int des){
        // print all possible paths from nth stairs to destination(0th stairs),
        // Can walk (one,two, three) steps at a time
        if (n==0){
            ArrayList<String> tlist = new ArrayList<>();
            tlist.add("");
            return tlist;
        }
        else if (n<0){
            ArrayList<String> tlist = new ArrayList();
            return tlist;
        }

        ArrayList paths1 = getStairsPath(n-1, des);
        ArrayList paths2 = getStairsPath(n-2, des);
        ArrayList paths3 = getStairsPath(n-3, des);

        ArrayList<String> paths = new ArrayList();

        for (Object step : paths1){
            paths.add(1+"" + step);
        }
        for (Object step : paths2){
            paths.add(2+"" + step);
        }
        for (Object step : paths3){
            paths.add(3+"" + step);
        }

        return paths;
    }
    //--------------------------------------------------------------------
    public static ArrayList<String> getMazePath(int row, int col, int n, int m){
        // we can go only one step horizontal-right and one step vertical-down at a time

        if (row==n && col==m){
            ArrayList<String> tpaths = new ArrayList<>();
            tpaths.add("");
            return tpaths;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (col<m){
            hpaths = getMazePath(row, col+1, n, m);
        }
        if (row<n){
            vpaths = getMazePath(row+1, col, n, m);
        }

        ArrayList<String>  mpaths = new ArrayList<>();
        for (Object hpath : hpaths){
            mpaths.add("h"+hpath);
        }
        for (Object vpath : vpaths){
            mpaths.add("v"+vpath);
        }
        return mpaths;

    }
    //--------------------------------------------------------------------
    public static ArrayList<String> getMazePathWithJump(int sr, int sc, int dr, int dc){

        if (sr==dr && sc==dc){
            ArrayList<String> tpaths = new ArrayList<>();
            tpaths.add("");
            return tpaths;
        }

        ArrayList<String> mpaths = new ArrayList<>();

        // horizontal move at at time can be 1, 2, 3,....col
        for (int hm=1; hm<=dc-sc; hm++){
            ArrayList<String> hpaths = getMazePathWithJump(sr, sc+hm, dr, dc);
            for (String hpath : hpaths){
                mpaths.add("h"+hm+hpath);
            }
        }
        // vertical move at a time can be 1, 2, 3.....row
        for (int vm=1; vm<=dr-sr; vm++){
            ArrayList<String> vpaths = getMazePathWithJump(sr+vm, sc, dr, dc);
            for (Object vpath : vpaths){
                mpaths.add("v"+vm+vpath);
            }
        }
        // diagonal move at a time can be 1, 2, 3.....till posible under (row & col)
        for (int dm=1; dm<=dc-sc && dm<=dr-sr; dm++){
            ArrayList<String> dpaths = getMazePathWithJump(sr+dm, sc+dm, dr, dc);
            for (Object dpath : dpaths){
                mpaths.add("d"+dm+dpath);
            }
        }

        return mpaths;

    }

    // Level Option Recusion :- (base case) handle and then print value.
    //                              ^           direct print value on the top
    //                              |
    //                              |
    //                              |

    //------------------- another approach for reduce memory -------------
    public static void printSubsequences(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String restq = ques.substring(1);

        printSubsequences(restq, ans+ch);
        printSubsequences(restq, ans+"");
    }
    //------------------- another approach for reduce memory -------------
    public static void PrintKeypadCombination(String ques, String ans){
        // direct print the value instead of storing
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String restq = ques.substring(1);

        String codeforch = codes[ch-'0'];  // 'codes' named array is already created above.

        for (int i=0; i<codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            PrintKeypadCombination(restq, ans+cho);
        }

    }
    //--------------------------------------------------------------------
    public static void printStairPaths(int n, String path){
        if (n<0){
            return;
        }
        if (n==0){
            System.out.println(path);
            return;
        }

        printStairPaths(n-1, path+"1");
        printStairPaths(n-2, path+"2");
        printStairPaths(n-3, path+"3");


    }
    //--------------------------------------------------------------------
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path){
        // we can go only one step horizontal-right and one step vertical-down at a time
        if (sr==dr && sc==dc){
            System.out.println(path);
            return;
        }

        if (sc<dc){
            printMazePaths(sr, sc+1, dr, dc, path+"h");
        }
        if (sr<dr){
            printMazePaths(sr+1, sc, dr, dc, path+"v");
        }


    }
    //--------------------------------------------------------------------
    public static void printMazePathWithJump(int sr, int sc, int dr, int dc, String path){
        // horizontal move at at time can be 1, 2, 3,....col
        // vertical move at at time can be 1, 2, 3,....row
        // vertical move at at time can be 1, 2, 3,.... till posible in the map

        if (sr==dr && sc==dr){
            System.out.println(path);
            return;
        }

        for (int hm=1; hm<=dc-sc; hm++){
            printMazePathWithJump(sr, sc+hm, dr, dc, path+"h"+hm);
        }
        for (int vm=1; vm<=dr-sr; vm++){
            printMazePathWithJump(sr+vm, sc, dr, dc, path+"v"+vm);
        }
        for (int dm=1; dm<=dc-sc && dm<=dr-sr; dm++){
            printMazePathWithJump(sr+dm, sc+dm, dr, dc, path+"d"+dm);
        }
    }
    //--------------------------------------------------------------------
    public static void PrintPermutations(String ques, String ans){
        // n length string = total (n!) permutations
        // permutations = total no. of words created by one word(order can be different)
        // ex:-  abc = (abc,acb,   bac,bca,   cab,cba,)  = n! = 6
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0; i<ques.length(); i++){

            char ch = ques.charAt(i);
            String lstr = ques.substring(0, i);
            String rstr = ques.substring(i+1);
            String restStr = lstr+rstr;

            PrintPermutations(restStr, ans+ch+"");
        }
    }
    //-------------------------------------------------------------------?
    public static void PrintEncodings(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }else if (ques.length()==1){
            char ch = ques.charAt(0);
            if (ch=='0'){
                return;
            }else {
                int chv = ch-'0';
                char code = (char)('a'+ch-1);
                System.out.println(ans+code);
            }
        }

        // for char 1 in in ques.
        else {
            char ch = ques.charAt(0);
            String restq = ques.substring(1);
            if (ch=='0'){
                return;
            }else {
                int chv = ch-'0';
                char code = (char)('a'+ch-1);
                PrintEncodings(restq, ans+code);
            }
        }
        // for char 1,2 in in ques.
        String ch12 = ques.substring(0,2);
        String rest0f12 = ques.substring(2);
        int chv12 = Integer.parseInt(ch12);
        if (chv12<=26){
            char code = (char)('a'+chv12-1);
            PrintEncodings(rest0f12, ans+code);
        }


    }
    //-------------------------------------------------------------------
    public static void FloodFill(int[][] maze, int row, int col, String path, boolean[][] visited){
        if (row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 ||
            visited[row][col]==true){
            return;
        }
        if (row==maze.length-1 && col==maze[0].length-1){
            System.out.println(path);
            return;
        }
        visited[row][col] = true; // after intering the shell, firstly mark true as a visited shell

        FloodFill(maze, row-1, col, path+"t", visited); // top
        FloodFill(maze, row, col-1, path+"l", visited); // left
        FloodFill(maze, row+1, col, path+"d", visited); // down
        FloodFill(maze, row, col+1, path+"r", visited); // right

        visited[row][col] = false; // during returning from the shell, mark false as a unvisited

    }
    //-------------------------------------------------------------------
    public static void TargetSumSubsets(int[] arr, int idx, String set, int sos, int tar){

        if (idx==arr.length){
            if (sos == tar){
                System.out.println(set+".");
            }
            return;
        }
        //array element may ber particiapate in subset
        TargetSumSubsets(arr, idx+1, set+arr[idx]+", ", sos+arr[idx], tar);
        //array element may not be particiapate in subset
        TargetSumSubsets(arr, idx+1, set, sos, tar);  //sos-sum0fsubset, tar-target
    }
    //-------------------------------------------------------------------
    public static void SubArrayUsingLoop(int[] arr){
        for (int i=0; i<arr.length; i++){

            int max = Integer.MIN_VALUE;

            for (int j=i; j<arr.length; j++){

                for (int k=i; k<=j; k++){
                    if (arr[k]>max){
                        max = arr[k];
                    }
                }
                System.out.print(max+" ");
            }

        }
        System.out.println();
    }
    //-------------------------------------------------------------------
    public static boolean isItSafePlaceForQueen(int[][] chess, int row, int col){

        // Checking in each shell in column.
        for (int i = row-1,j = col; i>=0; i--){
            if (chess[i][j]==1){
                return false;
            }
        }

        // checking in each shell of top-left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
            if (chess[i][j] == 1){
                return false;
            }

        // checking in each shell of top-right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j<chess.length; i--, j++)
            if (chess[i][j] == 1){
                return false;
            }

        return true;
    }
    public static void printNqueens(int[][] chess, String shells, int row){
        // together two queens cannot stay in horizontal-column, verticall-row, and diagonal at an time
        // so make possible to put ony one queen in horizonta, vertical, and diagonal.

        if (row==chess.length){
            System.out.println(shells);
            return;
        }
        for (int col=0; col<chess.length; col++){

            if (isItSafePlaceForQueen(chess, row, col)==true){
                chess[row][col] = 1; // adding queen in chess chell
                printNqueens(chess, shells+row+"-"+col+", ", row+1);
                chess[row][col] = 0; // removing queen during returning from chess chell
            }

        }
    }
    //--------------------------------------------------------------------
    public static void displayBoard(int[][] Board){
        for (int i=0; i<Board.length; i++){
            for (int j=0; j<Board[0].length; j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printKnightTours(int[][] chess, int row, int col, int move){
        if (row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col] >0){
            return;
        }else if (move == chess.length*chess.length){
            chess[row][col] = move;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = move;
        printKnightTours(chess, row-2, col+1, move+1); // move 1
        printKnightTours(chess, row-1, col+2, move+1); // move 2
        printKnightTours(chess, row+1, col+2, move+1); // move 3
        printKnightTours(chess, row+2, col+1, move+1); // move 4
        printKnightTours(chess, row+2, col-1, move+1); // move 5
        printKnightTours(chess, row+1, col-2, move+1); // move 6
        printKnightTours(chess, row-1, col-2, move+1); // move 7
        printKnightTours(chess, row-2, col-1, move+1); // move 8
        chess[row][col] = 0;

    }

//====================================== recursion by kunal ===========================
//====================================== recursion by kunal ===========================
//====================================== recursion by kunal ===========================

    public static int total = 0;
    public static int sum0fDigits(int n){
        if (n==0){
            return 0;
        }
        int rem = n%10;
        n = n/10;

        return  sum0fDigits(n) + rem;

    }
//  ------------------------------------------------------
    public static int sum;
    public static void reverseNumber(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        n = n/10;

        sum = (sum*10)+rem;   // ex:- 234 -> 23*10+4 = 21 --> (sum * previous + remnder)

        reverseNumber(n);

    }
//  ------------------------------------------------------
    public static int Helper(int n, int digits){
        if (n%10==n){
            return n;
        }

        int rem = n%10;
        // ex:-  1234 -> 4 * 1000 + previous --> 4000+300+20+1 == 4321
        int x = (int) (rem*Math.pow(10, digits-1) + Helper(n/10, digits-1));
        return x;
    }
    public static int reverseNumber2(int n){
        int digits = (int) (Math.log10(n))+1;
        int y = Helper(n, digits);
        return y;
    }
//  -----------------------------------------------------
    public static boolean palindrome(int n){
        return n == reverseNumber2(n);
    }
//  ----------------------------------------------------
    public static int ct=0;
    public static int checkZeero(int n){
        if (n%10==n){
            return n;
        }
        int rem = n%10;

        if (rem==0){ct++;}

        checkZeero(n/10);
        return ct;
    }
//  ---------------------------------------------------
    public static int Helper1(int n, int steps){
        if (n==0){
            return steps;
        }
        if (n%2==0){
            return Helper1(n/2, ++steps);
        }
        else {
            return Helper1(--n, ++steps);
        }

    }
    public static int no0fStepToReduceZeero(int n){
        int ct1 = 0;
        int x = Helper1(n, ct1);
        return x;
    }
//  --------------------------------------------------
    public static boolean isArrSortedHelper(int[] arr, int idx){
        if (idx==arr.length-1){
            return true;
        }
        if (arr[idx]<arr[idx+1]){
            return isArrSortedHelper(arr, ++idx);
        }
        return false;
    }
    public static boolean isArrSorted(int[] arr){
        return isArrSortedHelper(arr, 0);
    }
//  ---------------------------------------------------
    public static ArrayList<Integer> indexes0f0curencesHelper(ArrayList<Integer> list1, int[] arr, int idx, int target){
        if (idx==arr.length){
            return list1;
        }
        if (arr[idx]==target){
            list1.add(idx);
        }
        ArrayList x = indexes0f0curencesHelper(list1, arr, ++idx, target);
        return x;

    }
    public static ArrayList<Integer> indexes0f0curencesHelper2(int[] arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if (idx==arr.length){return list;}

        if (arr[idx]==target){
            list.add(idx);
        }
        ArrayList<Integer> ansFromTheTops = indexes0f0curencesHelper2(arr, target, ++idx);
        list.addAll(ansFromTheTops);
        return list;
    }

    public static ArrayList<Integer> indexes0f0curences(int[] arr, int target){
        ArrayList<Integer> arrlist = new ArrayList<>();
        int idx = 0;
        //arrlist = indexes0f0curencesHelper(arrlist, arr, idx, target);
        arrlist = indexes0f0curencesHelper2(arr, target, idx);

        return arrlist;
    }
//  ---------------------------------------------------
    public static int rotatedArrBS(int[] arr, int target, int s, int e){
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s)/2;
        if (arr[mid]==target){return mid;}

        if (arr[s]<=arr[mid]){
            if (target>=arr[s] && target<=arr[mid]){
                return rotatedArrBS(arr, target, s, mid-1);
            }
            else {
                return rotatedArrBS(arr, target, mid+1, e);
            }
        }
        if (target>=arr[mid] && target<arr[e]){
            return rotatedArrBS(arr, target, mid+1, e);
        }
        else {
            return rotatedArrBS(arr, target, s, mid-1);
        }
    }
//  ---------------------------------------------------
    public static void patern1(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("* ");
            patern1(r, c+1);
        }else {
            System.out.println();
            patern1(r-1, 0);
        }

    }
    public static void patern2(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            patern2(r, c+1);
            System.out.print("* ");
        }else {
            patern2(r-1, 0);
            System.out.println();
        }

    }
//  ---------------------------------------------------
    public static void bubbleSort(int[] arr, int length, int idx){
        // compare two adjacent element and then swap.
        if (length==0){
            return;
        }
        if (idx<length){
            if (arr[idx]>arr[idx+1]){
                int temp = arr[idx];
                arr[idx] = arr[idx+1];
                arr[idx+1] = temp;
            }
            bubbleSort(arr, length, idx+1);
        }else {
            bubbleSort(arr, length-1, 0);
        }

    }

    public static void selectionSort(int[] arr, int length, int idx, int max){
        // find greatest element and put on the last index.
        // and find again till arr length- 1 2...n
        if (length==0){
            return;
        }
        if (idx<length){
            if (arr[idx]>arr[max]){
                selectionSort(arr, length, idx+1, idx);
            }
            else {
                selectionSort(arr, length, idx+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[length-1];
            arr[length-1] = temp;

            selectionSort(arr,length-1, 0, 0);
        }


    }
//  ---------------------------------------------------
    public static void mergeSort(int[] arr, int s, int e){
        if (e-s==1){ // e-s == treat as like, arr.length
            return;
        }

        int mid = (s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        merge(arr, s, mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int[] sorted = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid && j<e){
            if (arr[i]<arr[j]){
                sorted[k] = arr[i];
                i++;
            }
            else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            sorted[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            sorted[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < sorted.length; l++) {
            arr[s+l] = sorted[l];
        }
    }
//  ---------------------------------------------------
    public static void quickSort(int[] arr, int lo, int hi){
//      Rule: 1 all element before the pivit is smaller than the pivit
//            2 all element after the pivit is greater than the pivit
//            after satisfied those rules, pivit is automatically is in the correct position.


        if (lo>=hi){
            return;
        }
        int s = lo;
        int e = hi;

        int mid = s + (e-s)/2;
        int pivit = arr[mid];

        while (s <= e){
            while (arr[s] < pivit){
                s++;
            }
            while (arr[e] > pivit){
                e--;
            }
            //after breaking those loops its posible to its not folowing the quicksort rules
            if ( s<= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now pivit is in correct position,
        // and sorting of two halves now.
        quickSort(arr, lo, e);
        quickSort(arr, s, hi);
    }
//  ---------------------------------------------------
    //passing parameter in argument
    public static void removeAfromString(String str, int idx, String ans){
        if (idx==str.length()){
            System.out.println(ans);
            return;
        }
        if (str.charAt(idx) != 'a'){
            ans = ans + str.charAt(idx)+"";
        }
        removeAfromString(str, idx+1, ans);

    }
    //passing parameter in body

    public static String removeAfromString2(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        String x = removeAfromString2(str.substring(1));
        if (ch != 'a'){
            x = ch + x;
        }
        return x;

    }
    public static String skipStrFromSTR(String STR){
        if (STR.isEmpty()){
            return "";
        }

        if (STR.startsWith("apple")){
            return skipStrFromSTR(STR.substring(5));
        }
        else {
            char ch = STR.charAt(0);
            String x = skipStrFromSTR(STR.substring(1));
            return ch + x;
        }

    }
    public static String skipAppNotApple(String STR){
        if (STR.isEmpty()){
            return "";
        }

        if (STR.startsWith("app") && !STR.startsWith("apple")){
            return skipAppNotApple(STR.substring(3));
        }
        else {
            char ch = STR.charAt(0);
            String x = skipAppNotApple(STR.substring(1));
            return ch + x;
        }

    }
//  -------------------------------------VVVI------------
    //this pattern of taking some element and removing some element is known as
    // subset pattern.
    public static void subset(String str, String ans){
        if (str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        subset(str.substring(1), ans+ch+""); // adding element
        subset(str.substring(1), ans); // ignoring element
    }
    public static ArrayList<String> subset2(String str, String ans){
        if (str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList left = subset2(str.substring(1), ans+ch+"");
        ArrayList right = subset2(str.substring(1), ans);

        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> subset3(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i=0; i<arr.length; i++){
            start = 0;
            //if current and privious element is same, s=s+1;
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }

            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }
        return outer;
    }

//  -------------------------------------------------------- Permutations
    public static void permutations(String str, String ans){
        // no. of recursive calls equals to length of ans.
        if (str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }

        char ch = str.charAt(0);

        for (int i=0; i<ans.length()+1; i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutations(str.substring(1), f+ch+s);
        }
    }
    public static int permutationsCount(String str, String ans){
        // no. of recursive calls equals to length of ans.
        if (str.isEmpty()){
            return 1;
        }

        char ch = str.charAt(0);
        int count = 0;

        for (int i=0; i<ans.length()+1; i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            count = count + permutationsCount(str.substring(1), f+ch+s);
        }
        return count;
    }
//  --------------------------------------------------------
    public static void keycombinations(String str, String ans){
        // digit range = [ 3*(digit-1), 3*digit )
        //1: abc  2: def  3: ghi  4: jkl  5: m n o       6: p q r     7: s t u   8: v w x    9: y z
        //   012     345     678     91011   121314         151617       181920     212223      2425

        if (str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        //ex:- "23"
        int digit  = str.charAt(0)-'0';//2

        for (int i=3*(digit-1); i<digit*3; i++){
            char ch = (char) ('a'+i);
            keycombinations(str.substring(1), ans+ch);
        }



    }
//  --------------------------------------------------------
    public static void dice(int target, String res){
        if (target==0){
            System.out.print(res+" ");
            return;
        }

        for (int i = 1; i<=target; i++) {
            dice(target-i, res+i);
        }

    }
//  --------------------------------------------------------
    public static void pathRestrictions(int n, int m, int i, int j, String res){
        if (i==n && j==m ){
            System.out.print(res+" ");
            return;
        }

        if (i<n){
            pathRestrictions(n, m, i+1, j, res+"D");
        }
        if (j<m){
            pathRestrictions(n, m, i, j+1, res+"R");
        }
    }
    public static ArrayList<String> pathRestrictions2(int n, int m, int i, int j, String res){
        if (i==n && j==m ){
            ArrayList<String> tlist = new ArrayList<>();
            tlist.add(res);
            return tlist;
        }

        ArrayList<String> mlist = new ArrayList<>();
        if (i<n){
            ArrayList x =  pathRestrictions2(n, m, i+1, j, res+"R");
            mlist.addAll(x);
        }
        if (j<m){
            ArrayList y = pathRestrictions2(n, m, i, j+1, res+"D");
            mlist.addAll(y);

        }
        return mlist;
    }
//  --------------------------------------------------------





























}
