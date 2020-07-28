class Node 
{
    int data;
    Node next;
    Node prev;
    Node(int d){
        data = d;
        next = null;
        prev = null;
    }
}


public class Insertion
{
    static Node addBegin(Node head,int data){
        Node n = new Node(data);
        if(head==null){
         head = n;
         return head;
        }
        else
        {
            Node temp = head;
            temp.prev = n;
            head = n;
            n.next= temp;
            // head.prev = n;
            return head;
        } 
        
    }
    static Node addLast(Node head,int data){
        Node n = new Node(data);
        if(head==null){
         head = n;
         return head;
        }else{
           Node temp = head;
           Node p = null;
           while(temp!=null){
               p = temp;
               temp=temp.next;
           }
           n.prev=p;
           p.next=n;
           return head;
        }
    }
  public static void main(String[] args) {
      Node head = null;
      head = addBegin(head, 4);
      head = addBegin(head, 3); 
      head = addLast(head,5);
      
      Node temp = head;
      while(temp!=null){
          System.out.println(temp.data);
          temp= temp.next;
      }
      
  }




}