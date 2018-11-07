package test;

public class Thiskeyword {

	String name;
	int roll;

	public Thiskeyword() {
		this("rajan", 27);
		System.out.println("default cons");
	}

	public Thiskeyword(String name, int roll) {
		// this();
		this.name = name;
		this.roll = roll;

	}

	public void display(String name, int roll) {
		System.out.println("n= " + name);
		System.out.println("r= " + roll);

	}

	public void init(String n, int r) {

		name = n;
		roll = r;

		display(name, roll);

	}

	public static void main(String[] args) {

		Thiskeyword t = new Thiskeyword();
		// Thiskeyword t= new Thiskeyword("rajan",27);

		System.out.println("name= " + t.name);
		System.out.println("roll= " + t.roll);
		t.init("raj", 2);

	}

}





	
	
	