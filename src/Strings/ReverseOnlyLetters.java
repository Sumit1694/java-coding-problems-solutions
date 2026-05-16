package Strings;

public class ReverseOnlyLetters {

	static String reverse(String str)
	{
		char [] arr = str.toCharArray();
		int l=0,h=arr.length-1;

		while(l<=h)
		{
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(arr[h]))
			{
				h--;
			}
			else
			{
				char ch = arr[l];
				arr[l] = arr[h];
				arr[h] = ch;
				l++;
				h--;
			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {

		String str = "a1b@c2d#";
		System.out.println(reverse(str));
	}
}