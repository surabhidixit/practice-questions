/**
 * Created by surabhi on 3/31/17.
 */
public class DeleteLinkedListKey {
    public static Node delete(Node head,int x){
        if(head==null)
            return null;
        else {
            while(head.data==x){
                head=head.next;
            }

            Node temp=head;
            while(head.next!=null){
                if(head.next.data==x)
                    head.next=head.next.next;
                else
                    head=head.next;
            }
        return temp;
        }

    }
    public static void main(String[] args) {
        Node n=new Node(4);
        n.next=new Node(4);
        n.next.next=new Node(5);
        n.next.next.next=new Node(9);
        Node x=delete(n,4);
        while(x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }
}
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
