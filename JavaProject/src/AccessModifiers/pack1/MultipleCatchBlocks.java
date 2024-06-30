package AccessModifiers.pack1;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is Started...");
		
		String S1=null;
		try { 
		 int length=S1.length();// NullPointerException
		System.out.println(length);
		}
		catch(ArithmeticException e) {
			System.out.println("Handled Arithmetic Exception");
			
		}
		catch(NullPointerException e) {
			System.out.println("Handled Null Pointer Exception");
		}
		catch (NumberFormatException e) {
			System.out.println("Handled Number Format Exception");
		}
		
		System.out.println("Program is Ended...");
		
		

	}

}
