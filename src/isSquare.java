import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by surabhi on 4/1/17.
 */
public class isSquare {
    public static void main(String[] args) {
    int[]x={10, 10, 10, 10, 20, 10, 20, 30};
   // int[]x={20, 20, 20, 10, 10, 20, 10, 10};
        System.out.println(setPoints(x));

    }
    /*
    * start with one point and try to add alternate points in a hashset if it does not add for one more x value then
    * there is a matching x similarly for y
    *
    *
    * */
    public static boolean setPoints(int[]x){
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<x.length-1;i+=2){
            if(hash.containsKey(x[i]))
            {
                if(hash.get(x[i])>1)
                    return false;
                hash.put(x[i],hash.get(x[i])+1);
            }
            else
                hash.put(x[i],1);
        }
        for(int i:hash.values())
            if (i!=2)
                return false;
        hash=new HashMap<>();
        for(int i=1;i<x.length-1;i+=2){
            if(hash.containsKey(x[i]))
            {
                if(hash.get(x[i])>1)
                    return false;
                hash.put(x[i],hash.get(x[i])+1);
            }
            else
                hash.put(x[i],1);
        }
        return true;

    }

}
