package Practice1;

public class ReverseofString {

	public static void main(String[] args) {
		//Reversing the string using character array
		String s="Welcome",s1="";
		System.out.println("Given String " + s);
		char a[]=s.toCharArray();
		int l=a.length;
		for (int i=l-1;i>=0;i--) {
			s1=s1+a[i];
		}
		System.out.println("Reverse of a String " + s1);
		
		
		// Reveresing of string with build in methods. For we use StringBuffer and StringBuilder.
		 StringBuffer s2= new StringBuffer("Welcome");
		 System.out.println("Reverse of String " + s2.reverse());// Reverse is applicable when we create with StringBuffer or StringBuilder
		 StringBuilder s3= new StringBuilder("Selenium");
		 System.out.println("Reverse of String " + s3.reverse());
		

	}

}
