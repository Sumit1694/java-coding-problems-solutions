package Numbers;

public class MostlyEvenorOdd {

	static void mostlyEvenOrOddNum(int n)
	{
		int evenCount = 0;
		int oddCount = 0;

		String num = String.valueOf(n);

		for(int i=0;i<num.length();i++)
		{
			char ch = num.charAt(i);

			if((ch - '0')%2==0)
		 	{
		        evenCount++;
			}
			else
			{
				oddCount++;
			}
		}

		if(evenCount>oddCount)
		{
			System.out.println("Mostly Even.....");
		}
		else if(oddCount>evenCount)
		{
			System.out.println("Mostly Odd......");
		}
		else
		{
			System.out.println("Equal even and odd digits");
		}
	}

	public static void main(String[] args) {

		int num = 248913;
		mostlyEvenOrOddNum(num);

	}

}
