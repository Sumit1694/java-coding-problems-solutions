package Strings;

public class SecondLagrstNumber {

	static int secondlargest(String str)
	{
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		StringBuilder num = new StringBuilder();

		for(char ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				num.append(ch);
			}
			else
			{
               if(num.length()>0)
               {
            	   int n = Integer.parseInt(num.toString());

            	   if(n>largest)
            	   {
            		   secondLargest = largest;
            		   largest = n;
            	   }
            	   else if(n>secondLargest && n!=largest)
            	   {
            		   secondLargest = n;
            	   }
            	   num.setLength(0);
               }
			}
		}

		if(num.length()>0)
        {
     	   int n = Integer.parseInt(num.toString());

     	   if(n>largest)
     	   {
     		   secondLargest = largest;
     		   largest = n;
     	   }
     	   else if(n>secondLargest && n!=largest)
     	   {
     		   secondLargest = n;
     	   }
     	   num.setLength(0);
        }
     return secondLargest;
	}

	public static void main(String[] args) {

		String str = "ab12cd340e5f99";
		System.out.println(secondlargest(str));

	}

}
