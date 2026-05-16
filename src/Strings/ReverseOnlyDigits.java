package Strings;

public class ReverseOnlyDigits {

	public static void main(String[] args) {

		String str = "a12b34c56";
        String onlyNumbers = "";

        for(int i=str.length()-1;i>=0;i--)
        {
        	if(Character.isDigit(str.charAt(i)))
        	{
        		onlyNumbers += str.charAt(i);
        	}
        }

        int index = 0;
        String rev = "";

        for(int i=0;i<str.length();i++)
        {
        	if(Character.isDigit(str.charAt(i)))
        	{
        		rev += onlyNumbers.charAt(index);
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