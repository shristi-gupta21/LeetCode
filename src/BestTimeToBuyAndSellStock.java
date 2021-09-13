import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell =0 ;
        int result = 0;
        if (prices.length <= 2) {
            if (prices[0] < prices[1]){
                sell = prices[1];
            }
        }
        for (int i = 1; i < prices.length-1; i++) {
            if (prices[i-1] < prices[i] && prices[i] > prices[i+1]){
                sell = prices[i];
            }else if(prices[i] < prices[i + 1]){
                sell = prices[i+1];
            }
        }
        System.out.println(sell);
        Arrays.sort(prices);
        buy = prices[0];
        result =  sell - buy;
        if (result<0){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices={2,4,1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
