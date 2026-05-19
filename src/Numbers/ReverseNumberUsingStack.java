package Numbers;

import java.util.Stack;

public class ReverseNumberUsingStack {

	static int reverse(int n)
	{
		Stack<Character> stack = new Stack<>();

       String str = String.valueOf(n);

       for(int i=0;i<str.length();i++)
       {
    	   stack.push(str.charAt(i));
       }

       int rev = 0;

       while(!stack.isEmpty())
       {
    	   rev = rev * 10 + (stack.pop() - '0');
       }

       return rev;

	}

	public static void main(String[] args) {

		int n = 12345;
        System.out.println(reverse(n));
	}
}