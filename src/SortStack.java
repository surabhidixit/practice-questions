import org.apache.spark.deploy.rest.StandaloneKillRequestServlet;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by surabhi on 3/30/17.
 */
public class SortStack {

    public static void main(String[]args){
        // GfG g=new GfG();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Stack<Integer> res=null;
        Stack<Integer>stk=null;
        while(t-->0){
            stk=new Stack();
            res=new Stack();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                stk.push(sc.nextInt());
            }
            res=sort(stk);
            while(!res.isEmpty()){
                System.out.println(res.pop());
            }
        }
    }
    /*public static Stack<Integer> sort(Stack<Integer> s)
    {
        // List<Integer>list=new ArrayList();
        PriorityQueue<Integer> queue=new PriorityQueue();
        int min=Integer.MIN_VALUE;
        while(!s.isEmpty()){
            int i=s.pop();
            queue.add(i);
        }
        while(!queue.isEmpty()){
            s.push(queue.poll());
        }
        return s;
    }*/

    public static Stack<Integer> sort(Stack<Integer>s){
        int temp;
        if(!s.isEmpty()){
             temp=s.pop();
             sort(s);
             insert(s,temp);
        }
        return s;
    }
    public static void insert(Stack<Integer>s,int t){
        if(s.isEmpty())
            s.push(t);
        else if(s.peek()<=t){
            s.push(t);
        }
        else{
            int temp=s.pop();
            insert(s,t);
            s.push(temp);
        }
    }
  /*public static Stack<Integer>sort(Stack<Integer>s){

      Stack<Integer>stk=new Stack<>();
      while(!s.isEmpty()){
          int i=s.pop();
          if(stk.isEmpty())
              stk.push(i);
          else if(stk.peek()<=i)
              stk.push(i);
          else {
              while (!stk.isEmpty()) {
                  int temp = stk.pop();
                  if()
                  //s.push(temp);
                  //stk.push(i);
              }
          }
      }
      return stk;
  }*/
}
