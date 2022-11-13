package leetcode;

public class BuyStock3 {
    public static void main(String[] args) {
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        int times = 2;
        int[][] DP = new int[times+1][prices.length];  //
        for(int k = 1; k < times+1; k++) {
            int tmpMax = -prices[0];
            //初始记录如果这时候购买有多少利润，虽然血亏，最好还是记录一下，后面会被替换掉。
            for (int i = 1; i < prices.length; i++) {
                DP[k][i] = Math.max(DP[k][i - 1], prices[i] + tmpMax);
                tmpMax =  Math.max(tmpMax, DP[k-1][i-1] - prices[i]);
                //找到最大利润购买时机
            }
        }
        System.out.println(DP[times][prices.length-1]);  //返回最后一个状态
    }



}
