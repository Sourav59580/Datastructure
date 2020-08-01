/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DeletionAtGivenPosSL {
    
    static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }
    static Node Del(Node head) {
        Node current=head;
        Node start=head;
        Node last=head;
        Node previous=head;
  int sm=1234;
  int pos=0;
  //find the smallest element in list
  while(start!=null)
  {
    if(sm>(start.data))
    {
      sm=start.data;
      last=last.next;
      pos++;
    }
    start=start.next;
  }
  int i=0;
        System.out.println("Smallest element in list:-"+sm);
        System.out.println("Smallest element in list at pos:-"+pos);
        Node pre = head;
        while(i<pos-2)      //deletion of smallest element in list
        {
            previous=previous.next;
            pre = pre.next.next;
            i++;
        }
        previous.next=pre.next;
        Node h1=insertBeggining(current,sm); //insertion at beggining of deleted element in list
        Node t = h1;
        while(t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
        Node h2=max(head);
        return head;
        
    }
        static Node max(Node head)
    {
         Node current=head;
         Node start=head;
         Node last=head;
         Node previous=head;
         int max=0;
         int pos=0;
         //find the max element in list
  while(start!=null)
  {
    if(max<(start.data))
    {
      max=start.data;
      last=last.next;
      ++pos;
    }
  start=start.next;
  }
  pos=pos+1;
  last=last.next;
  int i=0;
        System.out.println("Maximum element in list:-"+max);
        System.out.println("Maximum element in list at pos:-"+pos);
        Node pre = head;
        while(i<pos-2)      //deletion of smallest element in list
        {
            previous=previous.next;
            pre = pre.next.next;
            i++;
        }
        previous.next=pre.next;
        Node t = head;
        while(t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        Node h1=insertLast(current,max); //insertion at beggining of deleted element in list
        return h1;
    }
    static Node insertBeggining(Node head,int data) {
        Node temp = head;
        Node n = new Node(data);
        head = n;
        n.next = temp;
        return head;
    }
    static Node insertLast(Node head,int data) {
        Node l=head;
        Node prev = null;
        while(l!=null)
        {   
            prev = l;
            l=l.next;
        }
        Node n = new Node(data);
        prev.next = n;
        return head;
    }

    static Node insertEnd(Node head,int value) {
        Node newLink=new Node(value);
        Node last = head;
        newLink.next = null; 
        if(head==null)
        {
            head=newLink;
            return head;
        }
        while(last.next!=null)
            last=last.next;
        last.next = newLink;  // Add the node after the last node of list
    return head;
    }
    static void forwardPrint(Node head)
  {
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + "->"); // print data
      current = current.next; // move to next link
    }
      System.out.println("null");
  }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       DeletionAtGivenPosSL dll=new DeletionAtGivenPosSL();
        System.out.println("Length of List");
       int l=s.nextInt();
       Node head=null;
       while(l>0)
       {
           int m=s.nextInt();
           head=dll.insertEnd(head,m);
           l--;
       }
       dll.forwardPrint(head);
       Node h2=null;
       h2=dll.Del(head);
       System.out.println("After del the smallest node from list");
       dll.forwardPrint(head); 
        
        
    }
    
}