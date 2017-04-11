/**
 * Created by surabhi on 3/29/17.
 */
public class FindLargestRegion {
    public static int findRegion(int[][]grid,boolean[][]visited){
        int len=0;
        if(grid.length==0)
            return 0;
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                {
                    int size=getValue(grid,visited,i,j,m,n);
                    len=Math.max(len,size);
                }
            }
        }
        return len;


    }
    public static int getValue(int[][]block,boolean[][]visited,int i,int j,int m,int n){
        int[][] neighbors = {{1, 1},{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 0}, {0, 1}};
        if(block[i][j]==0)
            return 0;
        visited[i][j]=true;
        block[i][j]=0;
        int size=1;
        for (int p = 0; p < neighbors.length; p++) {
            //len+=1;
            int row=neighbors[p][0]+i;
            int col=neighbors[p][1]+j;
            if (row >= 0 && col >= 0 && row< block.length && col< block[0].length&&!visited[row][col]) {
                size+=getValue(block,visited,row,col,m,n);
            }
            visited[i][j] = false;
        }

        return size;
        //return len;

    }

    public static void main(String[] args) {
        int[][]grid={{0,0,1,1,0},{1,0,1,1,0},{0,1,0,0,0},{0,0,0,0,1}};
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        System.out.println(findRegion(grid,visited));
    }
}
