package Strings;

public class FirstCharCaps {

	public static void main(String[] args) {

		String str = "java";

		String firstCharCaps = str.substring(0, 1).toUpperCase()+str.substring(1);

		System.out.println(firstCharCaps);

	}

}
