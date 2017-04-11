import java.util.*;

/**
 * Created by surabhi on 4/2/17.
 */
public class PortfolioManager {
    public static void main(String[] args) {
        String tree="1 2 3 # # 4 # # 5";
        String[]split=tree.split(" ");
        List<Integer>list=new ArrayList<>();
        for(String x:split){
            if(!x.equals("#"))
            list.add(Integer.valueOf(x));
            else
                list.add(Integer.MIN_VALUE);
        }
        System.out.println(list);
        int[][]dp1=new int[list.size()][2];
        /*dp1[0]=list.get(0);
        dp1[1]=list.get(1);*/
      //  int[]dp2=new int[dp1.length];
        //dp1[0][0]=0;
        //dp1[0][1]=list.get(0);
        for(int i=0;i< dp1.length;i++){
            for(int j=0;j<2;j++)
            dp1[i][j]=-1;
        }
        int take=check(0,1,dp1,list);
        int leave=check(0,0,dp1,list);
        System.out.println(Math.max(take,leave));
        int x=recur(0,0,list);
        int y=recur(0,1,list);
        System.out.println(Math.max(x,y));
        /*for(int i=2;i<dp.length;i++){
            if(list.get(i)>dp[((i-2)/2)])
                dp[i]=dp[i-1]
        }
*/

    }
    public static int check(int index,int flag,int[][]dp,List<Integer>list){

        int left=index*2+1;
        int right=index*2+2;
        if(index>=list.size())
            return 0;
        else if(list.get(index)==Integer.MIN_VALUE)
            return 0;
        else if(dp[index][flag]!=-1)
            return dp[index][flag];
        else if(flag==1){

            int leftsum=check(left,0,dp,list);
            int rightsum=check(right,0,dp,list);
            dp[index][flag]=list.get(index)+leftsum+rightsum;
            return dp[index][flag];
        }
        else{
            int takeleft=Math.max(check(left,0,dp,list),check(left,1,dp,list));
            int takeright=Math.max(check(right,0,dp,list),check(right,1,dp,list));

            dp[index][flag]=
                   takeleft+takeright;
            return dp[index][flag];

        }
        //return dp[index][flag];



    }
    public static int recur(int index,int flag,List<Integer>list){
        int left=index*2+1;
        int right=index*2+2;
        if(index>=list.size())
            return 0;
        else
            if(flag==1)
            return list.get(index)+Math.max(recur(left,0,list),recur(right,0,list));
        else
            return Math.max(recur(left,0,list),recur(left,1,list))+Math.max(recur(right,0,list),recur(right,1,list));
    }

    public tNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }
    private tNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals("")) return null;
        else {
            tNode node = new tNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}
