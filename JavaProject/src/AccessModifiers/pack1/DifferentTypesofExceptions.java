package AccessModifiers.pack1;

import java.util.Scanner;

public class DifferentTypesofExceptions {

	public static void main(String[] args) {
		
		
		// Example 1 in Exceptional Handling.
	System.out.println("Program is Started.....");
	Scanner sc=new Scanner(System.in);
	/*System.out.println("Enter the number:");
	int num=sc.nextInt();
	System.out.println(100/num);*/ //Arithmetic Exception when we enter ZERO.
	
	
	// Example 2 in Exceptional Handling.
	
	/*int a[]=new int[5];
	System.out.println("Enter the position(0-4):");
	int pos=sc.nextInt();
	System.out.println("Enter the values for respective position:");
	int value=sc.nextInt();
	a[pos]=value;// ArrayIndexOutOfBoundsException when we enter SIX
	System.out.println(a[pos]); */
	
	
	
	// Example 3
	
	/*String S="Welcome";
	int i=Integer.parseInt(S);
	System.out.println(i);*/ // NumberFormatException
	
	
	
	// Example 4
	
	 String S1=null;
	 int length=S1.length();// NullPointerException
	System.out.println(length);
	
	System.out.println("Program is Ended...");
	}

}
