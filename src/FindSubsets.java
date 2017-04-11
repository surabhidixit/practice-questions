import java.util.ArrayList;
import java.util.List;

/**
 * Created by surabhi on 3/29/17.
 */
public class FindSubsets {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int n=(int)Math.pow(2,a.length);
        List<Integer>list=null;
        for(int i=0;i<n;i++){
            int count=i;
            int pos=0;
            list=new ArrayList<>();
            while(count!=0){
                if(count%2==1)
                    list.add(a[pos]);
                pos++;
                count>>=1;
            }
            System.out.println(list);

        }

    }
}
