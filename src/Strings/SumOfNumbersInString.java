package Strings;

public class SumOfNumbersInString {

	static int sum(String str)
	{
		int sum = 0;
		StringBuilder num = new StringBuilder();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				num.append(ch);
			}
			else
			{
				if(!num.isEmpty())
				{
					sum += Integer.parseInt(num.toString());
					num.setLength(0);
				}
			}
		}

		if(!num.isEmpty())
		{
			sum += Integer.parseInt(num.toString());
		}
		return sum;
	}

	public static void main(String[] args) {

		String str = "ab12cd34e5";
		System.out.println(sum(str));

	}

}
