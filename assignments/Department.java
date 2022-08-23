package week3.assignments;

public class Department extends Students {
 
	public void getStudentInfo (int id, String name) {
		super.getStudentInfo();
		System.out.println("StudentId: " + id + " Name: " + name);
	}
	
	public static void main(String[] args) {
		
		Department overriding = new Department();
		
		overriding.getStudentInfo(24, "Divya");
	}

}
