/**
 * Created by surabhi on 4/4/17.
 */
public class EncodeString {
    public static void main(String[] args) {
        //System.out.println((char)50);
        int j=121;
        char c=(char)j;
        //System.out.println(c);

        System.out.println(encode("aaxay"));
    }
    public static String encode(String str) {
        int[] letters = new int[255];
        letters[str.charAt(0)] = 1;
        char c, d;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            c = str.charAt(i);
            d = str.charAt(i - 1);
            if (c == d)
                letters[d]++;
            else {
                sb.append(d);
                sb.append(letters[d]);
                letters[d] = 0;
                letters[c]++;
            }
        }
        char z;
        for(int i=0;i<letters.length;i++){
            if(letters[i]!=0)
            {
                z=(char)i;
                sb.append(z);
                sb.append(letters[i]);
                letters[i]=0;
            }

        }
        return sb.toString();

    }
}
