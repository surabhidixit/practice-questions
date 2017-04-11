import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by surabhi on 4/4/17.
 */
public class NoSibling {
    public static void main(String[] args) {
        tNode t=new tNode(26);
        t.left=new tNode(10);
        t.right=new tNode(3);
        t.left.left=new tNode(16);
        t.left.right=new tNode(6);
        t.right.left=new tNode(1);
        t.right.left.left=new tNode(15);
        t.right.left.right=new tNode(17);
        //t.right.right=new tNode(2);
        //printSibling(t);
        updateNode(t,0,t);
        System.out.println(areCousins(t.left.left,t.right.left));
        //System.out.println(isSumTree(t));
    }
    static void printSibling(tNode node)
    {
        // Your code here
        Queue<tNode> q=new LinkedList<>();
        if(node!=null)
            q.add(node);
        tNode k=null;
        while(!q.isEmpty()){
            tNode x=q.poll();
            if(isLeaf(x))
                continue;
            else{
                k=hasOneChild(x);
                if(k==null){
                    System.out.println(x.left.val+" "+x.right.val);
                    q.add(x.left);
                    q.add(x.right);
                }
                else{
                    //System.out.println(k.val);
                    q.add(k);
                }
            }

        }
       /* while(!q.isEmpty()){
            System.out.println(q.poll().val);
        }*/
    }
    public static tNode hasOneChild(tNode n){
        if(n.left!=null&&n.right!=null)
            return null;
        else{
            if(n.left!=null)
                return n.left;
            else
                return n.right;
        }
    }
    public static boolean isLeaf(tNode n){
        return n.left==null&&n.right==null;
    }


    static boolean isSumTree(tNode tNode)
    {
        // Your code here
        if(tNode==null)
            return true;
        else{
            int m=getSum(tNode.left);
            int n=getSum(tNode.right);

            return tNode.val==m+n;}
    }
   
    static int getSum(tNode tNode){
        if(tNode==null)
            return 0;
        if(isLeaf(tNode))
            return tNode.val;
        else{
            return tNode.val+getSum(tNode.left)+getSum(tNode.right);
        }

    }

    static void updateNode(tNode t,int level,tNode parent){
        if(t==null)
            return;
        else{
           t.parent=parent;
           t.level=level;
           updateNode(t.left,level+1,t);
           updateNode(t.right,level+1,t);
        }
    }
    static boolean areCousins(tNode a,tNode b){
        if(a==null||b==null)
            return false;
        else{
            if(a.parent!=b.parent&&a.level==b.level)
                return true;
        }
        return false;
    }
}
