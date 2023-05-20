package datastructureAndALGORITHM.arrays.twoDimentional;

public class boundariesAndDiaSum {
    public static int firstDia(int[][] arr, int n){
        int r = 0;
        int c = 0;
        int diaSum1 = 0;
        while(r<n && c<n){
            diaSum1 += arr[r][c];
            r++;
            c++;
        }
        return diaSum1;
    }

    public static int secDia(int[][] arr, int n){
        int r = 0;
        int c = n-1;
        int diaSum2 = 0;
        while(r<n && c>=0){
            diaSum2 += arr[r][c];
            r++;
            c--;
        }
        return diaSum2;
    }

    public static int boundSum(int[][] arr, int n){
        int sum = 0;
        for(int i=1; i<n-1; i++){
            sum += arr[0][i];//up
            sum += arr[n-1][i];//low
            sum += arr[i][0];//left
            sum += arr[i][n-1];//right
        }
        return sum;
    }
    public static void main(String[] args) {
        //For a given two-dimensional square matrix of size (N x N).
        // Find the total sum of elements on both the diagonals and at all the four boundaries.

        //We just need to add all these numbers making sure that no number is added twice.
        // For example, '1' is both a boundary element and a first-diagonal element similarly,
        // '5' contributes to both the diagonals but they won't be added twice

        int[][] mat = new int[][]{
                {6,9,8,5,9}, // (6+4+8+4+5)+(9+8+_+8+1)+(9+8+5)+(7+6+1)+(2+9+6)+(3+8+1)
                {2,4,1,8,3},
                {9,3,8,7,8},
                {6,8,9,4,1},
                {1,7,6,1,5}};

        int n = mat.length;
        int tSum = firstDia(mat, n) + secDia(mat, n) + boundSum(mat, n);

        // for common element for two diagonal
        if(n%2==1){
            tSum -= mat[n/2][n/2];
        }
        System.out.println(tSum);

    }
}
