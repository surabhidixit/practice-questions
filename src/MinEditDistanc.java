/**
 * Created by surabhi on 3/31/17.
 */
public class MinEditDistanc {
    public static int recur(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        if (s.length() == 0 || t.length() == 0)
            return 0;
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for (int i = 1; i<=s.length(); i++) {
            for (int j = 1; j<=t.length(); j++) {
                if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    dp[i][j]=1+Math.min(dp[i-1][j-1],dp[i][j]);
                }

            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        System.out.println(recur("fox","hoax"));
    }
}
