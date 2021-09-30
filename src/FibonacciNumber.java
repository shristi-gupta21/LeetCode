import java.util.Arrays;

public class FibonacciNumber {
    public int fib(int n) {
        int max = n+1;
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,max);

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
//            if (n == 1){
//                dp[i] = i;
//                return 1;
//            }
//            if (n == 0){
//                dp[i] = i;
//                return 0;
//            }
            if(n<= dp[i]){
                dp[i] = Math.min(dp[i],dp[i-2]+dp[i-1]);
            }
            dp[i] = Math.max(dp[i],dp[i-2]+dp[i-1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        FibonacciNumber num = new FibonacciNumber();
        System.out.println(num.fib(0));
    }
}
