package Strings;

import java.util.ArrayList;
import java.util.List;

public class MakeLists {

	public static void main(String[] args) {

		String [] arr = {"Bob","ron","ram","sent"};

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();

        for(String word:arr)
        {
        	if(word.charAt(0)=='B')
        	{
        		list1.add(word);
        	}
        	else if(word.charAt(0)=='r')
        	{
        		list2.add(word);
        	}
        	else
        	{
        		list3.add(word);
        	}
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
	}
}