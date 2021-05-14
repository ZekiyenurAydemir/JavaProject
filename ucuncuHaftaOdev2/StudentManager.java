package ucuncuHaftaOdev2;

public class StudentManager extends UserManager {
	public void add(String message) {
		System.out.println("Student Eklendi :" + message);
	}

	public void update(String message) {
		System.out.println("Student Güncellendi :" + message);
	}

	public void delete(String message) {
		System.out.println("Student Silindi :" + message);
	}
} 
