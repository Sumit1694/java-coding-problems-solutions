package Strings;

public class StringReplaceSecondO {

	static String replace(String str)
	{
		StringBuilder rep = new StringBuilder();
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
	       char ch = str.charAt(i);

	       if(ch=='o')
	       {
	    	   count++;

	    	   if(count==2)
	    	   {
	    		   rep.append("*");
	    	   }
	    	   else
	    	   {
	    		   rep.append(ch);
	    	   }
	       }
	       else
	       {
	    	   rep.append(ch);
	       }
		}

		return rep.toString();
	}

	public static void main(String[] args) {

		String str = "tomorrow";
		System.out.println(replace(str));
	}
}