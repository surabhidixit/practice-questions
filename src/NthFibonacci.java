import org.apache.spark.ml.util.Stopwatch;

/**
 * Created by surabhi on 3/31/17.
 */
public class NthFibonacci {
    public static int fib(int n){
        int[]fib=new int[n+1];
        int i=2;
        fib[0]=0;
        fib[1]=1;
        while(i<=n) {
                fib[i] = fib[i - 1] + fib[i - 2];
                i++;
        }
        return fib[n];





    }

    public static void main(String[] args) {
        System.out.println(fib(5));

    }
}
