package Strings;

public class UpperToLowerAndLowerToUpper {

	static String UpperToLower(String str)
	{
		StringBuffer res = new StringBuffer();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isUpperCase(ch))
			{
				res.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch))
			{
				res.append(Character.toUpperCase(ch));
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {

		String str = "aAbB";
		System.out.println(UpperToLower(str));

	}
}