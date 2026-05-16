package Strings;

public class ReverseOnlyStrings {

	public static void main(String[] args) {

		String str = "123abc456xyz";
		String newString = "";

		for(int i=str.length()-1;i>=0;i--)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				newString += str.charAt(i);
			}
		}

		String rev = "";
		int index = 0;

		for(int i=0;i<str.length();i++)
		{
            if(Character.isAlphabetic(str.charAt(i)))
            {
            	rev += newString.charAt(index);
            	index++;
            }
            else
            {
            	rev += str.charAt(i);
            }
		}

		System.out.println(rev);

	}

}
