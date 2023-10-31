package String;
import java.util.*;
import java.lang.*;
import java.io.*;

// The class represents students
class Student
{
	int rollno;
	String name, address;
	
// Constructor
	public Student(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
// Prints student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name +
				" " + this.address;
	}
}

class Sortbyroll implements Comparator<Student>
{
// For ascending order roll number sort
	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] arr = {new Student(100, "B", "kolkata"),
				new Student(120, "A", "delhi"),
				new Student(120, "C", "mumbai")};
		System.out.println("Unsorted");
		for (int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		Arrays.sort(arr, new Sortbyroll());
		System.out.println("\nSorted by rollno");
		for (int i=0; i<arr.length; i++)
		System.out.println(arr[i]);

	}

}
