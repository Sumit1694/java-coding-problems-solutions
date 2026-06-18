package Strings;

public class IndexOfFirstOccurance {

	static int firstOccuranceIndex(String str,String search)
	{
		int i=0;int j=0;
		int index = -1;

		while(i<str.length())
		{
			if(str.charAt(i)==search.charAt(j))
			{
		        if(j==0)
		        {
		        	index = i;
		        }

		        i++;
		        j++;

		        if(j==search.length())
		        {
		        	return index;
		        }
			}
			else
			{
				if(j>0)
				{
					i = index+1;
					j = 0;
					index = -1;
				}
				else
				{
					i++;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String str = "hello woworld";
		String search = "world";

		System.out.println(firstOccuranceIndex(str, search));
	}
}