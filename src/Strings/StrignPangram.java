package Strings;

public class StrignPangram {

	static boolean isPangram1(String str)
	{
		boolean [] visited = new boolean[26];
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = Character.toLowerCase(str.charAt(i));

			if(ch>='a' && ch<='z')
			{
				int index = ch - 'a';

				if(!visited[index])
				{
					visited[index] = true;
					count++;
				}
			}
		}
		return count==26;
	}

	static boolean isPangram(String str)
	{
		int [] freq = new int[26];

		for(int i=0;i<str.length();i++)
		{
			char ch = Character.toLowerCase(str.charAt(i));

			if(ch>='a' && ch<='z')
			{
				freq[ch - 'a']++;
			}
		}

		for(int count:freq)
		{
			if(count==0)
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
        System.out.println(isPangram(str));
	}
}