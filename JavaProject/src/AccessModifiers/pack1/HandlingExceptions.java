package AccessModifiers.pack1;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {
	
		
		// Handling Exception for Example 1
		
		System.out.println("Program is Started.....");
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the number:");
		int num=sc.nextInt();
		try {
		System.out.println(100/num); //Arithmetic Exception when we enter ZERO.
		}
		catch(ArithmeticException e){ // e is Exception reference variable.
		System.out.println("In Valid data provide by the user");
		System.out.println(e.getMessage());
		}*/
		
		// Handling Exception for Example 2
		int a[]=new int[5];
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		System.out.println("Enter the values for respective position:");
		int value=sc.nextInt();
		try {
		a[pos]=value;// ArrayIndexOutOfBoundsException when we enter SIX
		System.out.println(a[pos]); 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position number provided by user");
			System.out.println(e.getMessage());
			
		}
		
		
		
		System.out.println("Program is Completed.....");

	}

}
