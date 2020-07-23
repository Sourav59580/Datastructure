
class Node
{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class ReverseLinkList {
    static void reverList(Node head){
       
        Node root = null;
        Node temp = head;
        Node t= null;
        while(temp!=null){
            Node n = new Node(temp.data);
            t= root;
            root = n; 
            n.next=t;
            temp=temp.next;
        }

        while(root!=null){
            System.out.print(root.data+" ");
            root= root.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        reverList(head);
        
    }

}