package anudeep_practice;

// base class Doctor 
class Doctor{
	String name;
	int experience;
	
	// Constructor for Doctor class
	public Doctor(String name,int experience) {
		this.name=name;
		this.experience=experience;
	}
	// Method display to display information
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("years of experience: "+experience);
	}
}

// Derived class Surgeon extends Doctor (Multilevel Inheritance)
class Surgeon extends Doctor{
	String speciality;

	public Surgeon(String name, int experience,String speciality) {
		// Calling the constructor of the base class using super keyword
		super(name, experience);
		this.speciality = speciality;
		
	}
	// Override the display() method
	@Override
	public void display() {
		super.display();
		System.out.println("Speciality: " + speciality);
	}
	
}

// Derived class Nurse extends Doctor (Hierarchical Inheritance)
class Nurse extends Doctor{
	String department;

	public Nurse(String name, int experience,String department) {
		// Calling the constructor of the base class using super keyword
		super(name, experience);
		// TODO Auto-generated constructor stub
		this.department=department;
	}
	// Override the display() method
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Department: " + department);
	}
	
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		 // Creating objects of the classes with values
		Doctor doctor = new Doctor("Dr. Badri", 10);
        Surgeon surgeon = new Surgeon("Dr. Teja", 15, "Cardiology");
        Nurse nurse = new Nurse("Shiba", 5, "Neurology");
        
        System.out.println("Doctor:");
        doctor.display();// Call the displayInfo() method of the Doctor class
        System.out.println();

        System.out.println("Surgeon:");
        surgeon.display();// Call the displayInfo() method of the Surgeon class
        System.out.println();

        System.out.println("Nurse:");
        nurse.display();// Call the displayInfo() method of the Nurse class
		

	}

}
