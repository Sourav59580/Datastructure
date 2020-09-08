class Node
{
    int data;
    Node left,right;
    Node(int d){
        data= d;
        left=right=null;
    }
}



public class Implementation{
    static void preorder(Node node){
        if(node==null)
        return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void Inorder(Node node){
        if(node==null)
        return;
        
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    static void Postorder(Node node){
        if(node==null)
        return;
        
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Preorder:");
        preorder(root);
        System.out.println();

        System.out.print("Inorder:");
        Inorder(root);
        System.out.println();

        System.out.print("Postorder:");
        Postorder(root);
        System.out.println();
    }
}