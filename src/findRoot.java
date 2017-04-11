/**
 * Created by surabhi on 4/4/17.
 */
public class findRoot {
    public static void main(String[] args) {
        //System.out.println(root(9));
        System.out.println(1+'a');
    }
    public static long root(long x){
        if(x==1)
            return 1;
        else{
            return (long)getRoot(x,x/2);
        }
    }
    public static double getRoot(double x,double y){
        double z=Math.floor(y);
        double k=Math.ceil(y);
        if(z*z==x)
            return z;
        if(k*k==x)
            return k;
        else {
            return getRoot(x,(x-Math.pow(Math.floor(y/2),2))/2);
        }
    }
}
