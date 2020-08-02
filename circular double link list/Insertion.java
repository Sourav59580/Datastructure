
class Node 
{
    int data;
    Node prev;
    Node next;
    Node(int d)
    {
        data = d;
        prev = null;
        next = null;
    }
}





public class Insertion
{
    static Node insertAtBegin(Node start,int d)
    {
        Node n = new Node(d);
        if(start == null){
            n.next = start;
            n.prev = start;
            start = n;
            return start;
        }
        
        Node temp = start;
        n.next = temp;
        start = n;
        Node pre=null;
        while(temp!=start){
            pre = temp;
            temp = temp.next;
        }
        pre.next = start;
        pre.prev = start;
        
        
       return start;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head,2);
        //head = insertAtLast(head,3);
        head = insertAtBegin(head,1);
        //head = insertAtLast(head,4);

        Node temp = head;
        while(temp!=head.next)
        {
            System.out.print(temp.data+" ");
            temp = temp.next; 
        }


    }
}