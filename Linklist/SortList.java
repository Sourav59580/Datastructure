class Node
{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class Sort
{
    public Node insert(int d, Node start){

        Node temp = start;
        Node prev = null;
        while(d<temp.data){
            prev= temp;
            temp= temp.next;
        }
        Node n = new Node(d);
        Node t = prev.next;
        prev.next= n;
        n.next= t;
        return n;
      
    }
    public void sortNode(Node head){

        Node temp = head;
        Node root = null;
        while(temp!=null)
        {
            Node prev = null;
            while(root.data<temp.data){
                prev= temp;
                temp= temp.next; 
            }
            Node n = new Node(temp.data);
        Node t = prev.next;
        prev.next= n;
        n.next= t;
        root = root.next;
            temp= temp.next;
        }
        while(root!=null){
            System.out.print(root.data+" ");
            root = root.next;
        }

    }

}


public class SortList {
 public static void main(String[] args) {
    Node head = null;
    head = new Node(10);
    head.next = new Node(12);
    head.next.next = new Node(17);
    head.next.next.next = new Node(20);
    head.next.next.next.next = new Node(26);
    head.next.next.next.next.next = new Node(32);
    head.next.next.next.next.next.next = new Node(82);

    Sort obj = new Sort();
    obj.sortNode(head);
    



     
 }
}