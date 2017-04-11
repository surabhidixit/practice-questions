/**
 * Created by surabhi on 3/31/17.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(recur("abcdef", "ace"));
    }

    //recursive
    public static int recur(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        if (s.length() == 0 || t.length() == 0)
            return 0;
        for (int i = 0; i<=s.length(); i++) {
            for (int j = 0; j<=t.length(); j++) {
                if(i==0||j==0)
                    dp[i][j]=0;
                else if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
