import java.util.*;
class Node
{
    int data = 0;
    Node next = null;
    Node(int d){
        data = d;
        next = null;
    }
}

public class Sorting {
    static Node head;
    static Node root;
    
    static void sortingData(int d)
    {
        Node n = new Node(d);

        if(root==null){
            root = n;
            return;
        }

        Node temp = root;
        Node pre = null;
        while(temp!=null)
        {
            if(d>temp.data){
                pre = temp;
            }
            temp = temp.next;
        }
        
        if(pre==null){
            n.next=root;
            root=n;
            return;
        }
        n.next = pre.next;
        pre.next= n;
        return;
    }


    static void insertData(int d){
        Node n = new Node(d);
        if(head==null){
            head = n;
            return;
        }
        n.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = n;

        return;
    }
  public static void main(String[] args) {
      head = null;
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      for(int i=0;i<size;i++){
        int d = sc.nextInt();
        insertData(d);
      }
      
    Node temp = head;
     while(temp!=null)
     {
        sortingData(temp.data);
         temp = temp.next;
     }

     Node t = root;
     while(t!=null){
        System.out.print(t.data+" ");
        t= t.next;
     }
      

      
  }
  
}