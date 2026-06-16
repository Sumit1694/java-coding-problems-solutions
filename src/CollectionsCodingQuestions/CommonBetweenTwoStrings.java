package CollectionsCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class CommonBetweenTwoStrings {

	static void common(String str1, String str2)
	{
		Set<Character> set = new HashSet<>();

		for(char ch:str1.toCharArray())
		{
			set.add(ch);
		}

		for(char ch:str2.toCharArray())
		{
			if(set.contains(ch))
			{
				System.out.print(ch +" ");
			}
		}
	}

	static Set<Character> common1(String str1, String str2)
	{
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		for(char ch:str1.toCharArray())
		{
			set1.add(ch);
		}

		for(char ch:str2.toCharArray())
		{
			set2.add(ch);
		}

		set1.retainAll(set2);

		return set1;
	}



	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "bcxy";
		common(str1, str2);
		System.out.println(common1(str1, str2));
	}

}
