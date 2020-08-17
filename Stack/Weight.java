

public class Weight {
    static final int max = 100;
    static int top = -1;
    static char a[] = new char[max];

    static int independent = 0;

    static boolean push(char c)
    {
        if(top>max){
            System.out.println("Overflow");
            return false;
          }
          else{
              a[++top] = c;
              return true;
          }
    }

    static boolean pop()
    {
        if (top < 0) { 
            System.out.println("Stack Underflow");
            independent+=1;
            return false; 
        } 
        else { 
            char x = a[top--]; 
            return false; 
        } 
    }

    static int Operation(String exp)
    {
        int weight =0;
        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(c=='(')
            {
                push(c);
            }
            
            else if(c==')')
            {
                pop();
                weight++;
            }
            
        }
        



        return weight;
    }
    public static void main(String[] args) {
        String exp = "(()(()))";
        int result = Operation(exp);
        System.out.println(result);
    }

}