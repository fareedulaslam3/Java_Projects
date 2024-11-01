package conditional_statement;

import java.util.Scanner;

public class Task3 {
	
	
	public static void main(String[] args) {
		Scanner refScanner=new Scanner(System.in);
		System.out.println("ENTER A BUTTON:");
		 int button = refScanner.nextInt();
		 switch(button) {
		 case 1:
			 System.out.println("hello");
		
			 break; 
			 
		 case 2:
			 System.out.println("hi");
//			 break;
	     default:
	    	 System.out.println("invalid button");
			 
			 
		 }
		 
		
		
		 }
	}


