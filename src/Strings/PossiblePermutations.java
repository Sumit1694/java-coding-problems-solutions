package Strings;

public class PossiblePermutations {

	static void permutationsOfThree(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				for(int k=0;k<str.length();k++)
				{
					if(i!=j && j!=k && i!=k)
					{
						System.out.println("" + str.charAt(i) + str.charAt(j)+str.charAt(k));
					}
				}
			}
		}
	}

	static void permutationsOfFour(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				for(int k=0;k<str.length();k++)
				{
					for(int l=0;l<str.length();l++)
					{
						if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
						{
							System.out.println("" + str.charAt(i) + str.charAt(j)+str.charAt(k) + str.charAt(l));
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "ABCD";
		permutationsOfThree(str1);
		permutationsOfFour(str2);
	}

}
