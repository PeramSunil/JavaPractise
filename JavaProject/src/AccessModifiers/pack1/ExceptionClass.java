package AccessModifiers.pack1;

public class ExceptionClass {

	// Use of Exception class in catch method. This can be used if you don't know what type of exception it was throwing
	// Exception Class is Parent of all types of Exceptions
	
	public static void main(String[] args) {
		
		System.out.println("Program is Started...");

		String S="123486SHT";
		try {
		int i=Integer.parseInt(S);
		System.out.println(i); 
		}
		catch(Exception e) {
			System.out.println("Exception Handled by using Exception class..");
		}
		System.out.println("Program is Ended...");

	}

}
