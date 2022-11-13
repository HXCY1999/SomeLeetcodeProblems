package leetcode;

public class BuyStock {
    public static void main(String[] args) {
        int[] prices = new int[]{3,3};
        int i=0;int N = prices.length - 1;
        int profit =0, sell=0,buy=0;
        while(i<N){
            while(i<N && prices[i+1] < prices[i]) i++;
            buy = prices[i];//find the lowest point

            while(i<N && prices[i+1] > prices[i]) i++;
            sell = prices[i];

            profit = profit + sell - buy;

        }
    }
}
