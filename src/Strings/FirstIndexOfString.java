package Strings;
public class FirstIndexOfString
{
   static int firstIndex(String str, String target)
   {
      int i=0, j=0;
      int index = -1;

      while(i<str.length())
      {
         if(str.charAt(i) == target.charAt(j))
         {
            if(j==0)
            {
               index = i;
            }
           i++;
           j++;

           if(j==target.length())
           {
              return index;
           }
         }
         else
         {
            if(j>0)
            {
               i = index + 1;
               j = 0;
               index = -1;
            }
            else
            {
               i++;
            }
         }
      }
      return -1;
   }
   public static void main(String [] args)
   {
       String s = "woxworld";
       String t = "world";
       System.out.println(firstIndex(s, t));
   }
}