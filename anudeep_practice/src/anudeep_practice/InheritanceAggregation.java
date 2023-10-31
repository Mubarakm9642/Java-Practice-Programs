package anudeep_practice;
class Bike{
	private String brand;
	private int mileage;
	Bike(String brand,int mileage){
		this.brand=brand;
		this.mileage=mileage;
	}
	String getBrand(){
		return brand;
		
	}
	int getMileage() {
		return mileage;
	}
}
class Book{
	private String name;
	private String author;
	Book(String name,String author){
		this.name=name;
		this.author=author;
	}
	String getName() {
		return name;
		
	}
	String getAuthor() {
		return author;
	}
	
}
class Heart{
	private int weight;
	private int bpm;
	Heart(int weight,int bpm){
		this.weight=weight;
		this.bpm=bpm;
	}
	int getWeight() {
		return weight;
		
	}
	int getBPM() {
		return bpm;
	}
}
class Brain{
	private int weight;
	private String colour;
	Brain(int weight,String colour){
		this.weight=weight;
		this.colour=colour;
	}
	int getWeight(){
		return weight;
		
	}
	String getColour() {
		return colour;
	}
}
class Student{
	Heart ht=new Heart(60,110);
	Brain br=new Brain(50,"white");
	void hasA01(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
	}
	void hasA02(Book bk) {
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());
	}
}
public class InheritanceAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike("Hunter",35);
		Book bk=new Book("C language","Padma reddy");
		Student s=new Student();
		System.out.println(s.ht.getWeight());
		System.out.println(s.ht.getBPM());
		System.out.println(s.br.getWeight());
		System.out.println(s.br.getColour());
		s.hasA01(b);
		s.hasA02(bk);
		s=null;
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());
	}

}
