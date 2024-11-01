package Method_overriding;


public class Child extends Parent_1 {
	
	
	public void wish() {
		super.wish();//super--- is a keyword
	
		System.out.println("I WANT TO BECOME A VIDEO EDITOR");
	}
	
	public static void main(String[] args) {
		
		
		
		Child aChild = new Child();
		aChild.wish();

}}