import java.util.*;

/**
 * Created by surabhi on 4/6/17.
 */
public class StackofBoxes {
    public static void main(String[] args) {
        List<Box>list=new ArrayList<Box>();
        Box b1=new Box(1,2,3);
        Box b2=new Box(2,3,4);
        list.add(b2);
        list.add(b1);
        list.add(new Box(5,3,5));
        Collections.sort(list,new Comparator<Box>() {
            @Override
            public int compare(Box s1, Box s2) {
                return s1.h>s2.h?-1:1;
            }
        });
        //System.out.println(Arrays.toString(list.toArray()));
        char[]c="aabcjkit".toCharArray();
        int check=0;
        for(int i=0;i<c.length;i++){
            int val=c[i]-'a';
            if((check&(1<<val))>0)
                System.out.println(false);
            check|=1<<val;
        }
        //System.out.println(true);

    }
}
class Box{
    int h;
    int w;
    int d;
    public Box(int h,int w,int d){
        this.h=h;
        this.w=w;
        this.d=d;
    }
    @Override
    public String toString(){
        String s="";
        return s+this.h+" "+this.w+" "+this.d;
    }


    /*@Override
    public int compare(Object o1, Object o2) {
        if()
    }
*/
    /*@Override
    public int compare(Box o1, Box o2) {
        return o1.h>o2.h&&o1.w>o2.w&&o1.d>o2.d?1:-1;
    }*/
}
