package anudeep_practice;
//abstract class vahicle
abstract class vahicle{
	public abstract void startEngine();//abstract method for startEngine
	public abstract void stopEngine();//abstract method for stopEngine
	
}
class Car extends vahicle{ //subclass for vahicle
	//override
	public void startEngine() {
		System.out.println("car engine started");
	}
	//override
	public void stopEngine() {
		System.out.println("car engine stopped");
	}
}
// main class
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c = new Car(); // object creating
		//calling methods using object
		c.startEngine();
		c.stopEngine();
		

	}

}
