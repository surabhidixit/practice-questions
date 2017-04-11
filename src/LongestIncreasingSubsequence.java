import java.util.TreeSet;

/**
 * Created by surabhi on 3/31/17.
 */
public class LongestIncreasingSubsequence {
   // static int len=0;
    static int max=0;
    public static int longest(int[]x){
        if(x.length==0)
            return 0;
        int[]dp=new int[x.length+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=1;
        }
        for(int i=1;i<x.length;i++){
            for(int j=0;j<i;j++){
                if(x[i]>x[j]&&dp[i]<dp[j]+1)
                    dp[i]=dp[j]+1;

            }
        }

    for(int i:dp){
         max=Math.max(max,i);
    }
    return max;
    }







    public static int longestSeq(int[]nums){
        int[]dp=new int[nums.length];
        for(int i=0;i<dp.length;i++)
            dp[i]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]&&dp[i]<dp[j]+1)
                    dp[i]=dp[j]+1;
            }
        }
        int max=0;
        for(int i:dp)
        max=Math.max(max,i);
        return max;
    }


    public static int lengthOfLIS(int[] nums) {
        TreeSet<Integer> tree=new TreeSet();
        for(int i:nums){
            if(tree.ceiling(i)!=null)
                tree.remove(tree.ceiling(i));
            tree.add(i);
        }

        return tree.size();
    }
    public static void main(String[] args) {
        /*String s="ABCDGH";
        String t= "AEDFHR";
        System.out.println(lengthOfLIS((s,t));*/
        int[]x={3, 10, 2, 1, 20};
        System.out.println(longest(x));
    }
}
