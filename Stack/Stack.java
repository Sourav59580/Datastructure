

public class Stack {
    static final int max = 100;
    static int top = -1;
    static int a[] = new int[max];

    boolean isEmpty() 
    { 
        return (top < 0); 
    } 

    static boolean push(int data)
    {
        if(top>max){
          System.out.println("Overflow");
          return false;
        }
        else{
            a[++top] = data;
            return true;
        }
    }

    static int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        
        for(int i=top;i>=0;i--)
        System.out.print(pop()+" ");
    }

}