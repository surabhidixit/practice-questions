import java.security.Key;
import java.util.*;

/**
 * Created by surabhi on 4/2/17.
 */
public class StringPermutations {
    public static void main(String[] args) {
        //computewithoutDup("lam");

        Map<Character,Integer>hash=buildTable("ass");
        computewithoutDup("abc");
        //System.out.println(Arrays.toString(permute("","gang",0,new ArrayList().toArray()));
    }
    public static void computewithoutDup(String str){
        String prefix="";
        String suffix="";
        String rem="";
        if(str.length()==0)
            return;
        else{
           //void List l=new ArrayList();
            for(int i=0;i<"lam".length();i++){
                char c=str.charAt(i);
                prefix=str.substring(0,i);
                suffix=str.substring(i+1, str.length());
                rem=suffix+prefix;
                permute(rem," ");
            }

        }
    }

    public static void computewithDup(String prefix,int suffix,Map<Character,Integer> hash){
        if(suffix==0)
        {
            System.out.println(prefix);
            return;
        }
        else{
            //void List l=new ArrayList();
            for(char k:hash.keySet()){
                int n=hash.get(k);
                if(n>0){
                    hash.put(k,n-1);
                    prefix=prefix+k;
                   // suffix=suffix.substring(suffix.length()-1);
                    computewithDup(prefix,suffix-1,hash);
                    hash.put(k,n);
                }
            }
        }
    }
    public static Map buildTable(String str){
        Map<Character,Integer>hash=new HashMap<>();
        for(char c:str.toCharArray()){
            if(hash.containsKey(c))
                hash.put(c,hash.get(c)+1);
            else
                hash.put(c,1);
        }
        return hash;
    }
    public static void permute(String rem,String c){
        //System.out.println(rem.length());
       for(int i=0;i<rem.length();i++){
           System.out.println(rem.substring(0,i)+c+rem.substring(i,rem.length()));
       }
    }
}
