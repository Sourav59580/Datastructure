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
        //System.out.println(size);
        return size;
    }

    //fast move
    static Node fastMove(Node head,int k){
        Node temp = head;
        while(k>0){
            temp = head.next;
            k--;
        }
        return temp.next;
    }

    //slow move
    static Node slowMove(Node head,int k){
        Node temp = head;
        while(k>0){
            temp = head.next;
            k--;
        }
        return temp.next;
    }
   
    static void swap(Node fast, Node slow,int k)
    {
        while(k>0)
        {
            int t = slow.data;
            slow.data = fast.data;
            fast.data = t;
            fast= fast.next;
            slow= slow.next;
            k--;
        }
    }





    static Node reverse(Node head,int k)
    {
       int size = GetSize(head);
       int n = k+k;
       int rns= n; 
       Node temp = head;
       Node fast = head;
       fast = fastMove(fast,k);
       Node slow = head;

       while(fast!=null){
         n=n+k+k;
         swap(fast,slow,k);
         fast = fastMove(fast,k);
         slow = slowMove(fast,k);
         if(size<n)
         break;
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
        head.next.next.next.next.next.next = new Node(9);
        // head.next.next.next.next.next.next.next = new Node(10);

        head = reverse(head,2);
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

}