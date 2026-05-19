package NestedClasses;

public class University {

	class Department
	{
		String departmentName;
		int facultyCount;

		public Department(String departmentName, int facultyCount)
		{
			this.departmentName = departmentName;
			this.facultyCount = facultyCount;
		}

		void displayInfo()
		{
			System.out.println("Department Name: " + departmentName);
			System.out.println("No of faculty members: " + facultyCount);
		}
	}

	public static void main(String[] args) {

		University uni = new University();

       University.Department comp = uni.new Department("Computer", 50);
       comp.displayInfo();
	}
}