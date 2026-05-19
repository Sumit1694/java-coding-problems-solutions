package Constructors;

import java.util.Arrays;

class Classroom
{
	String className;
	String [] students;

	public Classroom(String className, String[] students)
	{
		this.className = className;
		this.students = students;
	}
}

public class ConstructorWithArray {

	public static void main(String[] args) {

		String [] students = {"Angelina", "Adriana", "Lisa"};

		Classroom c = new Classroom("Science", students);
		System.out.println(c.className);
		System.out.println(Arrays.toString(c.students));

	}

}
