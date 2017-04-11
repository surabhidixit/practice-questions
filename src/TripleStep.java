/**
 * Created by surabhi on 4/1/17.
 */
public class TripleStep {
    public static int check(int n){
       /* if(n<=0)
            return 0;
        if(n==1)
            return 1;
        else{
            return check(n-1)+check(n-2)+check(n-3);
        }*/
        int[]dp=new int[n+1];

        return tabcheck(n,dp);


    }
    public static int tabcheck(int n,int[]dp){
        //int[]dp=new int[n+1];
       /* if(n<0)
        {
            return 0;
        }
        else if(n==1||n==0)
        {
            return 1;
        }
        else if(dp[n]>0)
            return dp[n];
        //for(int i=3;i<=n;i++){
         else
        {
            dp[n]=tabcheck(n-1,dp)+tabcheck(n-2,dp)+tabcheck(n-3,dp);
        //}
        return dp[n];}*/
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {

        long a=System.currentTimeMillis()/1000;
        System.out.println(a);
        System.out.println(check(10000));

        long b=System.currentTimeMillis()/1000;
        System.out.println(b);
        //System.out.println(b-a);
    }
}
