package Strings;

public class FrequencyOfEachVowel {

	static void frequency(String str)
	{
		char [] arr = str.toLowerCase().toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			char ch = arr[i];

			if(!isVowel(ch))
			{
				continue;
			}

            boolean isDuplicate = false;

			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isDuplicate = true;
					break;
				}
			}

			if(isDuplicate)
			{
				continue;
			}

			int count = 0;

			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==ch)
				{
					count++;
				}
			}

			System.out.println(ch +" -> " + count);
		}
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "education";
		frequency(str);

	}

}
