
import java.util.Scanner;

class Result {
    static Node addListNumbers(Node head1, Node head2) {
      if(head1==null)
        return head2;
      if(head2==null)
        return head1;
      Node t1=head1;
      int k = 0;
      int s1 = 0;
      while(t1!=null){
        s1+=t1.data*Math.pow(10,k);
        k++;
        t1=t1.next;
      }
      
      Node t2 = head2;
      k=0;
      int s2 =0;
      while(t2!=null){
        s2+=t2.data*Math.pow(10,k);
        k++;
        t2=t2.next;
      }
      
      int num = s1+s2;
      Node root = null;
      while(num!=0){
        int rem = num%10;
        Node n = new Node(rem);
        if(root==null)
        {
          root=n;
        }else{
         Node prev = null;
          Node last = root;
          while(last!=null){
            prev=last;
            last=last.next;
          }
          prev.next = n;
        }
        num = num/10;
      }
     
      return root;
  
    }
  }


class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
      data=d;
    }
  }
class Main {
    static Node insertEnd(Node head, int data) {
      Node newLink = new Node(data);
      Node last = head;
      newLink.next = null;   // link new node to NULL as it is last node
      if (head == null)  // if list is empty add in beginning.
      {
        head = newLink;
        return head;
      }
      while (last.next != null)  // Find the last node
        last = last.next;
      last.next = newLink;  // Add the node after the last node of list
      return head;
    }
  
    static void forwardPrint(Node head)   {
      Node current = head; // start at beginning of list
      while(current != null) // until end of list,
      {
        System.out.print(current.data + " "); // print data
        current = current.next; // move to next link
      }
    }
  
    public static void main(String[] args) {
      int t,n,m,x;
      Scanner s = new Scanner(System.in);
      t=Integer.parseInt(s.nextLine().trim());
      while(t>0) {
        Node head = null, head2=null, t1;
        n = s.nextInt();
        while(n>0) {
          m = s.nextInt();
          head = insertEnd(head, m);
          n--;
        }
        n = s.nextInt();
        while(n>0) {
          m = s.nextInt();
          head2 = insertEnd(head2, m);
          n--;
        }
        t1 = Result.addListNumbers(head, head2);
        forwardPrint(t1);
        System.out.println();
        t--;
      }
    }
  }