import java.util.* ; 
  
class PiorityLinklistQueue 
{     
// Node  
 static class Node {  
    int data;  
    int priority;  
    Node next;  
} 
  
static Node node = new Node(); 
    
// Function to Create A New Node  
static Node newNode(int d, int p)  
{  
    Node temp = new Node();  
    temp.data = d;  
    temp.priority = p;  
    temp.next = null;  
    return temp;  
}  
    
// Return the value at head  
static int peek(Node head)  
{  
    return (head).data;  
}  
    
// Removes the element with the  
// highest priority form the list  
static Node pop(Node head)  
{  
    Node temp = head;  
    (head)  = (head).next;  
    return head; 
}    
 
static Node push(Node head, int d, int p)  
{  
    Node start = (head);   
    Node temp = newNode(d, p);  
    if ((head).priority > p) {  
        temp.next = head;  
        (head) = temp;  
    }  
    else {  
        while (start.next != null &&  
               start.next.priority < p) {  
            start = start.next;  
        }  
        temp.next = start.next;  
        start.next = temp;  
    }  
    return head; 
}  
    
// Function to check is list is empty  
static int isEmpty(Node head)  
{  
    return ((head) == null)?1:0;  
}  
public static void main(String args[]) 
{  
    Node head = newNode(4, 1);  
    head =push(head, 5, 2);  
    head =push(head, 6, 3);  
    head =push(head, 7, 0);  
    
    while (isEmpty(head)==0) {  
        System.out.printf("%d ", peek(head));  
        head=pop(head);  
    }  
    
}  
} 