package Recursion;

public class RecursionSubsequence {

	static void gss(String str, String res)
	{
		if(str.length()==0)
		{
			System.out.println(res);
			return;
		}

		gss(str.substring(1), res+str.charAt(0));
		gss(str.substring(1), res);
	}

	public static void main(String[] args) {

		gss("ABC", "");

	}

}
