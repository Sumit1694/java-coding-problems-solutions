package Strings;

public class CountOccuranceOfSpecificCharacter {

	static int countOccurance(String str, char ch)
	{
		int count = 0;

		for(char c:str.toCharArray())
		{
			if(c==ch)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "swiss";
		char ch = 's';
		System.out.println(countOccurance(str, ch));

	}

}
