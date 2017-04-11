/**
 * Created by surabhi on 3/31/17.
 */
public class MinimumCoins {
    public static void main(String[] args) {
        int[]x={1,3,5};
        System.out.println(min(x,11,0));
    }
    public static int min(int[]x,int s,int i){
        if(s==0)
            return 1;
        if(i>=x.length)
            return 0;
        //int[]dp=new int[x.length];
        int amt=0;
        int ways=0;
        System.out.println("new call");
        while(amt<=s){
            int rem=s-amt;
            ways+=min(x,rem,i+1);
            amt+=x[i];
            System.out.println("call "+i+" "+x[i]);
        }
        return ways;
    }
}
