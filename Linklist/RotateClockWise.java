class Node
{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class RotateClockWise
{
    static void rotate(Node head){
        Node midNode = null;

        Node fast = head;
        Node slow = head;
        if(head!=null){
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            midNode = slow;
        }

        Node root = null;

        while(midNode!=null){
            Node n = new Node(midNode.data);
            if(root==null){
                root = n;
            }else{
                Node temp = root;
                root=n;
                n.next=temp;
            }
            midNode=midNode.next;
        }
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root=root.next;
        }
        Node t = head;
        while(t!=midNode){
            Node n = new Node(t.data);
            Node pre = root;
            Node p = null;
            while(pre!=null){
                p=pre;
                pre=pre.next;
            }
            p=n;
            t=t.next;
        }
       
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root=root.next;
        }

    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(2);
        head.next = new Node(0);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(8);

        rotate(head);
    }
}