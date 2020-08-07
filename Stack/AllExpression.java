class PostfixToInfix
{
    static final int max = 100;
    static int top = -1;
    static String a[] = new String[max];

    // check empty stack
    boolean isEmpty() {
        return (top < 0);
    }
    // Push operation
    static boolean push(String data) {
        if (top > max) {
            System.out.println("Overflow");
            return false;
        } else {
            a[++top] = data;
            return true;
        }
    }
    // pop operation
    static String pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String x = a[top--];
            return x;
        }
    }

    public String operation(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String a = pop();
                String b = pop();
                if (c == '+')
                    result = "("+b+"+"+a+")";
                else if (c == '-')
                    result = "("+b+"-"+a+")";
                else if (c == '*')
                    result = "("+b+"*"+a+")";
                else if (c == '/')
                    result = "("+b+"/"+a+")";
                else if (c == '^')
                    result = "("+b+"^"+a+")";

                push(result);
            } else {
                String ch = Character.toString(c);
                push(ch);
            }

        }
       return result;
    }
}

class PrefixToInfix
{
    static final int max = 100;
    static int top = -1;
    static String a[] = new String[max];

    // check empty stack
    boolean isEmpty() {
        return (top < 0);
    }
    // Push operation
    static boolean push(String data) {
        if (top > max) {
            System.out.println("Overflow");
            return false;
        } else {
            a[++top] = data;
            return true;
        }
    }
    // pop operation
    static String pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String x = a[top--];
            return x;
        }
    }

    public String operation(String str)
    {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String b = pop();
                String a = pop();
                if (c == '+')
                    result = "("+b+"+"+a+")";
                else if (c == '-')
                    result = "("+b+"-"+a+")";
                else if (c == '*')
                    result = "("+b+"*"+a+")";
                else if (c == '/')
                    result = "("+b+"/"+a+")";
                else if (c == '^')
                    result = "("+b+"^"+a+")";

                push(result);
            } else {
                String ch = Character.toString(c);
                push(ch);
            }

        }
       return result;

      
    }
}







public class AllExpression { 
    public static void main(String[] args) {
        String str = "23+2*2/52^/";
        PostfixToInfix obj = new PostfixToInfix();
        System.out.println(obj.operation(str));

        String str1 = "//*+2322^52";
        PrefixToInfix obj1 = new PrefixToInfix();
        System.out.println(obj1.operation(str1));
        
        
    }
}