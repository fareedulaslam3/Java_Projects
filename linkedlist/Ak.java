package linkedlist;

import java.util.LinkedList;


public class Ak {
	public static void main(String[] args) {
		
//		----------------------->>LIST LINKED,ARRAY,VECTOR
		LinkedList<Integer> b= new LinkedList<Integer>();
		b.add(1);
		b.add(5);
		b.add(7);
		System.out.println(b);//size()---len
		
		
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(89);
		a.add(65);
		
		System.out.println(a.get(0));
		
		b.set(0,78);
		System.out.println(b); 
		
		b.remove(0);
		System.out.println(b);
		System.out.println(a);
		System.out.println(a.indexOf(65));
		
		System.out.println(b);
	System.out.println(b.contains(5));
	
	a.addAll(b);
	System.out.println(a);
	
	LinkedList<Integer> c=new LinkedList<Integer>();
	c.add(7);
	c.add(99);
	System.out.println(c);
	System.out.println(b);
	c.retainAll(b);
	System.out.println(c);
	
	LinkedList<String> d= new LinkedList<String>();
	d.add("A");
	d.add("B");
	d.add("C");
	d.add("D");
	d.add("E");
	System.out.println(d);
	LinkedList<String> e= new LinkedList<String>();
	e.add("A");
	e.add("B");
	e.add("C");
	System.out.println(e);
	d.removeAll(e);
	System.out.println(d);
	}
}
