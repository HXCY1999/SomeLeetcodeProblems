package leetcode;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.util.Arrays;

public class Coin {
    public static void main(String[] args) {
        int amount = 0; int[] coins = new int[]{1};
        int[] dp =new int[amount + 1];
        Arrays.fill(dp,amount);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int coin : coins){
                if(coin > i) continue;
                dp[i] = Math.min(dp[i],dp[i - coin] + 1);
            }
        }
         dp[amount] = dp[amount] == amount ? -1 : dp[amount];
        System.out.println(dp[amount]);
    }
    }
