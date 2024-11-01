package Exception;

import java.util.ArrayList;
import java.util.List;

public class Java_Exception {
 
	//exception-->2 types-->1.checked-compile time exception 2.unchecked-run time exception
	//2.runtime exception-->7 types
	//1.arithmetic exception 2.null pointer exception 3.input mismatch exception 4.array index out of bound
	//5.string index out of bound 6.number format exception 7.index out of bound


	public static void main(String[] args) {
		
	//1.arithmetic exception
//	try { int a=10;
//	int b=0;
//	int c=a/b;
//	System.out.println(c);
//	}
//	catch (Exception a) {
//	// TODO: handle exception
//	System.out.println("arithmetic exception");
//	}}}

	//2.null pointer exception
//	try { String s=null;
//	System.out.println(s.length());}
//	catch (Exception b) {
//	// TODO: handle exception
//	System.out.println("null pointer exception");
//	}}}
//
	//3.input mismatch exception
//	try { Scanner a=new Scanner(System.in);
//	System.out.println("enter your name");
//	int next=a.nextInt();
//	System.out.println(next);}
//	catch (Exception c) {
//	// TODO: handle exception
//	System.out.println("input mismatch exception");
//	}}}

	//4.array index out of bound
//	try { int a[]= {10,20,30};
//	System.out.println(a[5]);}
//	catch (Exception d) {
//	// TODO: handle exception
//	System.out.println("array index out of bound");
//	}}}
//
	//5.string index out of bound
//	try { String s="priya";
//	char c= s.charAt(5);
//	System.out.println(c);}
//	catch (Exception e) {
//	// TODO: handle exception
//	System.out.println("string index out of bound");
//	}}}
//
	//6.number format exception
//	try { String a="priya123";
//	System.out.println(Integer.parseInt(a));}
//	catch (Exception f) {
//	// TODO: handle exception
//	System.out.println("number format exception");
//	}}}
//
//	7.index out of bound
	
	try { List<String> a=new ArrayList<String>();
	a.add("priya");
	a.add("prabu");
	System.out.println(a.get(2));}
	catch (Exception g) {
	// TODO: handle exception
	System.out.println("index out of bound");
	}

	finally {
	System.out.println("these are the run time exception");
	}

	}}






