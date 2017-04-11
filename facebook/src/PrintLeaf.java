import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Stack;

/**
 * Created by surabhi on 3/14/17.
 */
public class PrintLeaf {
    public static ArrayList printleaves(int[]a){

        ArrayList<Integer> list=new ArrayList<>();
        int max=a[0];
        for(int i=1;i<a.length-1;i++){
            //max=Math.max(max,a[i]);
            if(a[i+1]>a[i]&&a[i-1]>a[i])
                list.add(a[i]);
            else if(a[i]>max&&a[i]>a[i+1]||a[i]<max&&a[i]>a[i-1]){
                list.add(a[i]);
                max=a[i];
            }
               // list.add(a[i]);
        }
        list.add(a[a.length-1]);
        return list;
    }

    public static void main(String[] args) {
        //int[]a={7,5,4,6,10,9};
        int[]a={6,5,4,3};
        //int[]a={4,5,6,7};
       // int[]a={890, 325, 290, 530, 965};
      //  Stack<Integer>stk=new Stack<>();
        System.out.println(printleaves(a));
    }
}
