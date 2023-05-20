package datastructureAndALGORITHM.arrays.twoDimentional;

public class printSpiral {
    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        if(matrix.length==0){
            return;
        }
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;

        int tne = (matrix.length)*(matrix[0].length);
        int ct = 0;
        while (ct<tne){
            //right wall
            for (int i=minr, j=minc; j<=maxc &&ct<tne; j++){
                System.out.print(matrix[i][j]+" ");
                ct++;
            }
            minr++;

            //bottom wall
            for (int i=minr, j=maxc; i<=maxr &&ct<tne; i++){
                System.out.print(matrix[i][j]+" ");
                ct++;
            }
            maxc--;

            //left wall
            for (int i=maxr, j=maxc; j>=minc &&ct<tne; j--){
                System.out.print(matrix[i][j]+" ");
                ct++;
            }
            maxr--;

            //top wall
            for (int i=maxr, j=minc; i>=minr &&ct<tne; i--){
                System.out.print(matrix[i][j]+" ");
                ct++;
            }
            minc++;

        }
    }
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        spiralPrint(mat);
    }
}
