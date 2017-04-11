/**
 * Created by surabhi on 4/2/17.
 */
public class NumbertoFive {
    public static void main(String[] args) {
        int n=1004;
        int t=n;

        int count=0;
        /*
        * 1004
        * 0001
        * 1004
        * 0010
        * 1014
        * 1004
        *
        *
        * */
        int mul=1;
        while(n>0){
            if(n%10==0)
            {
                mul*=Math.pow(10,count)*5;
                t=t+mul;

            }count++;
            mul=1;
            n=n/10;
        }
        System.out.println(t);
    }
}
