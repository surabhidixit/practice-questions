/**
 * Created by surabhi on 4/6/17.
 */
public class AddLinkedList {
    public static void main(String[] args) {
        lNode l=new lNode(1);
        l.next=new lNode(4);
        //l.next.next=new lNode(5);
        lNode l2=new lNode(1);
        l2.next=new lNode(7);
        l2.next.next=new lNode(2);
        lNode l3=null;
        lNode temp=l3;
        int carry=0;
        int x=0;
        int y=0;
        int sum=0;
        while(l!=null||l2!=null) {
            if(l==null){
                while(l2!=null){
                    l3.next=new lNode(l2.data);
                    l3=l3.next;
                    l2=l2.next;
                }
                //return temp;
            }
            if(l2==null){
                while(l!=null){
                   // l3.next=new lNode(l1.data);
                    l3=l3.next;
                  //  l2=l1.next;
                }
               // return temp;
            }
            x = l.data;
            y = l2.data;
            sum=(x+y)%10+carry;
            carry=(x+y)/10;

            if(l3==null)
            {
                l3=new lNode(sum);
                temp=l3;
                l=l.next;
               // l3=l3.next;
                l2=l2.next;
            }
            else
            {
                l3.next=new lNode(sum);
                l=l.next;
                //l3=l3.next;
                l2=l2.next;
                l3=l3.next;
            }
        }
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }

    }
}

