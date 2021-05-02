package homework1;

public class Instructor extends User {
	
	private String instructorNumber;
	
	public Instructor(int id, String firstName, String lastName, String age, String instructorNumber) {
		super(id,firstName,lastName,age);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	
	

}
