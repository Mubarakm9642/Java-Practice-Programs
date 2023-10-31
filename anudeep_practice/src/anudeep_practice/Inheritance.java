package anudeep_practice;
class college{
	int empId=123;
	String empName="umar";
}
class Department extends college{
	String DepName="Ec&E";
	void display(){
		System.out.println("employee ID is: "+empId+"\nEmployee Name is: "+empName+"\nDepartment Name is: "+DepName);
		//System.out.println(empName);
		//System.out.println(DepName);
		empId=456;
		empName="Asad";
		DepName="CS&E";
		System.out.println("After override employee ID is: "+empId+"\nEmployee Name is: "+empName+"\nDepartment Name is: "+DepName);
		/*System.out.println(empId);
		System.out.println(empName);
		System.out.println(DepName);*/
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department D=new Department();
		D.display();

	}

}
