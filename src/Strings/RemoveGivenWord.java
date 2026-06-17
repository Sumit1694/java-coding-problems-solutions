package Strings;

public class RemoveGivenWord {

	static String rmWord(String str, String word)
	{
	    String words [] = str.split(" ");
	    StringBuilder sb = new StringBuilder();

	    for(String w:words)
	    {
	    	if(!w.equals(word))
	    	{
	    		sb.append(w).append(" ");
	    	}
	    }

	    return sb.toString();
	}

	public static void main(String[] args) {

		String str = "java is very easy java";
		String word = "java";
		System.out.println(rmWord(str, word));
	}
}