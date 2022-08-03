package proje1;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Mustafa";
		instructor.lastName = "Köroğlu";
		instructor.telephoneNumber = "+121254063";
		instructor.branch = "Matematik";

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.record(instructor);

	}

}
