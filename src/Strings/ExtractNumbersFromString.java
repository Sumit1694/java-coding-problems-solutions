package Strings;

public class ExtractNumbersFromString {

	static void extractNumbers(String str)
	{
		String num = "";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				num = num + ch;
			}
			else
			{
				if(!num.isEmpty())
				{
					System.out.println(num);
					num = "";
				}
			}
		}

		if(!num.isEmpty())
		{
			System.out.println(num);
		}
	}

	static void extract(String str)
	{
		StringBuilder sb = new StringBuilder();

		for(char ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				sb.append(ch);
			}
			else
			{
				if(sb.length()>0)
				{
					System.out.println(sb);
					sb.setLength(0);
				}
			}
		}

		if(sb.length()>0)
		{
			System.out.println(sb);
		}
	}

	public static void main(String[] args) {

		String str = "ab12cd34e5";
		extractNumbers(str);
		extract(str);
	}

}
