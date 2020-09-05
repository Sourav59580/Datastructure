class Node{
    int data;
    Node next;
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}


class addTwoNumber {
    static Node reverse(Node temp)
    {
        Node t2 = temp;
        while(t2!=null)
        {
            System.out.print(t2.data+" ");
            t2 = t2.next;
        }
        Node root = null;
        while(temp!=null)
        {
            Node n = new Node(temp.data);
            if(root==null){
                root = n;
            }else{
               Node t = root;
               root = n;
               n.next = t;
            }
            temp = temp.next;
        }
        return root;
    }
    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node root = reverse(head);
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root = root.next;
        }
    }
}