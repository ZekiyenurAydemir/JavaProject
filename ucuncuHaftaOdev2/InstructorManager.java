package ucuncuHaftaOdev2;

public class InstructorManager extends UserManager {
	public void add(String message) {
		System.out.println("Instructor Eklendi :" + message);
	}

	public void update(String message) {
		System.out.println("Instructor Güncellendi :" + message);
	}

	public void delete(String message) {
		System.out.println("Instructor Silindi :" + message);
	}
	

}
