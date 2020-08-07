
public class SolveExpressionPostfix {
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

    static void evaluation(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                int a = pop();
                int b = pop();
                if (c == '+')
                    result = b + a;
                else if (c == '-')
                    result = b - a;
                else if (c == '*')
                    result = b * a;
                else if (c == '/')
                    result = b / a;
                else if (c == '^')
                    result = b ^ a;

                push(result);
            } else {
                int x = Integer.parseInt(String.valueOf(c));;
                push(x);
            }
        }

    }

    public static void main(String[] args) {
        String postfix = "231*+9-";
        evaluation(postfix);
        int r = pop();
        System.out.println(r);
    }

}