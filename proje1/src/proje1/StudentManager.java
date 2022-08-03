package proje1;

public class StudentManager extends UserManager {
	public void situation(Student student) {
		if (student.getPoint() >= 50) {
			System.out.println("Tebrikler geçtiniz. Puanınız: " + student.getPoint());
		} else {
			System.out.println("Malesef kaldınız. Puanınız: " + student.getPoint());
		}

	}

}
