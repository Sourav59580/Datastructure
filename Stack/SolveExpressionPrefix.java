
public class SolveExpressionPrefix {
    static final int max = 100;
    static int top = -1;
    static int a[] = new int[max];

    // check empty stack
    boolean isEmpty() {
        return (top < 0);
    }
    // Push operation
    static boolean push(int data) {
        if (top > max) {
            System.out.println("Overflow");
            return false;
        } else {
            a[++top] = data;
            return true;
        }
    }
    // pop operation
    static int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    // Evalution
    static void evaluation(String str) {
        int result = 0;

        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                int a = pop();
                int b = pop();
                if (c == '+')
                    result = a + b;
                else if (c == '-')
                    result = a - b;
                else if (c == '*')
                    result = a * b;
                else if (c == '/')
                    result = a / b;
                else if (c == '^')
                    result = a ^ b;

                push(result);
            } else {
                int x = Integer.parseInt(String.valueOf(c));;
                push(x);
            }
        }

    }

    public static void main(String[] args) {
        String exp = "//*+2322^52";
        evaluation(exp);
        int r = pop();
        System.out.println(r);
        

    }

}