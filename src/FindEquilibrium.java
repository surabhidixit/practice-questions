/**
 * Created by surabhi on 4/4/17.
 */
public class FindEquilibrium {
    public static void main(String[] args) {
        int[]n={1,2,0,3};
       // System.out.println(findEquilibrium(n,4));
        System.out.println(atoi("-12"));
    }
    public static int findEquilibrium(int arr[], int n)
    {
        //add code here.

        int[]dp1=new int[n];
        int[]dp2=new int[n];
        dp1[0]=arr[0];
        for(int i=1;i<n;i++){
            dp1[i]=dp1[i-1]+arr[i];
        }
        dp2[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            dp2[i]=dp2[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(dp1[i]==dp2[i])
                return i;
        }
        return -1;

    }


    static int atoi(String str)
    {
        // Your code here
        int j=(int)Math.pow(10,str.length()-1);
        int sum=0;
        int x=0;
        int neg=0;
        int i=0;
        if(str.charAt(0)=='-')
        {
            j/=10;
            i=1;
            neg=1;

        }
       while(i<str.length()){

            if(!Character.isDigit(str.charAt(i)))
                return -1;
            x=j*(str.charAt(i)-'0');
            //System.out.println(x);
            sum+=x;
            j/=10;
            i++;
        }
        return neg==1?-sum:sum;
    }
}
