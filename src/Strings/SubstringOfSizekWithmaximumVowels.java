package Strings;

public class SubstringOfSizekWithmaximumVowels {

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	static void findSubstring(String str, int k)
	{
		int maxCount = 0;
		String result = "";

		for(int i=0;i<=str.length()-k;i++)
		{
			int count = 0;

			for(int j=i;j<i+k;j++)
			{
				if(isVowel(str.charAt(j)))
				{
					count++;
				}
			}

			if(count>maxCount)
			{
				maxCount = count;
				result = str.substring(i, i+k);
			}
		}

		System.out.println(result);
		System.out.println("Vowel count = " + maxCount);
	}

	public static void main(String[] args) {

		String str = "automationtesting";
		int k = 5;
		findSubstring(str, k);
	}
}