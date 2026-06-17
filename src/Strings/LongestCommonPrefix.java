package Strings;
public class LongestCommonPrefix
{
	static String longestCPrefix(String [] arr)
	{
		String prefix = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			while(arr[i].indexOf(prefix)!=0)
			{
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}

	static String longestCommonPref(String [] arr)
	{
		String prefix = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			while(!arr[i].startsWith(prefix))
			{
				prefix = prefix.substring(0, prefix.length()-1);

				if(prefix.isEmpty())
				{
					return "";
				}
			}
		}

		return prefix;
	}

	public static void main(String [] args)
	{
		String [] arr = {"flower","flow","flight"};
		String s = longestCommonPref(arr);
        System.out.println(s);
	}
}