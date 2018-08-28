
public class main 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		course course1 = new course("Algorithm");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Amy Pond");
		System.out.println("Number of students in course1:" + course1.getNumbersOfStudent());
		String[] students = course1.getStudents();
		for(int i = 0; i< course1.getNumbersOfStudent();i++)
		{
			System.out.print(students[i] + "");
		}
		course1.dropStudent("Kim Smith");
		System.out.println("Number of students in course1:" + course1.getNumbersOfStudent());
		for(int i = 0; i< course1.getNumbersOfStudent();i++)
		{
			System.out.print(students[i] + "");
		}
		course course2 = (course) course1.clone();		
		System.out.println("Number of students in course2:" + course2.getNumbersOfStudent());
	}

}
