import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by surabhi on 4/5/17.
 */
public class TriangleSum {
    static void preorder(List<Integer>l,tNode t){
        if(t!=null){
            l.add(t.val);
            preorder(l,t.left);
            preorder(l,t.right);
        }
    }
    public static void main(String[] args) {
        int[][]x={{5,0,0,0},{94,48,0,0},{95,30,96,0},{77,71,26,67}};
        tNode t=new tNode(26);
        t.left=new tNode(10);
        t.right=new tNode(3);
        t.left.left=new tNode(16);
        t.left.right=new tNode(6);
        t.right.left=new tNode(1);
        List<Integer> list=new ArrayList<Integer>();
        System.out.println(findMaxSumHelper(x,0,0,0,0));

      //  System.out.println(check(t));
    }
   /* public static int triangleSum(int[][]x){

    }*/


    private static int findMaxSumHelper(int[][] a, int i, int j,int result, int sum) {
       /* if (i >= a.length) {
            return sum;
        }
       sum+=a[i][j]+Math.max(findMaxSumHelper(a, i+1, j, sum),findMaxSumHelper(a, i+1, j+1, sum));*/
        if (i >= a.length) {
            if (result>sum)
                result = sum;
            return result;
        }
        int origSum = sum + a[i][j];
        findMaxSumHelper(a, i+1, j, origSum, result);
        findMaxSumHelper(a, i+1, j+1, origSum, result);

        //findMaxSumHelper(a, i+1, j+1, sum);
        return result;
    }
    public static int check(tNode t){
        /*int[][]dp=new int[x.length][x[0].length];
        dp[0][0]=t.val;
        for(int i=1;i<x[0].length;i++){
            dp[i][0]=x[i][0]+dp[i-1][0];
        }
        for(int i=1;i<x.length;i++){
            for(int j=1;j<x[0].length;j++){
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j-1]+dp[i][j]);
            }
        }
        return dp[x.length-1][x[0].length-1];*/
        if(t==null)
            return 0;
        int left=check(t.left);
        int right=check(t.right);
        return Math.max(left,right)+t.val;
    }
}
