import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by surabhi on 4/4/17.
 */
public class toRoman {
    public static void main(String[] args) {
        convertToRoman(8);
    }

    public static void convertToRoman(int n) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(10);
        set.add(50);
        set.add(100);
        set.add(500);
        set.add(1000);
        // Your code here
        StringBuilder sb = new StringBuilder();
        int x = 0,y=0, rem = 0;
        int a=0;
        boolean flag=false;
        if (set.ceiling(n) != null) {
            x = set.ceiling(n);
            y=set.floor(n);

            if (x-n == 0)
                System.out.print(map.get(x));
            if (n-y == 0)
                System.out.print(map.get(y));
            else {
                //if ceil is closer use it
                if(n-y>x-n)
                   a=x;
                else a=y;
                sb.append(map.get(a));
                rem = n-a;
                if(rem<0)
                    flag=true;
                rem=Math.abs(rem);

                while (rem != 0) {
                    sb.append(map.get(set.floor(rem)));
                    rem = rem - set.floor(rem);
                }
            }

        }
        if(flag)
        System.out.println(sb.reverse().toString());
        else
            System.out.println(sb.toString());
    }
}
