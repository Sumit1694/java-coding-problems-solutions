package Strings;

public class LongestConsecutiveVowelsSequence {

	static int longestSequence(String str)
	{
		char [] arr = str.toCharArray();
        int i=0;
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        while(i<arr.length)
        {
        	if(isVowel(arr[i]))
        	{
                 count++;
        	}
        	else
        	{
        		count = 0;
        	}

        	if(count>maxCount)
        	{
        		maxCount = count;
        	}
        	i++;
        }
        return maxCount;
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "beaauutiful";
		System.out.println(longestSequence(str));
	}
}