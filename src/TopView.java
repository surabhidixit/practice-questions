import java.util.*;

/**
 * Created by surabhi on 3/31/17.
 */
public class TopView {
    public static void main(String[] args) {
        tNode t = new tNode(5);
        t.left = new tNode(6);
        t.right = new tNode(8);
        t.left.left = new tNode(5);
        t.left.right = new tNode(1);
        t.left.right.left=new tNode(3);
        t.left.right.left.left=new tNode(10);
        //t.right.left = new tNode(7);
        //t.right.right=new tNode(2);
       // t.right.right = new tNode(11);
        System.out.println(t.val);
        view(t.left,true);
        view(t.right, false);

    }

    /*
    *      1
    *   2      3
    * 5   6  7  11
    *
    * */

    //1->2->5->2->
    public static void view(tNode x,boolean flag){
        if(x!=null){
            if(flag) {
                System.out.println(x.val);
                view(x.left, true);

            }
            else
            {
                System.out.println(x.val);
                view(x.right, false);
            }
            System.out.println("after else");
        }
        System.out.println("outside both");
    }
}
       //1 2 4 5 11
//        Queue<tNode>q=new LinkedList<>();
//       // q.offer(t);
//        PriorityQueue<topNode> list = new PriorityQueue<>();
//        //list.add(x);
//        topNode x=null;
//        list.offer(new topNode(t.val,0));
//        int count=q.size();
//
//        while (!list.isEmpty()) {
//            x=list.peek();
//            count=list.size();
//            while(count!=0){
//                System.out.println(list.poll().val);
//                count--;
//
//            }
//            if (x.left != null)
//            {
//                list.add(new topNode(x.left.val,x.val+1));
//            }
//                if (x.right != null)
//                    list.add(new topNode(x.right.val,x.val-1));
//            }
//            //while()
//        }
//
//}
//class topNode implements Comparable{
//    int val;
//    int count;
//    topNode left;
//    topNode right;
//    public topNode(int val,int c){
//        this.val=val;
//        count=c;
//        left=null;
//        right=null;
//
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        topNode t=(topNode)o;
//        if(this.val<t.val)
//            return 1;
//        else if(this.val>t.val)
//            return -1;
//        else
//            return 0;
//    }
//}
