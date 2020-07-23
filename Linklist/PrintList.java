
class Node
{
    int data;
    Node next;
    Node(){
        data =0;
        next = null;
    }
    Node(int d){
        data = d;
        next = null;
    }
}

public class PrintList
{
   public static void main(String[] args) {
       Node head = null;
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       
       while(head!=null){
           System.out.print(head.data+" ");
           head = head.next;
       }
       
   }
}