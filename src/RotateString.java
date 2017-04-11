/**
 * Created by surabhi on 3/29/17.
 */
public class RotateString {
    public static void main(String[] args) {
        System.out.println(check("amazon","azonam"));
    }
    public static boolean rotate(String s,String t){
        int i=0,j=t.length()-1;
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        int low=0,high=0;
        char temp;
        int count=0;
        while(i<a.length&&j>=0){
            if(new String(a).equals(new String(b)))
                return count<=2;
            if(count>2&&!new String(a).equals(new String(b)))
                return false;
            if(a[i]==b[i]){
                i++;
            }
            else{
                j=b.length-1;
                low=i;
                high=j;
                while(a[i]==b[j]&&i<j){
                    i++;
                    j--;
                }
                while(low<i&&high>j){
                    temp=b[low];
                    b[low]=b[high];
                    b[high]=temp;
                    low++;
                    high--;
                }
                count++;

            }

        }
        s=new String(a);
        t=new String(b);
        if(s.equals(t))
            return count<=2;
        else
            return false;
    }


    public static boolean check(String s,String t){
        int i=0,j=t.length()-1;
        StringBuilder sb=new StringBuilder();
        int length = t.length();
        String rotateCCWTarget =  t.substring(length - 2, length) + t.substring(0, length - 2);
        String rotateCWTarget = t.substring(2, length) + t.substring(0, 2);

        return s.equals(rotateCCWTarget)||s.equals(rotateCWTarget);
    }
}
