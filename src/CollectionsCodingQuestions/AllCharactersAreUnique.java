package CollectionsCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class AllCharactersAreUnique {

	static boolean allUnique(String str)
	{
		Set<Character> set = new HashSet<>();
		
		for(char ch:str.toCharArray())
		{
			if(!set.add(ch))
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean allUnique1(String str)
	{
		Set<Character> set = new HashSet<>();
		
		for(char ch:str.toCharArray())
		{
			set.add(ch);
		}
		return set.size()==str.length();
	}
	
	public static void main(String[] args) {
		
		String str = "abcde";
		System.out.println(allUnique(str));
		System.out.println(allUnique1(str));
	}
	
}
