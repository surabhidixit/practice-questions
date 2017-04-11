/**
 * Created by surabhi on 4/3/17.
 */
public class DoubleRotation {
    public static void main(String[] args) {
        System.out.println(check("amazon", "azonam"));
    }

    public static int check(String a, String b) {
        if (a.length() == 0 || b.length() == 0 || a.length() != b.length())
            return 0;
        else if (a.equals(b))
            return 1;
        else {
            String q = "";
            for (int i = 0; i < b.length() - 2; i++) {
                String g=b.substring(b.length()-2, b.length());
                String f=b.substring(i, b.length()-2);
                q =g+f;
                if (q.equals(a))
                    return 1;
            }
            return 0;
        }

    }



}
