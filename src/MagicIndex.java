/**
 * Created by surabhi on 4/1/17.
 */
public class MagicIndex {
    public static void main(String[] args) {
        int[]x={1,2,4,5,6,7,8,9,10,10,10,11};
        System.out.println(check(x,0,x.length-1));
    }
    /*public static boolean find(int[]x,int i){
        if(x.length==0||i==x.length)
            return false;
        else{
            if(x[i]==i){
                if(x[i]==x[i+1])
                    find(x,i+2);
                return true;
            }
            else
               return find(x,i+1);
        }
    }*/

    public static int check(int[]x,int start,int end){
        if(start>end||x.length==0)
            return -1;
        int mid=(start+end)/2;
        if(x[mid]==mid)
            return mid;
        int index=Math.min(x[mid],mid-1);
        int l=check(x,0,index);
        if(l>=0)
            return l;
        index=Math.max(x[mid],mid+1);
        return check(x,index,end);
    }
}

