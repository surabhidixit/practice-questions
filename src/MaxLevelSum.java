import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by surabhi on 3/31/17.
 */
public class MaxLevelSum {
    public static int maxLevelSum(tNode root) {
        //add code here.
        Queue<tNode> q = new LinkedList<>();
        int sum = 0;
        int sum2 = Integer.MIN_VALUE;
       // q.offer(root);
        tNode x = root;
        List<tNode> list = new ArrayList<>();
        list.add(x);
        while (list.size() != 0) {
            while(list.size()>0){
                q.offer(list.get(0));
                list.remove(0);
            }
                sum=0;
            while (!q.isEmpty()) {
                x = q.poll();
                sum += x.val;
                if (x.left != null)
                    list.add(x.left);
                if (x.right != null)
                    list.add(x.right);
            }

            sum2 = Math.max(sum2, sum);
        }

        return sum2;
    }

    public static void main(String[] args) {
        tNode t=new tNode(1);
        t.left=new tNode(2);
        t.right=new tNode(4);
        t.left.left=new tNode(5);
        t.left.right=new tNode(6);
        t.left.left.left=new tNode(9);
        t.left.left.right=new tNode(10);

        t.right.left=new tNode(7);
        //t.right.right=new tNode(2);
        t.right.left.left=new tNode(11);
        t.right.left.right=new tNode(12);
        System.out.println(maxLevelSum(t));
    }
}
