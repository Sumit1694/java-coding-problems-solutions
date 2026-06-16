package Strings;
public class SmallestWindowContainingAllChars
{
   static String window(String str1, String str2)
   { 
      String smallest = "";

      for(int i=0;i<str1.length();i++)
      {
         for(int j=i;j<str1.length();j++)
         {
            String sub = str1.substring(i, j+1);

            boolean found = true;

            for(int k=0;k<str2.length();k++) 
            {
               if(!sub.contains(String.valueOf(str2.charAt(k))))
               {
                   found = false;
                   break; 
               } 
            }  

            if(found)
            {
               if(smallest.equals("") || sub.length()<smallest.length())
               {
                   smallest = sub;
               } 
            } 
         }
      }
     return smallest; 
   } 
   public static void main(String [] args)
   {
       String str1 = "ADOBECODEBANC";
       String str2 = "ABC";
       System.out.println(window(str1, str2));
   }
}