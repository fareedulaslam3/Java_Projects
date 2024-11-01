package Multiple_inheritance;

public class Inter_class implements Interface_1,Interface_2,Interface_3 {

	public static void main(String[] args) {
		
		Inter_class refClass =new Inter_class();
		refClass.method1();
		refClass.method2();
		refClass.method3();
		refClass.method4();
		
	}

	@Override
	public void method4() {
	
		System.out.println("i am method : 4");
	}

	@Override
	public void method3() {
	
		System.out.println("i am method : 3");
	}

	@Override
	public void method1() {
		
		System.out.println("i am method : 1");
	}

	@Override
	public void method2() {
		System.out.println("i am method : 2");
		
	}
}
