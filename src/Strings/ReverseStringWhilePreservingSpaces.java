package Strings;

public class ReverseStringWhilePreservingSpaces {

	public static void main(String[] args) {

		String str = "i am boy";
		String noSpace = str.replaceAll(" ", "");
		String rev = "";
		for(int i=noSpace.length()-1;i>=0;i--)
		{
			rev += noSpace.charAt(i);
		}

		String result = "";
		int index = 0;

		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)==' ')
			{
				result += " ";
			}
			else
			{
				result += rev.charAt(index);
				index++;
			}
		}

		System.out.println(result);
	}

}
