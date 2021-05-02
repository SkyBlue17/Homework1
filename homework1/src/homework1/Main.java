package homework1;

public class Main {

	public static void main(String[] args) {
		//Student student1 = new Student(1,"Burak");
		
		
		
		Student student2 = new Student(2,"Hanife","Oktay","48","111");
		Instructor instructor1 = new Instructor(3, "Burak", "Güner", "30", "22548");
		
		User user = new User(1,"Tarık", "Tarık", "10");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.createCourse(instructor1);
		
		studentManager.enrollCourse(student2);
		
		UserManager userManager = new UserManager();
		userManager.Add(user);
		
		
		
		
		
		
		
		
				
		
		 

	}

}
