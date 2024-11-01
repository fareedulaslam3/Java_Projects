package Constructor;

public class Cons1 {
	
	public Cons1() {
		this("sdfghjkl");
		System.out.println("12345678");
		
	}
	
	public Cons1(int a) {
		this();
		System.out.println("I AM :"+a);
		
		
	}
	
	public Cons1(String b) {
		
		System.out.println(b);
		
	}
	
public static void main(String[] args) {
	Cons1 refCons1=new Cons1(5);
}
}
