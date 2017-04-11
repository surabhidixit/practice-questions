/**
 * Created by surabhi on 4/3/17.
 */
public class PartitionSet {
    public static void main(String[] args) {
        int[]n={1,2,3,4,5,6,7};
        System.out.println(canPartition(n));
    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum%2!=0)
            return false;
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==sum/2)
                return true;
            if(dp[i-1]+nums[i]>sum/2)
                dp[i]=dp[i-1];
            else
                dp[i]=dp[i-1]+nums[i];
        }
        return dp[dp.length-1]==sum/2;


    }
}
