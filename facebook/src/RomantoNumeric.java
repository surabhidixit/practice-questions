import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by surabhi on 3/22/17.
 */
public class RomantoNumeric {
    static Map<String,Integer>hash=new HashMap<>();
    public static void main(String[] args) {
        hash.put("I",1);
       /* hash.put("II",2);
        hash.put("III",3);
        hash.put("IV",4);*/
        hash.put("V",5);
        /*hash.put("VI",6);
        hash.put("VII",7);
        hash.put("VIII",8);
        hash.put("IX",9);*/
        hash.put("X",10);
        hash.put("L",50);
        hash.put("C",100);
        hash.put("D",500);
        hash.put("M",1000);
        System.out.println(convert("XI"));

       // System.out.println(convert(""));
    }
    public static int convert(String s){
        int sum=0,i=0;
        if(s.length()==0)
            return 0;

        while (i<s.length()-1){
            int s1=hash.get(String.valueOf(s.charAt(i)));
            int s2=hash.get(String.valueOf(s.charAt(i+1)));
            if(s1<s2){
                sum-=s1;
                i++;
            }
            else{
                sum+=s1;
                i++;
            }
        }
        return sum+hash.get(String.valueOf(s.charAt(s.length()-1)));
    }
}
