
public class StackLinkList {
    static Node top;

    static class Node {
        int data;
        Node next;
    }
    static Node push(Node top,int data)
    {
        Node n = new Node();
        if(top==null)
        {
         n.data = data;
         n.next = null;
         top = n;
         return top;
        }
        else{
          n.data= data;
          Node prev = top;
          n.next = prev;
          top=n;
          return top;
        }
    }

    static void pop(Node top){
        if(top==null)
        System.out.println("Underflow");
        else{
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            
        }

    }
   public static void main(String[] args) {
     top = null;
     top=push(top,1);
     top=push(top,2);
     top=push(top,3);
     top=push(top,4);

     pop(top);
   }
}