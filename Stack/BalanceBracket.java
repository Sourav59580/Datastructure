
public class BalanceBracket {
    static final int max = 100;
    static int top = -1;
    static char a[] = new char[max];

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

    static void pop(char c){
        if (top < 0) { 
            System.out.println("Balanced"); 
        } 
        else{
            char x = a[top];
            if(x!=c){
            }
            else{
                top--;
            }
            
        }
    }

    static void checkBalance(String exp){
      for(int i=0;i<exp.length();i++){
          char ch = exp.charAt(i);
          if(ch=='(' || ch=='{' || ch=='[')
          {
              push(ch);
          }
          else if(ch==')' || ch=='}' || ch==']'){
              pop(ch);
          }
      }
    }
   public static void main(String[] args) {
       String expression = "((a+b)-c*(d^e))";
       checkBalance(expression);
   }
}