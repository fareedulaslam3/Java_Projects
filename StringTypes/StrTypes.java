package StringTypes;

public class StrTypes {
public static void main(String[] args) {
//	----------------------->>                          IMMUTABLE 
//	dup=same memory address,dup+add==diff memory address
//	String s="wertyuio";
//	String t ="wertyuio";
//	
//System.out.println(System.identityHashCode(t));
//System.out.println(System.identityHashCode(s));
//
//System.out.println(System.identityHashCode(s+"asdfgh"));

//------------------------------------------------>>   MUTABLE [STRING BUILDER ]
//dup=diff memory address,dup+append=same memory address



	StringBuilder sb=new StringBuilder("erty");
	
	System.out.println(System.identityHashCode(sb));

	
StringBuilder s=new StringBuilder("erty");

	System.out.println(System.identityHashCode(s));
                   
	s.append("dfghj");
	System.out.println(System.identityHashCode(s));


//StringBuffer
}
}