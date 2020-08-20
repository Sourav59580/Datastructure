import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoubleEndedList
{
    static Scanner sc=new Scanner(System.in);
    static Node right=null;
    static Node left=null;
    static void insertRight(int data)
    {
        Node n=new Node(data);
        if(left==null&&right==null)
        {
            left=n;
            right=n;
            return;
        }
        right.next=n;
        n.prev=right;
        right=right.next;
        
    }
    static void insertLeft(int data)
    {
        Node n=new Node(data);
        if(left==null&&right==null)
        {
            left=n;
            right=n;
            return;
        }
        left.prev=n;
        n.next=left;
        left=left.prev;
    }
    static int deleteLeft()
    {
        if(left==null||right==null)
        return -1;
        Node n=left;
        left=left.next;
        n.next=null;
        left.prev=null;
        return n.data;
    }
    static int deleteRight()
    {
        if(left==null||right==null)
        return -1;
        Node n=right;
        right=right.prev;
        n.prev=null;
        right.next=null;
        return n.data;
    }
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. input restricted");
        System.out.println("2. output restricted");
        int select=sc.nextInt();
        int num,q,data;
        if(select==1)
        {
            System.out.println("Menu:");
            System.out.println("1. left input restricted");
            System.out.println("2. right input restricted");
            select=sc.nextInt();
            if(select==1)
            {
                System.out.println("ENTER NUMBER OF QUERIES:");
                num=sc.nextInt();
                while(num>0)
                {
                    q=sc.nextInt();
                    if(q==1)
                    {
                        System.out.println("ENTER DATA:");
                        data=sc.nextInt();
                        insertLeft(data);
                    }
                    if(q==2)
                    {
                        System.out.println("Menu:");
                        System.out.println("1. left delete");
                        System.out.println("2. right delete");
                        select=sc.nextInt();
                        if(select==1)
                        System.out.println("ELEMENT DELETED "+deleteLeft()+" ");
                        if(select==2)
                        System.out.println("ELEMENT DELETED "+deleteRight()+" ");
                    }
                    num--;
                }
                return;
            }
            if(select==2)
            {
                System.out.println("ENTER NUMBER OF QUERIES:");
                num=sc.nextInt();
                while(num>0)
                {
                    q=sc.nextInt();
                    if(q==1)
                    {
                        System.out.println("ENTER DATA:");
                        data=sc.nextInt();
                        insertRight(data);
                    }
                    if(q==2)
                    {
                        System.out.println("Menu:");
                        System.out.println("1. left delete");
                        System.out.println("2. right delete");
                        select=sc.nextInt();
                        if(select==1)
                        System.out.println("ELEMENT DELETED "+deleteLeft()+" ");
                        if(select==2)
                        System.out.println("ELEMENT DELETED "+deleteRight()+" ");
                    }
                    num--;
                }
            }
        }
        else if(select==2)
        {
            System.out.println("Menu:");
            System.out.println("1. left output restricted");
            System.out.println("2. right output restricted");
            select=sc.nextInt();
            if(select==1)
            {
                System.out.println("ENTER NUMBER OF QUERIES:");
                num=sc.nextInt();
                while(num>0)
                {
                    q=sc.nextInt();
                    if(q==1)
                    {
                        System.out.println("ENTER DATA:");
                        data=sc.nextInt();
                        System.out.println("Menu:");
                        System.out.println("1. left insert");
                        System.out.println("2. right insert");
                        select=sc.nextInt();
                        if(select==1)
                        insertLeft(data);
                        if(select==2)
                        insertRight(data);
                    } 
                    if(q==2)
                    {
                        System.out.println("ELEMENT DELETED "+deleteLeft()+" ");
                    }
                    num--;
                }
            }
            if(select==2)
            {
                System.out.println("ENTER NUMBER OF QUERIES:");
                num=sc.nextInt();
                while(num>0)
                {
                    q=sc.nextInt();
                    if(q==1)
                    {
                        System.out.println("ENTER DATA:");
                        data=sc.nextInt();
                        System.out.println("Menu:");
                        System.out.println("1. left insert");
                        System.out.println("2. right insert");
                        select=sc.nextInt();
                        if(select==1)
                        insertLeft(data);
                        if(select==2)
                        insertRight(data);
                    } 
                    if(q==2)
                    {
                        System.out.println("ELEMENT DELETED "+deleteRight()+" ");
                    }
                    num--;
                }
            }
        }
    }
}