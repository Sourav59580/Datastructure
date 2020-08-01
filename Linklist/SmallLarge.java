import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SmallLarge {
    static int LargeElement(Node head){
        Node root = head;
        int max = 0;
        while(root!=null){
            if(root.data>max){
                max = root.data;
            }
            root = root.next;
        }
     return max;
    }
    static int SmallData(Node head){
        Node root = head;
        int min = 1234;
        while(root!=null){
            if(min>root.data){
              min= root.data;
            }
            root= root.next;
        }
       return min;
    }

    static int FindData(Node head,int data){
        int pos = 0;
        Node root = head;
        while(root!=null){
            pos++;
            if(root.data==data){
                break;
            }
            root = root.next;
        }
        return pos;
    }

    static Node DeleteNode(Node head,int pos){
        if(pos==1){
            head = head.next;
            return head;

        }else{
            Node fast = head.next;
            Node slow = head;
            while(pos>2){
                fast = fast.next;
                slow = slow.next;
                pos--;
            }
            slow.next = fast.next;
            return head;
        }
        
    }

    static void operation(Node head)
    {
        int min = SmallData(head);
        int pos = FindData(head,min);
        
        System.out.println("Minimum element : "+min+"  Position: "+pos);

        head =DeleteNode(head,pos);

        head = insertAtFirst(head,min);

        int max = LargeElement(head);
        pos = FindData(head, max);
        
        System.out.println("Maximum element : "+max+"  Position: "+pos);

        head = DeleteNode(head, pos);

        head = insertEnd(head,max);

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node insertAtFirst(Node head,int value){
        Node newLink = new Node(value);
        if(head==null)
        {
            head = newLink;
            return head;
        }
        Node temp = head;
        head = newLink;
        newLink.next=temp;
        return head;
    }

    static Node insertEnd(Node head, int value) {
        Node newLink = new Node(value);
        Node last = head;
        newLink.next = null;
        if (head == null) {
            head = newLink;
            return head;
        }
        while (last.next != null)
            last = last.next;
        last.next = newLink; // Add the node after the last node of list
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Length of List");
        int l = s.nextInt();
        while (l > 0) {
            int m = s.nextInt();
            head = insertEnd(head, m);
            l--;
        }

        operation(head);


    }

}