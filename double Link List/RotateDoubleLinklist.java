class LinkList 
{
    int data;
    LinkList next;
    LinkList prev;
    LinkList(int d){
        data = d;
        next = null;
        prev = null;
    }
}


public class RotateDoubleLinklist
{
    static LinkList addLast(LinkList head,int data)
    {

    }

    public static void main(String[] args) {
        LinkList head = null;
        head = addLast(head,1);
        head = addLast(head,2);
        head = addLast(head,3);
        head = addLast(head,4);
        head = addLast(head,5);
        head = addLast(head,6);
        head = addLast(head,7);

    }
}