/**
 * Created by surabhi on 4/6/17.
 */
public class PaintFill {
    enum Color { Black, White, Red, Yellow, Green };
    public static void main(String[] args) {
        paint();

    }
    public static void paint(){
        Color[][]screen=new Color[5][5];
        int row=screen.length;
        int col=screen[0].length;
        fill(screen,row,col,Color.White,Color.Black);


    }
    public static void fill(Color[][]screen,int r,int c,Color orig,Color given){
        if (r<0||c<0||r>=screen.length||c>=screen[0].length)
            return;
        if(screen[r][c]==given)
            return;
        else{
            if(screen[r][c]==orig){
                screen[r][c]=given;
                fill(screen,r+1,c,orig,given);
                fill(screen,r,c+1,orig,given);
                fill(screen,r-1,c,orig,given);
                fill(screen,r,c-1,orig,given);
            }
        }
    }
}
