
public class course implements Cloneable
{
	private String courseName;
	private String[] students = new String [100];
	private int numberOfStudents,i;
	
	public course(String courseName)
	{
		this.courseName = courseName;
	}
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents()
	{
		return students;
	}
	public int getNumbersOfStudent() 
	{
		return numberOfStudents;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void dropStudent(String student)
	{
		for ( i = 0; i < students.length; i++) {

            if (student.equalsIgnoreCase(students[i])) {

                students[i] = null; // sets dropped student's value to null
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
	}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
