package Strings;

import java.util.HashMap;
import java.util.Map;

public class WordsAppearingExactlyTwice {

	public static void main(String[] args) {

		String str = "java selenium api java test selenium api rest";
		String [] words = str.split(" ");

		Map<String,Integer> map = new HashMap<>();

		for(String word:words)
		{
           map.put(word, map.getOrDefault(word, 0)+1);
		}

        for(Map.Entry<String, Integer>entry:map.entrySet())
        {
        	if(entry.getValue()>1)
        	{
        		System.out.print(entry.getKey()+", ");
        	}
        }
	}
}