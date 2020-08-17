
public class Postfix {
    static final int max = 100;
    static int top = -1;
    static char ch[] = new char[max];

    static String postfix = "";

    // push operation
    static boolean push(char c) {
        if (top > max) {
            System.out.println("Overflow");
            return false;
        } else {
            ch[++top] = c;
            return true;
        }
    }

    // pop operation
    static boolean pop(char c) {
        if (c == ')') {
            while (ch[top] != '(') {
                char x = ch[top--];
                postfix = postfix + x;
            }
            if(ch[top]=='(')
            top = top-1;
            // System.out.println(x);
            return true;
        } else if (c == '+') {
            if (ch[top] == '/' || ch[top] == '*') {
                char x = ch[top--];
                postfix = postfix + x;
                push(c);
            } else if (ch[top] == '^') {
                while (ch[top] != '(') {
                    char x = ch[top--];
                    postfix = postfix + x;
                }
                push(c);

            } else {
                push(c);
            }
            return true;
        } else if (c == '-') {
            if (ch[top] == '/' || ch[top] == '*') {
                char x = ch[top--];
                postfix = postfix + x;
                push(c);
            } else if (ch[top] == '^') {
                while (ch[top] != '(') {
                    char x = ch[top--];
                    postfix = postfix + x;
                }
                push(c);

            } else {
                push(c);
            }
            return true;
        } else if (c == '/') {
            if (ch[top] == '*') {
                char x = ch[top--];
                postfix = postfix + x;
                push(c);
            } else if (ch[top] == '^') {
                while (ch[top] != '(') {
                    char x = ch[top--];
                    postfix = postfix + x;
                }
                push(c);

            } else {
                push(c);
            }
            return true;
        } else if (c == '*') {
            if (ch[top] == '/') {
                char x = ch[top--];
                postfix = postfix + x;
                push(c);
            } else if (ch[top] == '^') {
                while (ch[top] != '(') {
                    char x = ch[top--];
                    postfix = postfix + x;
                }
                push(c);
            } else {
                push(c);
            }
            return true;
        }

        return true;
    }

    public static String operation(String str) {
        String s = "("+str;
        s = s + ")";
         //System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                postfix = postfix + c;
            } else {
                switch (c) {
                    case '(':
                        push(c);
                        break;
                    case ')':
                        pop(c);
                        break;
                    case '+':
                        pop(c);
                        break;
                    case '-':
                        pop(c);
                        break;
                    case '/':
                        pop(c);
                        break;
                    case '*':
                        pop(c);
                        break;
                    case '^':
                        push(c);
                        break;
                }
            }
        }

        return postfix;
    }

    public static void main(String[] args) {

        String str = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixString = operation(str);
        System.out.println(postfixString);

        // while(ch[top]!=-1){
        //     System.out.println(ch[top]+" ");
        //     top--;
        // }

    }

}