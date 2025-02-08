package Functions;

import java.util.Scanner;

public class maxProfit {
    public static int maxProfitCal(int[]stocks){
        int minPrice=stocks[0];
        int maxProfit=stocks[1]-stocks[0];
        for(int i=0;i<stocks.length;i++){
            int currentPrice=stocks[i];
            int potentialProfit=currentPrice-minPrice;
            maxProfit=Math.max(maxProfit,potentialProfit);
            minPrice=Math.min(currentPrice,minPrice);
         }
         return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stocks[]=new int[n];
        for(int i=0;i<stocks.length;i++){
            stocks[i]=sc.nextInt();
        }
        System.out.println(maxProfitCal(stocks));
    }
}
