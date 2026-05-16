package Strings;

public class StringRearrange {

	static String rearrange(String str)
	{
		int count = 0;
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch=='o')
			{
				count++;

				for(int j=0;j<count;j++)
				{
                    sb.append("$");
				}
			}
			else
			{
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "tomorrow";
		System.out.println(rearrange(str));
	}
}