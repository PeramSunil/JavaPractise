package AccessModifiers.pack1;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String S="Welcome";// use null for case1 and case2.
		// Use Welcome for case3-- Exception does not occur catch block ignored. Finally block executed.
		try {
			System.out.println(S.length());
		}
		/*catch(NullPointerException e) { // Case1--Exception occured,catch block handled,finally block executed
			System.out.println("Exception Handled....");
		}*/
		catch (ArithmeticException e) { // Case2-- Exception occured,catch block not handled, finally block executed.
			System.out.println("Exception not handled");
		}
		finally {
			System.out.println("Finally Block Executed..");
		}

	}

}
