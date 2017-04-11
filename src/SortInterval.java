import java.util.*;

/**
 * Created by surabhi on 4/6/17.
 */
public class SortInterval {
    public static void main(String[] args) {
        int[][]x={ {1, 5}, {2, 3}, {4, 6}, {7, 8}, {8, 10}, {12, 15}};
        List<Interval>list=new ArrayList<>();
        list.add(new Interval(1,5));
        list.add(new Interval(8,10));
        list.add(new Interval(2,3));
        list.add(new Interval(4,6));

        Collections.sort(list, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start>o2.start?1:o1.start<o2.start?-1:0;
            }
        });
        Stack<Interval>stk=new Stack<>();
        Interval p=null;
        stk.push(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if(stk.peek().start==list.get(i).start)
            {
                p=stk.pop();
                stk.push(new Interval(list.get(i).start,Math.max(list.get(i).end,p.end)));
            }
            else if(stk.peek().end<list.get(i).end)
            {
                p=stk.pop();
                stk.push(new Interval(Math.min(list.get(i).start,p.start),Math.max(list.get(i).end,p.end)));
            }
            else
                stk.push(list.get(i));

        }
        while(!stk.isEmpty()){
            Interval k=stk.pop();
            System.out.println(k);

        }

    }

}
class Interval{
    int start=0,end=0;
    public Interval(int l,int h){
        start=l;
        end=h;
    }
    public String toString(){
        return "{"+this.start+" "+this.end+"}";
    }
}
