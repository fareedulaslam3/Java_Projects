package String;

public class Aslam {

	
public static void main(String[] args) {
	
	String a ="ASLAM";
	int a2 = a.length();
	System.out.println(a2);
	
	String b ="Aslam";
	boolean b2 = b.equals(a);
	System.out.println(b2);
	
	String c = "aslam";
	Boolean c2 = c.equalsIgnoreCase(a);
	System.out.println(c2);
	
	  String d ="lone";
	  String d2 = d.toUpperCase();
	  System.out.println(d2);
	  
	  String e ="LYRICZ";
	  String e2 = e.toLowerCase();
	  System.out.println(e2);
	  
	  String f ="I LIKE GTR CAR";
	  boolean f2 = f.startsWith("I");
	  System.out.println(f2);
	  
	String g ="I LIKE GTR CAR";
	boolean g2 = g.endsWith("CAR");
	System.out.println(g2);
	
	String h ="I LIKE GTR CAR";
	boolean h2 = h.contains("G");
	System.out.println(h2);
	
	String i ="I LIKE GTR CAR";
	int i2 = i.indexOf("C");
	System.out.println(i2);
	
	    String j ="I LIKE GTR CAR";
     	int j2 = j.lastIndexOf("I");
	    System.out.println(j2);
	    
		String k ="I LIKE GTR CAR";
		char k2 = k.charAt(3);
		System.out.println(k2);
	    
		String l ="I LIKE GTR CAR";
		String l2 = l.replace('I','O');
		System.out.println(l2);
		
    String m ="Hi how are you lone";
    String m2 = m.substring(4);
	System.out.println(m2);
	
	String n ="";
	boolean n2 = n.isEmpty();
	System.out.println(n2);
	
	  String o="   Hi how are you lone   ";
	  String o2 = o.trim();
	  System.out.println(o2);
	
	
	  String p="how-are-you";
	  String[] p2 = p.split("-");
	
	  System.out.println(p2[2]);
	
	  int q=5;
	  String q2 = String.valueOf(q);
      System.out.println(q2);
 
  System.out.println( d.concat(e));
  
  
	
	
}
}