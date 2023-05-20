package datastructureAndALGORITHM.dpOnStocks;

import java.util.Scanner;

public class BuyAndSellStocks_1 {
    public static void main(String[] args) {
        // Maximum transaction - one
        // Find maximum profit
        // logic: sell every point, and check, using minus with privious mimimum price
        // and change over-oll profit

        Scanner sc = new Scanner(System.in);
        int[] price = new int[]{7, 1, 5, 3, 6, 5};

        int pmp = price[0]; // previous minimum price
        int pist = 0; // profit if sold today
        int oop = 0; // over all profit


        for (int i=1; i<price.length; i++){
            if (price[i]<pmp){
                pmp = price[i];
            }

            pist = price[i] - pmp;
            oop = Math.max(oop, pist);
        }
        System.out.println(oop);


    }
}
