package demoImport;

class Lion{
	void animal() {
		System.out.println("This is Lion");
	}
}
class Cat extends Lion{
	void animal() {
		super.animal();
		System.out.println("This is cat");
	}
}
class Dog extends Cat{
	void animal() {
		super.animal();
		System.out.println("This is Dog");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.animal();

	}

}
