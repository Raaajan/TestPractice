package test;

public class FinalmethodoverloadingclassB extends FinalmethodoverloadingclassA {

	public void methodA()
	{
		System.out.println("abstract method implemented");
	}

	public void methodc()
	{
		System.out.println("classB - methodc");
	}

	public static void staticchildfn()
	{
		System.out.println("static in child");
	}
	
	public static void main(String[] args) {
		FinalmethodoverloadingclassB b= new FinalmethodoverloadingclassB();
		
		b.methodA();
		b.methodA(5);
		b.methodB();
		
		FinalmethodoverloadingclassA.staticparentfn();
		FinalmethodoverloadingclassB.staticchildfn();
		FinalmethodoverloadingclassB.staticparentfn();
		
		
		
	}
	
}

