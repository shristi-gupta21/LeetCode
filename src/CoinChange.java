import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,max);//O(1)
        dp[0] = 0;
        for (int i = 1; i <= amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

//        int count = 0;
//        int data = 0;
//        for (int i = 0; i < coins.length; i++) {
//
//            data = amount - coins[i];
//            data = Math.min(amount,amount);
//
//            if (data == coins[i]){
//
//            }
//
//        }
//        System.out.println(data);
//        return count;
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1,2,5};
        int amount = 11;
        coinChange.coinChange(coins,amount);
    }
}
