package Strings;

public class CheckIfStringContainsOnlyAlphabets {

	static boolean areOnlyAlphbets(String str)
	{
		for(char ch:str.toCharArray())
		{
			if(!Character.isAlphabetic(ch))
			{
				return false;
			}
		}
		return true;
	}

	static boolean areOnlyAlphbets1(String str)
	{
		for(char ch:str.toCharArray())
		{
			char c = Character.toLowerCase(ch);

			if(c<'a' && c>'z')
			{
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {

		String str = "JavaAutomation";
		System.out.println(areOnlyAlphbets(str));
		System.out.println(areOnlyAlphbets1(str));
	}
}