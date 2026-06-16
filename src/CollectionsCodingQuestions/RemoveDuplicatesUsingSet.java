package CollectionsCodingQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	static String rm(String str)
	{
		Set<Character> set = new LinkedHashSet<>();

		for(char ch:str.toCharArray())
		{
			set.add(ch);
		}

		StringBuilder sb = new StringBuilder();

		for(char c:set)
		{
			sb.append(c);
		}

	   return sb.toString();
	}

	public static void main(String[] args) {

		String str = "programming";
		System.out.println(rm(str));
	}

}
