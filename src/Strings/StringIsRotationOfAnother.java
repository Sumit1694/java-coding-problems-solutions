package Strings;

public class StringIsRotationOfAnother {

	static String rotateOne(String str)
	{
		char [] arr = str.toCharArray();

		char firstChar = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}

		arr[arr.length-1] = firstChar;

		return new String(arr);
	}

	static boolean isRotation(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}

		String rotated = str1;

		for(int i=0;i<str1.length();i++)
		{
			rotated = rotateOne(rotated);

			if(str2.equals(rotated))
			{
				return true;
			}
		}
		return false;
	}

	static boolean isRotation1(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}

		str1 = str1 + str2;

		return str1.contains(str2);
	}

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "cdab";
		System.out.println(isRotation(str1, str2));
		System.out.println(isRotation1(str1, str2));


	}
}