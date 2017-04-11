import java.util.Stack;

/**
 * Created by surabhi on 3/14/17.
 */
public class DecodeString {
    /*public static String check(String str,StringBuilder sb){
        String res="";
        //if(str==null)

        *//*enter all the characters in a stack*//*
        Stack<String> stk=new Stack();
        int i=0;
        while(i<str.length()){
            stk.push(str.charAt(i++)+"");
        }
        String c="";
        boolean flag=false;
        while(stk.size()>0){

             c=stk.pop();
             if(stk.size()==0)
                 return c;
            if(stk.peek().equals("["))
            {
                stk.pop();
                sb.append(c);
                //sb=sb.reverse();
                flag=false;
            }

             if(c.equals("]")) {
                 if(flag)
                 {
                     res=res+(sb.toString());
                     sb=new StringBuilder();
                 }
                 flag=true;
                 continue;
             }
             String k=stk.peek();
            // stk.pop();
                if(k.matches("\\d+")){

                    stk.pop();

                    String t=merge(Integer.valueOf(k),sb.reverse().toString());
                            res=t+res;
                    sb=new StringBuilder();
                    sb.append(res);
                    stk.push(sb.toString());
                    sb=new StringBuilder();
                    res="";
                    flag=true;
                }
                else if(flag) {
                    {

                        sb.append(c);
                        //sb=sb.reverse();
                    }

                //flag=false;
            }
        }
        sb.append(c);
        return sb.reverse().toString();

    }
    public static String merge(int n,String sb){
        StringBuilder res=new StringBuilder();
        if(n==0)
            return res.toString();
        else {
            while(n>0){
                res.append(sb);
                n--;
            }
            return res.toString();
        }

    }*/


    public static void main(String[] args)
    {
        System.out.println(decode("3[2[ab]f]"));
    }
    public static String decode(String st){
        Stack<String>stk=new Stack();
        String s="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!=']'){
                stk.push(String.valueOf(st.charAt(i)));
            }
            else{
                s="";
                while(!stk.peek().equals("[")){
                    s=stk.pop()+s;
                }
                stk.pop();
                StringBuilder sb=new StringBuilder();
                while(!stk.isEmpty()&&stk.peek().matches("\\d+")){
                    int x=Integer.valueOf((String)stk.pop());
                    for(int j=0;j<x;j++){
                        sb.append(s);
                    }
                    stk.push(sb.toString());
                }


            }

            }
            return stk.pop();


    }


}
