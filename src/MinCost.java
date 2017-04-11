/**
 * Created by surabhi on 3/31/17.
 */
public class MinCost {
    public static int minCost(int[][]x) {

        int[][] dp = new int[x.length+1][x[0].length+1];
        dp[0][0]=x[0][0];
        for (int i = 1; i<=x.length; i++) {
            for (int j = 1; j<=x[0].length; j++) {
               // dp[i][j]=dp[Math.min(x[])

            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
    public static void main(String[] args) {
        int[][]x={{1,2,3},{4,8,2},{1,5,3}};


    }
}
