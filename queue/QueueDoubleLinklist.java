
public class QueueDoubleLinklist {
    static class Node {
        int data;
        Node prev;
        Node next;
    }

    static class Queue {
        Node front, rear;
    }

    // Function to create Circular queue  
static void enQueue(Queue  q, int value)  
{  
     Node  temp = new Node();  
     temp .data = value;  
    if (q .front ==  null)
    {
        temp.prev = null;
        q .front = temp;
        temp.next = null;
        q.rear = temp;
    }  
          
    else
        q .rear .link = temp;  
    
    q .rear = temp;  
    q .rear .link = q .front;  
}  

    public static void main(String[] args) {

        Queue q = new Queue();
        q.front = q.rear = null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

    }

}