package JAVABEAN;

public class Test1 {
	void registerStudent(Javabean1 jb) {
		System.out.println(jb.getName());
		System.out.println(jb.getRollno());
		System.out.println(jb.getCourse());
	}

	public static void main(String[] args) {
		Javabean1 j=new Javabean1();
		j.setName("arya");
		j.setRollno(13);
		j.setCourse("Full stack");
		Test1 t=new Test1();
		t.registerStudent(j);
		// TODO Auto-generated method stub

	}


}
