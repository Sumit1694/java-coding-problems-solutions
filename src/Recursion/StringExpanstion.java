package Recursion;

public class StringExpanstion {

	static void expand(String str,int index)
	{
		if(index>=str.length())
		{
			return;
		}

		char ch = str.charAt(index);

		int count = str.charAt(index+1)-'0';

		while(count>0)
		{
			System.out.print(ch);
			count--;
		}

		expand(str, index+2);
	}

	public static void main(String[] args) {

		String str = "a2b3c4";
		expand(str, 0);
	}
}