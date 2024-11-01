package set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class As {

	public static void main(String[] args) {
		
		Set<String> a=new HashSet<String>();
		a.add("ford");
		a.add("dodge");
		a.add("gtr");
		a.add("supra");
		a.add("bmw");
		//set() index(),get()
	System.out.println(a.size());
		
	Set<Integer> c=new HashSet<Integer>();
	c.add(89);
	c.add(65);
	
	//System.out.println(c.get(1));
	
//a.set("ford","audi");
	//System.out.println(a); 
	
	a.remove("ford");
	System.out.println(a);

	//System.out.println(a.indexOf("gtr"));
	
System.out.println(a.contains("bmw"));


	

	}
}
