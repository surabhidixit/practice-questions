import java.util.*;

/**
 * Created by surabhi on 4/6/17.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        paren(3);
    }
    public static void paren(int n){
        addPairs(new HashSet<>(),n,n,new char[n*2],0);
    }
    public static void addPairs(Set<String> list, int left, int right, char[] k, int index){
        if(left<0||right<left)
            return;
        else if(left==0&&right==0)
            list.add(String.valueOf(k));
        else{
            k[index]='(';
            addPairs(list,left-1,right,k,index+1);
            k[index]=')';
            addPairs(list,left,right-1,k,index+1);
        }
        System.out.println(list);

    }
}
