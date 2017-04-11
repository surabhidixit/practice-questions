/**
 * Created by surabhi on 4/4/17.
 */
public class FindMidLinkList {
    public static void main(String[] args) {
        lNode l=new lNode(1);
        l.next=new lNode(2);
        l.next.next=new lNode(3);
        l.next.next.next=new lNode(4);
        l.next.next.next.next=new lNode(5);
        System.out.println(findmid(l));
    }
    public static int findmid(lNode head){
        int count=0;
        int i=0;
        lNode temp=head;
        while(head!=null){
            head=head.next;
            count++;
        }
        while(i<count/2){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
}
class lNode{
    int data;
    lNode next;
    public lNode(int d){
        data=d;
    }
}
