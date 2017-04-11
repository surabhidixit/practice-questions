import java.security.Key;
import java.util.*;

/**
 * Created by surabhi on 4/2/17.
 */
public class HackLandElection {
    public static void main(String[] args) {
        //String[]votes={"Harry","Jim","Jack","Priya","Priya","Jim","Veronica","Veronica"};
        //PriorityQueue<Vote>queue=new PriorityQueue<>();
        //List<Vote>queue=new ArrayList<>();
        String[] votes = {"Alex",
                "Michael",
                "Harry",
                "Dave",
                "Michael",
                "Victor",
                "Harry",
                "Alex",
                "Mary",
                "Mary"};
                /*{"Victor",
                        "Veronica",
                        "Ryan",
                        "Dave",
                        "Maria",
                        "Maria",
                        "Farah",
                        "Farah",
                        "Ryan",
                        "Veronica"};*/
                /*{"Victor",
                        "Veronica",
                        "Ryan",
                        "Dave",
                        "Maria"

                };*/
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        String winner="";
        for (String vote: votes) {
            if (map.get(vote) == null)
            {
                map.put(vote, 1);
                max=Math.max(1,max);
            }
            else {
                int count = map.get(vote)+1;
                map.put(vote, count);
                max = Math.max(max, count);
                /*if(count>=max){
                    max=count;
                    if(winner.compareTo(vote)<0)
                        winner=vote;
                }*/
            }
        }
        TreeSet<String> res = new TreeSet<>();

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max)
                res.add(entry.getKey());
        }
       System.out.println(res.last());
       // System.out.println(winner);
    }
}



