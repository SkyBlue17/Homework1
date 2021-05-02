package homework1;

public class Student extends User {
	
	private String studentNumber;

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student(int id, String firstName, String lastName, String age, String studentNumber) {
		super(id, firstName, lastName, age);
		this.studentNumber = studentNumber;
	}
	
	

	
	
}
