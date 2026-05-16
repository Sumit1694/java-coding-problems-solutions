package Strings;

public class AllVowelsFromString {

	static void printAllVowels(String str)
	{
		for(char ch:str.toCharArray())
		{
			if("aeiouAEIOU".indexOf(ch)!=-1)
			{
				System.out.print(ch + " ");
			}
		}
	}

	public static void main(String[] args) {

		String str = "Automation";
		printAllVowels(str);

	}

}
