

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
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid = size/2;
        if(size%2!=0){
            Node t = head;
            Node element = null;
            for(int i=0;i<=mid;i++){
              element = t;
              t=t.next;
            }
            System.out.println(element.data);
        }
        else{
            Node first = null;
            Node t = head;
            for(int i=0;i<mid;i++){
                first = t;
                t= t.next;
            }
            System.out.println(first.data+" "+first.next.data);
            
            
        }
    }
}

public class MidTerm {
    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        
        List obj = new List();
        obj.FindMidTerm(head);
    }

}