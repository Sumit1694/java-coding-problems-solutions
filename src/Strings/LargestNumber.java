package Strings;

public class LargestNumber {

	static int largestFormed(String str)
	{
		String largest = "";
		StringBuilder num = new StringBuilder();

		for(char ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				num.append(ch);
			}
			else
			{
               if(!num.isEmpty())
               {
            	   if(largest.length()<num.length())
            	   {
            		   largest = num.toString();
            	   }
            	   num.setLength(0);
               }
			}
		}

		if(!num.isEmpty())
		{
			if(largest.length()<num.length())
			{
				largest = num.toString();
			}
		}
		return Integer.parseInt(largest);
	}

	public static void main(String[] args) {

		String str = "ab12cd340e5";
		System.out.println(largestFormed(str));

	}

}
