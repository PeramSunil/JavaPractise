package AccessModifiers.pack2;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Up--Casting Automatic Smaller to larger
		// int to long
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		//Float to double.
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		// Down Casting-- Manually -- larger to smaller
		// Long to Int down casting
		long longvalue1=121365002;
		int intvalue1=(int)longvalue1;// Here we need to add the cast type manually
		System.out.println(intvalue1);
		
		
		
		// Double to float down casting
		// In down casting we may loose some data
		
		double doublevalue1=15.6432397;
		float floatvalue1=(float)doublevalue1;
		System.out.println(floatvalue1);
		
		

	}

}
