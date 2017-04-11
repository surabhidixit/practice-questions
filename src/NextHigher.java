import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by surabhi on 4/5/17.
 */
public class NextHigher {
    public static void main(String[] args) {
        int[]x={2,3,3,5};
        TreeSet<Integer>set=new TreeSet<>();
        for(int i:x)
        set.add(i);
        for(int i=0;i<x.length;i++){
            System.out.println(set.higher(x[i]));
            if(set.higher(x[i])!=null)
                x[i]=set.higher(x[i]);
        }
       System.out.println(Arrays.toString(x));
    }
}
