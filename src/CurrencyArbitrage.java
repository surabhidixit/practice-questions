/**
 * Created by surabhi on 4/1/17.
 */
public class CurrencyArbitrage {
    public static void main(String[] args) {
        double[]x={1.1837,1.3829,0.6102};
        //double[]x={1.1234,1.2134,1.2311};

        //double[]x={0.5795,0.5173,1.2223};
        //double[]x={0.7931, 0.5663 ,1.0012};
        //double[]x={1.4318 ,1.4705 ,1.3352};
        //double[]x={1.3413 ,0.8072 ,1.0355};
        //double[]x={1.2767 ,1.1696 ,0.5423};
        //double[]x={0.6903, 0.7520 ,0.5195};
        //double[]x={1.3832 ,0.7238 ,1.4037};
        //double[]x={0.5739 ,1.4304 ,0.9906};
        //double[]x={0.5648 ,1.0071 ,1.7581};
        //double[]x={0.8033 ,0.9961, 1.2498};
        double[]dp=new double[x.length];
        int n=100000;
        dp[0]=n/x[0];
        for(int i=1;i<dp.length;i++){
            dp[i]=dp[i-1]/x[i];
        }
        if(dp[dp.length-1]-n>0)
        System.out.println((int)dp[dp.length-1]-n);
        else
            System.out.println(0);

    }
}
