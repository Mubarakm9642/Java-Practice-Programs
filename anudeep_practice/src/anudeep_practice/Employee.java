package anudeep_practice;
//to string demo
public class Employee {

	    int empcode;
	    String name;
	    String city;

	    Employee(int empcode, String name, String city) {
	        this.empcode = empcode;
	        this.name = name;
	        this.city = city;
	    }
	    
	    @Override
		public String toString() {
			return "Employee [empcode=" + empcode + ", name=" + name + ", city=" + city + "]";
		}
	    
		public static void main(String args[]) {
	        Employee e1 = new Employee(303, "Mubarak", "Bangalore");
	        System.out.println(e1);
	    }
	}
