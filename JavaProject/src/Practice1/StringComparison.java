package Practice1;

public class StringComparison {

	public static void main(String[] args) {
		// Case1 by creating the two strings with same format.
		// == compare the objects of class.
		// equals() compare the values of two objects.
		
		
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("   ");
		
		
		// Case2 by creating the strings with object reference variable
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println(s3==s4);      // == checks the objects are equals. hence it prints false value
		System.out.println(s3.equals(s4));  // check the values of both strings.
		System.out.println("   ");
		// Case3 by creating with one string with normal way and another with object reference variable
		
		String s5="welcome";
		String s6= new String("welcome");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println("   ");
		// Case4 by creating with case3 type and assing one string to another
		
		String s7=s6;
		System.out.println(s7==s6);
		System.out.println(s7.equals(s6));
		
		
		
		
		
		
		}

}
