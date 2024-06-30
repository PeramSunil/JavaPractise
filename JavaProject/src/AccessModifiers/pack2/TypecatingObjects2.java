package AccessModifiers.pack2;

public class TypecatingObjects2 {

	public static void main(String[] args) {
		
		// Ex 1
		//Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer)o; // Rule 3 got failed.No relation ship between StringBuffer and String.
		
		// Ex2
		//String s=new String("Welcome");
		//	StringBuffer sb1=(StringBuffer)s;// Rule 1 got failed. No relation ship between StringBuffer and String.
		
		// Ex 3
		//Object o1=new String("Welcome");
		//StringBuffer sb2=(String)o1;// Rule 2 got failed
		
		// Ex 4
		//String S=new String("Welcome");
		//StringBuffer sb3=(String) S; //  Rule 2 got failed
		
		// Ex 5
		Object o3=new String("Welcome");
		String S2=(String) o3;// Passed all the rules
		System.out.println(S2);
		
		
		
	}
	}

