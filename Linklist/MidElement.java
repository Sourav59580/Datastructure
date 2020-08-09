class Node
{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class List
{
    public void FindMidTerm(Node head){
        Node fast = head;
        Node slow = head;
        if(head!=null){
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
        }
    }
}

public class MidElement {
    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        
        List obj = new List();
        obj.FindMidTerm(head);
    }

}