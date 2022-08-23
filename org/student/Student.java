package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Divya Bharathi");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("6261124");
		
	}
	public static void main(String[] args) {
		
      Student call = new Student();
       call.collegeName();
       call.collegeCode();
       call.collegeRank();
       call.deptName();
       call.studentName();
       call.studentDept();
       call.studentId();    
	}
}
