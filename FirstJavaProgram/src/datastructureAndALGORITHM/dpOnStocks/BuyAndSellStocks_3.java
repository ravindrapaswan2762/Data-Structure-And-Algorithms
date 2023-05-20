package datastructureAndALGORITHM.dpOnStocks;

public class BuyAndSellStocks_3 {
    public static void main(String[] args) {
        // Maximum transaction - two
        // Find maximum profit
        // logic: pepcoding
        int[] arr = new int[]{10, 20, 30};

        //-------------------------------------------- checking from left to right
        int mpist = 0; //maximum profit if solt today
        int leastsf = arr[0]; //min before today.
        int[] dpl = new int[arr.length]; // max profit if sold upto taday.

        for (int i=1; i<arr.length; i++){
            if (arr[i]<leastsf){
                leastsf = arr[i];
            }

            mpist = arr[i] - leastsf;
            if (mpist>dpl[i-1]){
                dpl[i] = mpist;
            }else {
                dpl[i] = dpl[i-1];
            }
        }

        //-------------------------------------------- checking from right to left
        int mpibt = 0; //maximum profit if bought today
        int maxat = arr[arr.length-1]; //max after today.
        int[] dpr = new int[arr.length]; // max profit if buy upto taday.

        for (int i=arr.length-2; i>=0; i--){
            if (arr[i]>maxat){
                maxat = arr[i];
            }

            mpibt = maxat - arr[i];
            if (mpibt>dpr[i+1]){
                dpr[i] = mpibt;
            }else {
                dpr[i] = dpr[i+1];
            }
        }
        //--------------------------------------------
        int op = 0;
        for (int i=0; i<arr.length; i++){
            System.out.println("("+dpl[i]+" "+dpr[i]+")");
            if (dpl[i]+dpr[i]>op){
                op = dpl[i]+dpr[i];
            }
        }
        System.out.println();
        System.out.println("op "+op);
    }
}
