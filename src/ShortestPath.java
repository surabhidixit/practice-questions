import java.util.*;

/**
 * Created by surabhi on 3/19/17.
 */
public class ShortestPath {
    //static int[][]arr={{0,1,0},{1,0,1},{0,2,2}};
  // static int[][]arr={{0,2,0},{0,0,1},{1,1,1}};
   static int[][]arr={{0,2,0},{1,1,2},{1,0,0}};
   static Map<Point,Integer>map=new HashMap<>();
    public static int bfs(Point src,Point dest,boolean[][]visited){

        int len=0;
        int rowNum[] = {-1, 0, 0, 1};
        int colNum[] = {0, -1, 1, 0};
        Queue<CellNode>myq=new LinkedList<>();
        visited[0][0]=true;
        int d=0;
        if(map.containsKey(src))
            d=map.get(src);
        CellNode cn=new CellNode(new Point(src.x,src.y),d);

        myq.offer(cn);
        while(!myq.isEmpty()){
            CellNode curr=myq.poll();
            Point p=curr.p;

            if(p.x==dest.x&&p.y==dest.y)
                return curr.dist;


            /*if(arr[p.x][p.y]==2||arr[p.x][p.y]==0)
                len++;*/
            myq.poll();
            for(int i=0;i<4;i++){
                    int row=p.x+rowNum[i];
                    int col=p.y+colNum[i];
                    if(isValid(row,col,dest.x,dest.y)&&!visited[row][col]){
                        visited[row][col]=true;
                        Point adp=new Point(row,col);
                        int dis=curr.dist+1;
                        CellNode adj=new CellNode(adp,dis);
                        myq.offer(adj);
                       // if(map.containsKey(adp))
                        map.put(adp,dis);
                        //len=len+dis;
                    }
            }

        }
        return -1;
    }
    public static int checkbfs(int[][]arr,boolean[][]visited,int x,int y){
        int m=arr.length;
        int n=arr[0].length;
        int one=bfs(new Point(0,0),new Point(m-1,n-1),new boolean[m][n]);
        int two=bfs(new Point(m-1,n-1),new Point(x,y), new boolean[m][n]);
        Point p=new Point(x,y);
        if(map.containsKey(p))
            return (map.get(p));
        else return -1;
    }



    public static boolean isValid(int row, int col,int m,int n)
    {
        // return true if row number and column number
        // is in range
        return (row >= 0) && (row <=m) &&
                (col >= 0) && (col <=n)&&(arr[row][col]!=1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        int j=0;
        for(int i=0;i<n;i++){
            while(j<n) {
                arr[i][j++]=sc.nextInt();
            }
            j=0;
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean[][]visited=new boolean[n][n];
        System.out.println(checkbfs(arr,visited,x,y));

    }
}
class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x &&
                Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


}
class CellNode{
    Point p;
    int dist;
    public CellNode(Point p,int dist){
        this.p=p;
        this.dist=dist;
    }
}
