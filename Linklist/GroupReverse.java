// Input  2 0 3 6 7 8
// Output 3 6 2 0 7 8

// Input  2 0 3 6 7  8 9 10
// Output 3 6 2 0 10 9 7 8 
import java.util.*;

public class GroupReverse {
    static int GetSize(Node head){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    static Node reverse(Node head,int k)
    {
       int size = GetSize(head);

       while(size>k){
           
       }


       return head;
    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(2);
        head.next = new Node(0);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(8);


        head = reverse(head,2);
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

}