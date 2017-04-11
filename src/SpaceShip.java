import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by surabhi on 4/10/17.
 */
public class SpaceShip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int ships=Integer.valueOf(sc.next());
       // BigInteger big=BigInteger.valueOf(Integer.valueOf(sc.next()));
        System.out.println(BigInteger.valueOf(Long.valueOf("486869240777")));
        List<Segment>list=new ArrayList<>();
       /* while(ships-->0){
            int id=sc.nextInt();
            int s=sc.nextInt();
            int e=sc.nextInt();
            list.add(new Segment(id,BigInteger.valueOf(s),BigInteger.valueOf(e)));

        }*/

        //list.add(new Segment(9428,BigInteger.valueOf(9),90));
       /* list.add(new Segment(4,105,145));
        list.add(new Segment(90,150,1));
        list.add(new Segment(102,198,5));*/
        Collections.sort(list, new Comparator<Segment>() {
            @Override
            public int compare(Segment o1, Segment o2) {
                return o1.end.compareTo(o2.end);
            }
        });
        Map<Integer,Integer>map=new TreeMap<>();
        //Set<Cell>map=new HashSet<>();
        map.put(list.get(0).id,0);
        for(int i=1;i<list.size();i++){
            Segment x=list.get(i);
            map.put(x.id,0);
        for(int j=0;j<i;j++){
            Segment y=list.get(j);
            if(x.start.compareTo(y.start)<1){
                map.put(x.id,map.get(x.id)+1);
            }
        }
        }
        List<Map.Entry>res=new ArrayList<>(map.entrySet());
        Collections.sort(res, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return ((Segment)o1.getKey()).id<((Segment)o2.getKey()).id?1:-1;
            }
        });
        /*Map<Integer, Integer> sortedMap =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));*/
        for(Map.Entry e:res)
            System.out.println(e.getKey()+" "+e.getValue());

    }

}
class Segment{
    int id;
    BigInteger start;
    BigInteger end;
    public Segment(int id,BigInteger s,BigInteger e){
        this.start=s;
        this.end=e;
        this.id=id;
    }
    public String toString(){
        return ""+this.id;
    }

}
class Cell implements Comparator{
    int id;
    int score;
    public Cell(int id,int score){
        this.id=id;
        this.score=score;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Cell)o1).score<=((Cell)o2).score?1:-1;
    }
}

