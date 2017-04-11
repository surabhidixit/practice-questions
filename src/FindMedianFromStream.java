import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by surabhi on 3/29/17.
 */
public class FindMedianFromStream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]x={5,15,1,3};
        ManageHeap mh=new ManageHeap();
        for(int i:x){
            mh.add(i);
            System.out.println(mh.findMid());
        }
        //System.out.println(mh.findMid());
    }
}
class ManageHeap{
    PriorityQueue<Integer>max=null;
    PriorityQueue<Integer>min=null;
    public ManageHeap(){
       max=new PriorityQueue<>(Collections.reverseOrder());
       min=new PriorityQueue<>();

    }
    public void add(int num){
        if(!(max.size()>min.size()))
            max.offer(num);
        else min.offer(num);
    }
    public int findMid(){
        if(max.size()==min.size())
        {
            int x=max.peek();
            int y=min.peek();
            return (x+y)/2;
        }
            //return (max.peek()+min.peek())/2;
        else{
           // int x=min.poll();
            return max.peek();
        }
    }

}
