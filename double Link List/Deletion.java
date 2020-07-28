

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



public class Deletion {
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
    static Node deleteAtFirst(Node head){
        if(head==null)
        return head;

        Node temp = head;
        head = temp.next;
        head.prev=null;
        return head;
    }
    
    static Node deleteAtLast(Node head){
        if(head==null)
        return head;
        Node temp = head;
        Node pre= null;
        while(temp!=null){
            pre = temp.prev;
            temp = temp.next;
        }
        pre.next = null;
        return head;
    }
   static Node deleteAtMid(Node head){
       if(head==null)
       return null;
       if (head.next == null) { 
        return null; 
       } 
        Node slow = head; 
        Node fast = head; 

        Node pre = null;

        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        pre.prev = pre;
        return head;
   }
//    static Node deletionByValue(Node head,int data){
//      while()  
//    }
   public static void main(String[] args) {
    Node head = null;
    head = addBegin(head, 4);
    head = addBegin(head, 3); 
    head = addLast(head,5);
    head = addLast(head,6);
    head = addLast(head,7);
    head = addLast(head,8);
    
    head = deleteAtMid(head);
    Node temp = head;
    System.out.println("Mid : ");
    while(temp!=null){
        System.out.println(temp.data);
        temp= temp.next;
    }

    head = deleteAtFirst(head);
    temp = null;
    temp = head;
    System.out.println("First deletion : ");
    while(temp!=null){
        System.out.println(temp.data);
        temp= temp.next;
    }

    head = deleteAtLast(head);
    temp = null;
    temp = head;
    System.out.println("Last Deletion : ");
    while(temp!=null){
        System.out.println(temp.data);
        temp= temp.next;
    }
      
    //deletion by given value
    

    


   }
}