package overloading;

public class Lone {

	public void method_1(int a) {

		System.out.println(a);
		
	}
	
public void method_1(String b) {
	System.out.println(b);
	
	}
public void method_1(int g,int h) {
	int z=g+h;
	System.out.println("The answer is " +z);
	
	
}
public void method_1(boolean d) {
	System.out.println(d);
	
	
	
}
public void method_1(char e) {
	System.out.println(e);
	
	
}

	public static void main(String[] args) {
		
		Lone aLone = new Lone();
		aLone.method_1(false);
		aLone.method_1(4, 400);
		aLone.method_1("ASLAM");
		aLone.method_1('A');
		aLone.method_1(10000);
	}
	
}
