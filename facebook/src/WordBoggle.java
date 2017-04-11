import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by surabhi on 3/22/17.
 */
public class WordBoggle {
    public static void main(String[] args) {
        String[] dict = {"GEEKS", "FOR", "QUIZ"};
        char[][] block = {{'G', 'I', 'Z'},
                {'U', 'E', 'K'},
                {'Q', 'S', 'E'}};

        System.out.print(find(dict,block));
        System.out.println();
    }
public static boolean hasWord(String[]dict,String word){
    for(int i=0;i<dict.length;i++){
        if(dict[i].equals(word)) {
            dict[i]="";
            return true;
        }
    }
    return false;
}
public static ArrayList find(String[]dict,char[][]block) {
    ArrayList<String> list = new ArrayList();
    boolean[][] visited = new boolean[block.length][block[0].length];
    for (int i = 0; i < block.length; i++) {
        for (int j = 0; j < block[0].length; j++) {
            boggle(dict,visited,block,"",list,i,j);

        }
    }
    return list;
}
    public static ArrayList boggle(String[] dict, boolean[][]visited,char[][] block,String word,ArrayList list,int i,int j) {
        if (dict.length == 0 || block.length == 0)
            return list;
        else {
            //String temp="";
            int[][] neighbors = {{1, 1},{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 0}, {0, 1}};


                    if (word != "" && hasWord(dict,word)) {
                        list.add(word);

                    }
                    else {
                        //if(!visited[i][j])
                        visited[i][j] = true;

                        word+=block[i][j];
                        for (int p = 0; p < neighbors.length; p++) {
                            int row=neighbors[p][0]+i;
                            int col=neighbors[p][1]+j;
                            if (row >= 0 && col >= 0 && row< block.length && col< block[0].length&&!visited[row][col]) {
                                boggle(dict,visited,block,word,list,row,col);
                            }
                            }
                        }
                        visited[i][j] = false;
                        word=word.substring(word.length()-1);

                    }
                    return list;

                }
            }
