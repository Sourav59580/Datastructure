class Postfun
{
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
                // char x = ch[top--];
                // postfix = postfix + x;
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
                // char x = ch[top--];
                // postfix = postfix + x;
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


   public String opration(String str){
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

}




public class Prefix {
public static void main(String[] args) {
    String exp = "(a+b)/c*d-(e+f)^g-h";
    String str = "";
    for(int i = exp.length()-1;i>=0;i--){
        if(exp.charAt(i)=='(')
        str+=")";
        else if(exp.charAt(i)==')')
        str+="(";
        else{
            str+=exp.charAt(i);
        }
    }
    System.out.println(str);
    Postfun post = new Postfun();
    String result = post.opration(str);
    StringBuilder st = new StringBuilder(result);

    System.out.println(st.reverse());
}
}