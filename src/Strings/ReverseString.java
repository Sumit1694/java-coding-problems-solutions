package Strings;

public class ReverseString {

	static String reverseString1(String str)
	{
		String rev = "";

		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	static String reverseString2(String str)
	{
		StringBuilder sb = new StringBuilder();

		return sb.append(str).reverse().toString();
	}

	static String reverseString3(String str)
	{
		char [] arr = str.toCharArray();
		int l=0,h=arr.length-1;

		while(l<h)
		{
			char temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
		return new String(arr);
	}

	public static void main(String[] args) {

		String str = "sumit rane";
		System.out.println(reverseString1(str));
		System.out.println(reverseString2(str));
		System.out.println(reverseString3(str));
	}
}