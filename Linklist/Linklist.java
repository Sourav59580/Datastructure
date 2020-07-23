
public class Linklist {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insertAtMid(int x) {
        if (head == null)
            head = new Node(x);

        else {
            Node newNode = new Node(x);
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }

    static void insertAfter(int x,int data)
    {
        if(head==null)
         head = new Node(data);
        
        else{
            Node temp = head;
            Node prev=null;
            while(temp.data!=x){
              prev = temp.next;
              temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    static void insertBefore(int x,int data){
        if(head==null)
        head = new Node(data);
        
        else{
            Node newNode = new Node(data);
            Node temp = head;
            Node prePrev=null;

            while(temp.data!=x){
              prePrev = temp;
              temp = temp.next;
            }
            newNode.next = prePrev.next;
            prePrev.next = newNode;
        }
    }

    public static void main(String[] args) {
        head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        display();

        // int x = 3;
        // insertAtMid(x);

         //insertAfter(2,3);

         insertBefore(5,3);

        System.out.println("\nLinked list after" + " insertion: ");
        display();
    }
}