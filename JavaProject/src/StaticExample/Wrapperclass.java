package StaticExample;

public class Wrapperclass {

	public static void main(String[] args) {
		
		// Premitive data type
		int i=100;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		// Converting the premitive data type to Object type-- Known as Auto boxing
		Integer iobj=i;
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		
		/*System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);*/
		
		// Converting the Object type to Premitive data-- Un Boxing.
		
		int intvalue=iobj;
		double doublevalue=dobj;
		char charvalue=cobj;
		boolean boolvalue=bobj;
		
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(boolvalue);
		
		
		

	}

}
