
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class DeleteNode
{ 
static class Node  
{ 
    int data; 
    Node next; 
}; 
static Node Insert(Node head, int data) 
{ 
    Node current = head; 
    Node newNode = new Node(); 
    if (newNode == null) 
    { 
        System.out.printf("\nMemory Error\n"); 
        return null; 
    } 
    newNode.data = data; 
    if (head == null)  
    { 
        newNode.next = newNode; 
        head = newNode; 
        return head; 
    }  
    else 
    { 
        while (current.next != head) 
        { 
            current = current.next; 
        } 
        newNode.next = head; 
        current.next = newNode; 
    } 
    return head; 
} 
static void Display( Node head) 
{ 
    Node current = head; 
    if (head == null) 
    { 
        System.out.printf("\nDisplay List is empty\n"); 
        return; 
    } 
    else 
    { 
        do 
        { 
            System.out.printf("%d ", current.data); 
            current = current.next; 
        } while (current != head); 
    } 
} 
static int Length(Node head) 
{ 
    Node current = head; 
    int count = 0; 
    if (head == null)  
    { 
        return 0; 
    } 
    else 
    { 
        do
        { 
            current = current.next; 
            count++; 
        } while (current != head); 
    } 
    return count; 
} 
static Node DeleteFirst(Node head) 
{ 
    Node previous = head, next = head; 
    if (head == null)  
    { 
        System.out.printf("\nList is empty\n"); 
        return null; 
    } 
    if (previous.next == previous)  
    { 
        head = null; 
        return null; 
    } 
    while (previous.next != head) 
    { 
        previous = previous.next; 
        next = previous.next; 
    } 
    previous.next = next.next; 
    head = previous.next; 
  
    return head; 
} 
static Node DeleteLast(Node head) 
{ 
    Node current = head, temp = head, previous=null; 
    if (head == null) 
    { 
        System.out.printf("\nList is empty\n"); 
        return null; 
    } 
    if (current.next == current)  
    { 
        head = null; 
        return null; 
    } 
    while (current.next != head) 
    { 
        previous = current; 
        current = current.next; 
    } 
  
    previous.next = current.next; 
    head = previous.next; 
      
    return head; 
} 
static Node DeleteAtPosition( Node head, int index) 
{ 
    int len = Length(head); 
    int count = 1; 
    Node previous = head, next = head; 
    if (head == null) 
    { 
        System.out.printf("\nDelete Last List is empty\n"); 
        return null; 
    } 
    if (index >= len || index < 0)  
    { 
        System.out.printf("\nIndex is not Found\n"); 
        return null; 
    } 
    if (index == 0)  
    { 
        head = DeleteFirst(head); 
        return head; 
    } 
    while (len > 0) 
    { 
        if (index == count) 
        { 
            previous.next = next.next; 
              
            return head; 
        } 
        previous = previous.next; 
        next = previous.next; 
        len--; 
        count++; 
    } 
    return head; 
} 
public static void main(String args[]) 
{ 
    Node head = null; 
    head = Insert(head, 99); 
    head = Insert(head, 11); 
    head = Insert(head, 22); 
    head = Insert(head, 33); 
    head = Insert(head, 44); 
    head = Insert(head, 55); 
    head = Insert(head, 66); 
    System.out.printf("Initial List: "); 
    Display(head); 
    System.out.printf("\nAfter Deleting node at index 3: "); 
    head = DeleteAtPosition(head, 3); 
    Display(head); 
    System.out.printf("\n\nInitial List: "); 
    Display(head); 
    System.out.printf("\nAfter Deleting first node: "); 
    head = DeleteFirst(head); 
    Display(head); 
    System.out.printf("\n\nInitial List: "); 
    Display(head); 
    System.out.printf("\nAfter Deleting last node: "); 
    head = DeleteLast(head); 
    Display(head); 
} 
} 