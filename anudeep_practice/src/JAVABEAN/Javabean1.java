package JAVABEAN;

public class Javabean1 implements java.io.Serializable {

	//member variables as private 
	private String name;
	private int rollno;
	private String course;
	
	public Javabean1() {
		
	}
	
	//setter method to set the value
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	//getter method to use the value
	public String getName(){
		return name;
	}
	public int getRollno(){
		return rollno;
	}
	public String getCourse(){
		return course;
	}

}