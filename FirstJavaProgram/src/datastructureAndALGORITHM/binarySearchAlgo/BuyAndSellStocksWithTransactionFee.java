package datastructureAndALGORITHM.binarySearchAlgo;

public class BuyAndSellStocksWithTransactionFee {
    public static void main(String[] args) {
        //pepcoding: https://www.youtube.com/watch?v=pTQB9wbIpfU&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=34
        int[] prices = new int[]{10, 20, 30};
        int fee = 2;

        int obsp = -prices[0];
        int ossp = 0;

        for (int i=1; i<prices.length; i++){
            int nbsp = 0;
            int nssp = 0;

            //--------------------------updating buy-state
            if (ossp-prices[i] > obsp){
                nbsp = ossp-prices[i];
            }else {
                nbsp = obsp;
            }
            //-------------------------updating sold-state
            if (obsp+prices[i]-fee>ossp){
                nssp = obsp+prices[i]-fee;
            }else {
                nssp = ossp;
            }

            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}
