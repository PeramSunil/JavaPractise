package AccessModifiers.pack1;

public class ThrowKeyword {
	
	void checksum(int num) {
		if (num<1) {
			throw new ArithmeticException("Number is negative. Cannot calculate square");
			
		}
		else {
			System.out.println(num*num);
		}
	}

	public static void main(String[] args) {
		ThrowKeyword tobj=new ThrowKeyword();
		try {
		tobj.checksum(-2);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled..");
			
		}
		
	}

}
