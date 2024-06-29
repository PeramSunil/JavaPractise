package StaticExample;

public class DataConversion {

	public static void main(String[] args) {
		
		// Scenario 1: converting String to int,double,boolean,char(not possible)
		
		//Converting the string class to int
		/*String s1="10";
		String s2="10";
		
		int a=Integer.parseInt(s1);// We used Wrapper integer class in order to data type.
		int b=Integer.parseInt(s2);
		System.out.println("Sum of two number :" +(a+b));
		
		
		
		// Converting the string to double.
		String s3="10.5";
		String s4="20.5";
		
		double d1=Double.parseDouble(s3);
		double d2=Double.parseDouble(s4);
		System.out.println("Sum of the Two double values :"+(d1+d2));
		
		// Converting String to boolean
		
		String s5="true";
		String s6="fale";
		
		boolean boolvalue1= Boolean.parseBoolean(s5);
		boolean boolvalue2= Boolean.parseBoolean(s6);
		System.out.println(boolvalue1);
		System.out.println(boolvalue2);*/
		
		
		// Scenario 2: Converting the int,double,boolean char to String-- Un boxing
		
		int x=100;
		boolean bool=true;
		char c='S';
		double doub=10.5;
		String S1=String.valueOf(x);
		String S2=String.valueOf(bool);
		String S3=String.valueOf(doub);
		String S4=String.valueOf(c);
		
		System.out.println(x);
		System.out.println(bool);
		System.out.println(doub);
		System.out.println(c
				);
		 
		
	}

}
