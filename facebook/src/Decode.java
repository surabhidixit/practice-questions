/**
 * Created by surabhi on 3/22/17.
 */
public class Decode {
    public static void main(String[] args) {
        /*String s="1\n" +
                "11\n" +
                "21\n" +
                "1211\n" +
                "111221";*/

       // System.out.println(decode("2563"));
        //int i=-1;
        char[] str={'2','5','6','3'};
        int[]count=new int[str.length];
        count[0]=1;
        count[1]=1;
        for(int i=2;i<count.length-1;i++) {
            int one=Character.getNumericValue(str[i]);
            int two=Character.getNumericValue(str[i+1]);
            if(one==1){
                if(two>=0&&two<=9)
                    count[i]+=count[i-1];
            }
            if(one==2){
                if(two>=0&&two<=6)
                    count[i]+=count[i-1];
            }

            /*if (str[i-1] > '0')
                count[i] = count[i-1];

            // If second last digit is smaller than 2 and last digit is
            // smaller than 7, then last two digits form a valid character
            if (str[i-2] < '2' || (str[i-2] == '2' && str[i-1] < '7') )
                count[i] += count[i-2];*/

        }
        System.out.println(count[count.length-2]);

    }
    public static int decode(String str){
        if(str.length()==1)
            return 1;
        int x=Integer.valueOf(str);
        if(x>=1&&x<=26){
            return 1;
        }
            return 0;



    }
}
