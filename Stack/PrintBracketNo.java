import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintBracketNo {
    static void operation(String str)
    {
        Stack<Integer> s = new Stack<Integer>();
        int bcno = 0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c=='(')
            {
                bcno+=1;
                s.push(bcno);
                System.out.print(bcno+" ");
            }
            else if(c==')')
            {
                System.out.print(s.pop()+" ");
            }
        }
        System.out.println();
        
    }
    
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    String exp = sc.next();
		    operation(exp);
		    t--;
		}
	}

}