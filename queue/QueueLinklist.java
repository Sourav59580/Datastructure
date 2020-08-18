class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class QueueLinklist {
    static Node front = null;
    static Node rear = null;
    static void enQueue(int d)
    {
      Node n = new Node(d);
      if(front==null && rear==null)
      {
         front = n;
         rear = n;
      }else{
          rear.next = n;
          rear = n;
      }
    }
    static void deQueue()
    {
        
       if(front==rear)
       System.out.println();
       else{
           System.out.println(front.data);
           front = front.next;        
       }
    }

    static void display(){
        
        Node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     enQueue(1);
     enQueue(2);
     enQueue(3);
     enQueue(4);
     enQueue(5);
     display();
     deQueue();
     deQueue();
     display();

    }

}