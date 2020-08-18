class Queue
{
    static int size = 5;
    static int items[] = new int[size];
    static int rear = -1;
    static int front = -1;

    // Check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == size - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
    return false;
}

      
    
    // Adding an element
  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Overflow");
    } else {
      if (front == -1)
        front = 0;
      rear = (rear + 1) % size;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }
    // Removing an element
  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Underflow");
      return (-1);
    } else {
      element = items[front];
      if (front == rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front = (front + 1) % size;
      }
      return (element);
    }
  }
  void display() {
    /* Function to display status of Circular Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for (i = front; i != rear; i = (i + 1) % size)
        System.out.print(items[i] + " ");
      System.out.println(items[i]);
      System.out.println("Rear -> " + rear);
    }
  }

}


public class ImplementQueue
{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
      }
}