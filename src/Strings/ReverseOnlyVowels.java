package Strings;

public class ReverseOnlyVowels {

	public static void main(String[] args) {

		String str = "automation";
		//System.out.println(reverseOnlyVowels1(str));
		System.out.println(reverseOnlyVowels2(str));
	}

	static String reverseOnlyVowels2(String str)
	{
		char [] arr = str.toCharArray();
		int l=0,h=arr.length-1;

		while(l<h)
		{
			if(!isVowel(arr[l]))
			{
				l++;
			}
			else if(!isVowel(arr[h]))
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

	static String reverseOnlyVowels1(String str)
	{
		String onlyRevVowels = "";

		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(isVowel(ch))
			{
				onlyRevVowels += ch;
			}
		}

		StringBuilder rev = new StringBuilder();
		int index = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(isVowel(ch))
			{
				rev.append(onlyRevVowels.charAt(index));
				index++;
			}
			else
			{
				rev.append(ch);
			}
		}

		return rev.toString();
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}
}
