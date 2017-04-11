/**
 * Created by surabhi on 3/22/17.
 */
public class BinaryAddition {
    public static void main(String[] args) {
        String s1="1101";
        String s2="11";
        int carry=0;
        System.out.println(recurse(s1,s2,0,new StringBuilder()));

    }

    public static String recurse(String s,String t,int carry,StringBuilder sb){
        if(s.length()==0||t.length()==0)
        {
            sb.append(carry);
            if(s.length()>0)
                sb.append(Character.getNumericValue(s.charAt(0))^carry);
            else if(t.length()>0)
                sb.append(Character.getNumericValue(t.charAt(0))^carry);
            return sb.reverse().toString();
        }
        int a=Character.getNumericValue(s.charAt(s.length()-1));
        int b=Character.getNumericValue(t.charAt(t.length()-1));
        a^=carry;
        //if(carry>0){
        sb.append(a^b);

            //carry=a&b;
        //}
        return recurse(s.substring(0,s.length()-1),t.substring(0,t.length()-1),a&b,sb);
    }

}
