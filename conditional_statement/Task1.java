package conditional_statement;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int i = ref.nextInt();
	
		
		if(i%2==0) {
			System.out.println("IS AN EVEN NUMBER");
		}
		else {
			System.out.println("IS AN ODD NUMBER");
		}
	}

}
