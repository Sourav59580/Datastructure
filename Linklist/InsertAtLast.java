import java.util.*;
class Node
{
    int data = 0;
    Node next = null;
    Node(int d){
        data = d;
        next = null;
    }
}

public class InsertAtLast {
    static Node head;
    static void insertData(int d){
        Node n = new Node(d);
        if(head==null){
            head = n;
            return;
        }
        n.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = n;

        return;
    }
  public static void main(String[] args) {
      head = null;
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      for(int i=0;i<size;i++){
        int d = sc.nextInt();
        insertData(d);
      }
      
    Node temp = head;
     while(temp!=null)
     {
         System.out.print(temp.data+" ");
         temp = temp.next;
     }
      

      
  }

}