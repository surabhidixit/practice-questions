import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by surabhi on 3/31/17.
 */
public class SubLeaves {
    /*public static List findKNodes(tNode t){
        List<Integer>list=new ArrayList<>();
        if(subLeaves(t.left)+subLeaves(t.right)==3)
            list.add(t.val);
        return list;
    }*/
    public static int subLeaves(tNode t,int k){
        if(t.left==null&&t.right==null)
            return 1;
        else{
            int l=0;
            if(t.left!=null){
                l+=subLeaves(t.left,k);
            }
            if(t.right!=null){
                //k=0;
                l+=subLeaves(t.right,k);
            }
            if(l==k)
            {
                System.out.println(t.val);
            }
            /*else if(l<k)
                System.out.println(-1);*/
            return l;
        }

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
        subLeaves(t,3);

    }

}
class tNode{
    int val;
    int level;
    tNode parent;
    tNode left,right;
    public tNode(int x){
        val=x;
        left=null;
        right=null;
    }

}
