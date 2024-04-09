package com.algo.problems.array;

public class BestTimetoBuySell {

    public static int maxProfit(int[] prices){
        int day =0;
        int buyAtSmallPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyAtSmallPrice > prices[i]){
                buyAtSmallPrice =prices[i];
                day =i;
            }
        }
        int sellPrice =buyAtSmallPrice;
        for(int j=day+1;j < prices.length;j++){
            if(sellPrice < prices[j]){
                sellPrice =prices[j];
            }

        }
        return  sellPrice-buyAtSmallPrice;
    }


    public static void main(String[] args) {

        int [] prices ={5,8,6,5,3,3,3};

        System.out.println(BestTimetoBuySell.maxProfit(prices));

    }
}
