package demoImport;
import JAVABEAN.Student;
public class ImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("importing class");
		Student s=new Student();
		System.out.println("Student Id : "+s.getId());
		System.out.println("Student name : "+s.getName());
		System.out.println("Student active : "+s.isActive());
		
	}

}
