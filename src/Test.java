/**
 * Created by surabhi on 3/30/17.
 */
public class Test {
    public static void main(String[] args) {
        String s="[(][0-9]{3}[)][-][0-9]{3}[-][0-9]{4}";
        System.out.println("(412)-482-7932".matches(s));
       // System.out.println("[(]}".matches("[(]412"));
    }
}
