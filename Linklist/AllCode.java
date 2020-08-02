//Detect loop

class Result {
    static int loopInList(Node head) {
      Node fast=head;
      Node slow = head;
      int count=1;
      while(slow!=null && fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow = slow.next;
        if(slow==fast){
          Node temp = slow;
          while(temp.next!=slow){
            temp=temp.next;
            count++;
          }
          return count;
        }
      }
  return 0;
    }
  }


//Reverse LinkList

class Result {
  static Node reverseList(Node head) {
    Node root = null;
    Node temp = head;
    while(temp!=null){
      Node n = new Node(temp.data);
      if(root==null){
        root = n;        
      }else{
       Node t = root;
        root = n;
        n.next = t;
      }
      temp = temp.next;
    }
    return root;

  }
}

//Middle Element

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

//Nth Node from the end of LinkList

class GfG
{
    int getSize(Node head){
        int c =0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
    int getNthFromLast(Node head, int n)
    {
    	int size = getSize(head);
    	if(head==null || n>size)
    	return -1;
    	else{
    	    Node fast = head;
    	    Node slow = head;
    	    for(int i=1;i<n;i++){
    	      fast= fast.next;  
    	    }
    	    while(fast.next!=null){
    	        slow= slow.next;
    	        fast = fast.next;
    	    }
    	    return slow.data;
    	}
    }
}

//Group Reverse

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

//Palindrom

class Result {
    static int checkPalindrome(Node head) {
      Node root = null;
      Node temp = head;
      if(head==null){
        return 0;
      }
      while(temp!=null){
        Node n = new Node(temp.data);
        if(root==null){
          root = n;
        }
        else{
          Node t = root;
          n.next = t;
          root = n;
        }
        temp = temp.next;
      }
      int flag = 1;
      Node first = head;
      Node second = root;
      while(first!=null){
        if(first.data==second.data){
          flag = 1;
        }
        else{
          flag =0;
          break;
        }
          first = first.next;
          second = second.next;
      }
      return flag;
      
  
    }
  }
