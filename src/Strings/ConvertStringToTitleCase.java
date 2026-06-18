package Strings;

public class ConvertStringToTitleCase {

	static String converStringToTitleCase(String str)
	{
		String [] words = str.split(" ");
		String titleCase = "";

	    for(int i=0;i<words.length;i++)
	    {
		    titleCase += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) +" ";
	    }
	    return titleCase;
	}

	public static void main(String[] args) {

		String str = "java automation testing";
		System.out.println(converStringToTitleCase(str));

	}
}