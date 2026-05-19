package Constructors;

class Student
{
	int studentId;
	String studentName;
	String grade;

	public Student()
	{
		this(0, "Unknown", "None");
	}

	public Student(int studentId, String studentName, String grade)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
}

public class Chaining {

	public static void main(String[] args) {

		Student student1 = new Student();
		System.out.println("Student1 ID: " + student1.studentId);
		System.out.println("Student1 Name: " + student1.studentName);
		System.out.println("Student1 Grade: " + student1.grade);

		Student student2 = new Student(101, "Cullen", "A");
		System.out.println("Student2 ID: " + student2.studentId);
		System.out.println("Student2 Name: " + student2.studentName);
		System.out.println("Student2 Grade: " + student2.grade);

	}

}
