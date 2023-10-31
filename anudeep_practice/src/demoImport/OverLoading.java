package demoImport;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String s1, String s2) {
        return s1 + s2;
    }
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Calculator c = new Calculator();

	        int sumInt = c.add(6, 7);
	        System.out.println("Sum of integers: " + sumInt);

	        double sumDouble = c.add(3.14, 4.14);
	        System.out.println("Sum of doubles: " + sumDouble);

	        String concatStrings = c.add("Hello, ", "world!");
	        System.out.println("Concatenated strings: " + concatStrings);
	    }

}
