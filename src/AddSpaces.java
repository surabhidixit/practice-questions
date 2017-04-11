import java.util.ArrayList;
import java.util.List;

/**
 * Created by surabhi on 4/2/17.
 */
public class AddSpaces {
    public static void main(String[] args) {

        String a="abc";
        int n=(int)Math.pow(2,a.length())-1;
        //<String> list=null;
        String res="";
        for(int i=0;i<n;i++){
            int count=i;
            int pos=0;
            //list=new ArrayList<>();
            res="";
            for(int j = 0; j < a.length(); j++) {
                // if current bit is set add space to this gap
                pos=1<<j;
                //if(i&&(pos)==1)
                res += " ";
                // add next char to our current permutation ans
                res += a.charAt(j+1);
            }

        }
    }
   /* public static String addSpace(String s,int i){
        if(s.length()==0||i>=s.length())
            return "";
        else{
            String st="";
            st+=s.charAt(i)+" "+addSpace(s.substring(i,s.length()),i+1);
            return st;
        }
    }*/
}
