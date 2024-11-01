package Constructor;

public class Cons2 {
	
	
	
	
	public Cons2() {

		
		System.out.println("product 1");
		
	}
	public Cons2(String a) {
	
		this();
		System.out.println("product name :"+a);
		
	}
	
	public Cons2(int b) {
	this("chocolate");
		System.out.println("price of product 1 :"+b);
		
	}
	
	

public static void main(String[] args) {
	Cons2 aCons2=new Cons2(100);
	
}}
