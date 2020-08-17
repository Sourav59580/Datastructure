class Queue {

    int maxSize =100;
    int rear = -1;
    int front = -1;
    int aQueue[] = new int[maxSize];

    void enQueue(int item) {
        if (((rear + 1) % maxSize) == front) {
            System.out.println("Overflow");
        } else {
            if (rear == front && front == -1) {
                front += 1;
            }
            rear = (rear + 1) % maxSize;
            aQueue[rear] = item;
        }
    }

    void deQueue() {
        if (rear == front && rear == -1) {
            System.out.println("Underflow");
        } else {
            int item = aQueue[front];
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % maxSize;
            }
            System.out.println(item);
        }
    }
}

public class CircularQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.deQueue();
    }

}