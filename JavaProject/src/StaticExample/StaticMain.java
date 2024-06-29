package StaticExample;

public class StaticMain {

	public static void main(String[] args) {
	// This is when we have main method in different class but in same package
	 
	StaticExample1 em= new StaticExample1();	// Creating new object with object reference variable.
	
	//1--Accesing the static stuff in another static method.
	System.out.println(StaticExample1.a); // We need indicate the static variable or method with respective Class name
	StaticExample1.m1();
	
	//2-- Accesing the non static stuff in another static method. In order to access we need to have object reference variable
	
	System.out.println(em.b);
	em.m2();
	
	//3-- Accessing another method which has both static and not stuff. But for this we need to have object reference variable.
	 em.m3();
	 
}
}