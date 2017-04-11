import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 *
 *
 *
 *
 * Created by surabhi on 4/6/17.
 */
public class SetZero {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        System.out.println(a[4-2]);
        int[][]x={{1,0,2},{3,4,6},{4,8,0}};
        //setMe(x);
       // for(int[]i:x)
       // System.out.println(Arrays.toString(i));
    }
    public static void setMe(int[][]x){
        if(x.length==0)
            return;
        else{
            //boolean[][]visited=new boolean[x.length][x[0].length];
            List<Integer> rows=new ArrayList<>();
            List<Integer> col=new ArrayList<>();
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    if(x[i][j]==0)
                    {
                        rows.add(i);
                        col.add(j);
                    }
                }
            }
            for(int i=0;i<rows.size();i++){
                for (int j = 0; j < x[0].length; j++) {
                    x[rows.get(i)][j]=0;
                }
            }
            for(int i=0;i<x.length;i++){
                for (int j = 0; j <col.size() ; j++) {
                    x[i][col.get(j)]=0;
                }
            }
        }
    }

}
