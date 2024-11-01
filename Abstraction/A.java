package Abstraction;

public class A extends Abs_1{

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		
		System.out.println("this is abstract method");
	}

	
	public static void main(String[] args) {
		
		A refA =new A();
		refA.method_1();
		refA.method_2();
	}
}

