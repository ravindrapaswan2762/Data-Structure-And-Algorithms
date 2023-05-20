package datastructureAndALGORITHM.dpOnStocks;

import java.util.Scanner;

public class BuyAndSellStocks_2 {
    public static void main(String[] args) {
        // Maximum transaction - infinite
        // Find maximum profit
        // logic: buy-date = sell-data = 0th index, and stay while sell-data is increasing, if down
        //        then collect our profit, and re-initialized buy-date = sell-data = decreased index.
        // and change over-oll profit

        Scanner sc = new Scanner(System.in);
        int[] price = new int[]{1,2,3};

        int bdi = 0; //buy-date-index
        int sdi = 0; //sell-data-index
        int profit = 0;
        for (int i=1; i< price.length; i++){
            if (price[i]>=price[i-1]){
                sdi++;
            }else {
                profit += price[sdi]-price[bdi];
                bdi = sdi = i;
            }
        }
        profit += price[sdi]-price[bdi]; // for last one,
        System.out.println(profit);

    }
}
