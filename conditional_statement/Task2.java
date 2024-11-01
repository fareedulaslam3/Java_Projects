package conditional_statement;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
         
		
		Scanner refScanner=new Scanner(System.in);
	    System.out.println("ENTER STUDENT MARKS :");

         int marks = refScanner.nextInt();
         if (marks >= 0) {
             if (marks <= 100) {
                 if (marks >= 90) {
        	 
        	 System.out.println("Grade A");
                 
         }
         else if(marks>=80) {
    	 
        	 System.out.println("Grade B");
    	 
     }
         else if (marks >= 70) {
             System.out.println("Grade: C");
         } else if (marks >= 60) {
             System.out.println("Grade: D");
         } else {
        	 
        	 System.out.println("fail");
}
 
         }}}}