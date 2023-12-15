package zadacaaa38;

public class Student2 {
	int index;
	String ime;
	static String fakultet ="ITS"; // staticna promenliva
	Student2(int r,String n){
	index = r;
	ime = n;
	}
	void display (){

	System.out.println(index +  " " + ime +" " + fakultet);
	}

	public static void main(String args[]){
	Student2 s1 = new Student2(111,"Petar");
	Student2 s2 = new Student2(222,"Marko");
	s1.display();
	s2.display();
	}
}
