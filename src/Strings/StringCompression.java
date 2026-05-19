package Strings;

public class StringCompression {

	public static void main(String[] args) {

		String str = "aabbbcccc";
		int count = 1;
		StringBuilder compressed = new StringBuilder();

		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				compressed.append("").append(str.charAt(i)).append(count);
		        count = 1;
			}
		}

		compressed.append("").append(str.charAt(str.length()-1)).append(count);

		System.out.println(compressed.toString());

	}

}
