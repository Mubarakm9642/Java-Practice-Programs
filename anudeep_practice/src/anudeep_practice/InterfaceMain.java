package anudeep_practice;
//Person
public interface Person {
 public void speak();
}

//Student 
class Student implements Person {
 @Override
 public void speak() {
     System.out.println("I am a student.");
 }
}

//Teacher
public class Teacher implements Person {
@Override
public void speak() {
   System.out.println("I am a teacher.");
}
}

//Main
public class InterfaceMain {
	public static void main(String[] args) {
	     Person student = new Student();
	     Person teacher = new Teacher();

	     student.speak(); // Output: "I am a student."
	     teacher.speak(); // Output: "I am a teacher."
	 }

}
