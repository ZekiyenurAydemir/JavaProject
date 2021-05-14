package ucuncuHaftaOdev2;


public class Main {

	public static void main(String[] args) {
				
		UserManager user=new UserManager();
		user.add("Kullanıcı eklendi");
		user.update("Kullanıcı güncellendi");
		user.delete("Kullanıcı silindi");
		
		System.out.println("--------------");
		
		UserManager user1=new StudentManager();
		user1.add("Kullanıcı eklendi");
		user1.update("Kullanıcı güncellendi");
		user1.delete("Kullanıcı silindi");
		
		System.out.println("--------------");
		
		UserManager user2=new InstructorManager();
		user2.add("Kullanıcı eklendi");
		user2.update("Kullanıcı güncellendi");
		user2.delete("Kullanıcı silindi");
	}

}
