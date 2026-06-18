package Strings;

import java.util.Stack;

public class RemoveAdacentDuplicates {

	static String rm(String str)
	{
		Stack<Character> stack = new Stack<>();

		for(char ch:str.toCharArray())
		{
			if(!stack.isEmpty() && stack.peek()==ch)
			{
				stack.pop();
			}
			else
			{
				stack.push(ch);
			}
		}

		StringBuilder sb = new StringBuilder();

		for(char ch:stack)
		{
			sb.append(ch);
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "abbaca";

	}

}
