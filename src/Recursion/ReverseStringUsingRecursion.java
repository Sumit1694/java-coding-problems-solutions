package Recursion;

public class ReverseStringUsingRecursion {

	static String reverse(String str, String res, int i)
	{
		if(i<0)
		{
			return res;
		}

		return reverse(str, res+str.charAt(i), i-1);
	}

	public static void main(String[] args) {

		String str = "sumit";
		System.out.println(reverse(str, "", str.length()-1));

	}

}
