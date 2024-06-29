package StaticExample;

public class StaticExample1 {
	static int a=10;   	// Static variable
	int b=20;			//Non-Static variable.
	 
	static void m1() {		// Static method
		System.out.println("This is static method");
	}
	
	void m2() {			//Non-Static method
		System.out.println("This is non-static method");
	}
	
	void m3() { 	// Created non-static method in order to access the static and non stuff
		System.out.println("Accessing the static variable through non static method " + a);
		System.out.println("Accessing the not static variable through non static method " + b);
		
		m1();		// Accessing the static method in non static method. Non need any extras
		m2();		// Accessing the non static method in non static method.
		
	}
	
	
	
	
	/*public static void main(String[] args) {
		// This is when we have main method in same class
		 
		StaticExample1 em= new StaticExample1();	// Creating new object with object reference variable.
		
		//1--Accesing the static stuff in another static method.
		System.out.println(a); 
		m1();
		
		//2-- Accesing the non static stuff in another static method. In order to access we need to have object reference variable
		
		System.out.println(em.b);
		em.m2();
		
		//3-- Accessing another method which has both static and not stuff. But for this we need to have object reference variable.
		 em.m3();
		 

	}*/

}
