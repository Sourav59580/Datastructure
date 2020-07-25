
class Node
{
    int data = 0;
    Node next = null;
    Node(int d){
        data = d;
        next = null;
    }
}



public class SortingOperation {
    static Node head;
    static Node root;
    
    static void insert(int d)
    {
        Node n = new Node(d);
        if(root==null){
            root=n;
            head = head.next;
            return;
        }

        Node temp = root;
        Node prev = null;
        while(temp!=null){
            if(d>temp.data){
                prev = temp;
            }
            temp = temp.next;
        }

        if(prev==null){
            n.next=root;
            root=n;
            head=head.next;
            return;
        }

        n.next = prev.next;
        prev.next= n;
        head=head.next;
        return;
    }



   static void display()
   {
    Node temp = head;
    System.out.print("head : ");
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
   }

   static void rootDisplay()
   {
    Node temp = root;
    System.out.print("root : ");
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
   }

    public static void main(String[] args) {
        head = null;
        head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(9);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(1);

        Node start = head;
        root = null;
        while(start!=null){
            insert(start.data);
            display();
            rootDisplay();
            start = start.next;
        }
        
    }

}