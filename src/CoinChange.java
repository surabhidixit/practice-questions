/**
 * Created by surabhi on 4/5/17.
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] x = {1,5,25,50};
        int[][] dp = new int[x.length][21];
        for (int i = 0; i < x.length; i++) {
            dp[i][0] = x[i];
        }
        System.out.println(getchange(x, 20,dp,0));
    }

    public static int getchange(int[] coins, int n,int[][]dp,int index) {
        if(dp[index][n]>0)
            return dp[index][n];
        else {
            if(index>=coins.length)
                return 1;
            int denom=coins[index];
            int ways=0;
            for (int i = 0; i <= n /denom; i++) {
                ways += makeChangeRecur(coins, n - coins[index] / 100, index + 1);
            }
            dp[index][n]=ways;

        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int makeChangeRecur(int[] coins, int n, int index) {
        if (n == 0||index>=coins.length)
            return 1;
        else {
            //int i=0;
            int ways = 0;
            for (int i = 0; i <= n / coins[i]; i++) {
                ways += makeChangeRecur(coins, n - coins[index] / 100, index + 1);
            }
            return ways;
        }
    }
}
