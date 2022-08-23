package week3.assignments;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Student information");
	}

	public void getStudentInfo (int id) {
		System.out.println("StudentId: " + id);
	}
	
	public void getStudentInfo (int id, String name) {
		System.out.println("StudentId: " + id + " Name: " + name);
	}
	
	public void getStudentInfo (String email, String phNum) {
		System.out.println("Email Id: " + email + " Phone number: " + phNum);
	}

}
