package Strings;

public class SmallestWindow {

	static boolean containsAll(String sub, String pattern)
	   {
	       for(int i=0;i<pattern.length();i++)
	       {
	          char ch = pattern.charAt(i);

	          if(sub.indexOf(ch)==-1)
	          {
	             return false;
	          }
	       }
	     return true;
	   }

	   static String smallestWindow(String str, String pattern)
	   {
	       String result = "";

	       int minLength = Integer.MAX_VALUE;

	       for(int i=0;i<str.length();i++)
	       {
	          for(int j=i+1;j<=str.length();j++)
	          {
	             String sub = str.substring(i, j);

	             if(containsAll(sub, pattern))
	             {
	                if(sub.length()<minLength)
	                {
	                   minLength = sub.length();
	                   result = sub;
	                }
	             }
	          }
	       }
	      return result;
	   }
	   public static void main(String [] args)
	   {
	      String str = "ADOBECODEBANC";
	      String pattern = "ABC";
	      System.out.println(smallestWindow(str, pattern));
	   }


}
