package Inhetritance;
 
interface Shape
{
	int length=100; // Final and static variable.
	int width=20; // Final and static variable.
	
	
	void circle(); //Abstract method. This method is public method. No need to define public access modifier
	
	default void square() { // we cannot define method with out default or static.
		System.out.println("This is the Default method...");
	}
	static void rectangle() {
		System.out.println("This is the static method...");
	}
	
}


public class InterfaceExample implements Shape { 	// We need to define abstract method in child class when we implements with Interface
	public void circle() {							// We define more access modifier or same access modifier in child class.
		System.out.println("This is circle-- abstract method");
	}
	 void triangle() {
		System.out.println("This is Triangle....");
	}

	public static void main(String[] args) {
		
		// Scenario 1. Creating the object reference variable with class name
		/*
		InterfaceExample obj= new InterfaceExample();
		obj.circle();// accessing the abstract method with object reference variable.
		obj.square();// accessing the default method with object reference variable.
		Shape.rectangle();// We cannot access the static method with object reference varible.Hence that can be done with Interface key word.
		obj.triangle();
		System.out.println(obj.length+obj.width);// Accessing the static and final variables with object reference variable.
		System.out.println(Shape.length+Shape.width);// Accessing the static and final variables with Interface Key word. This is not preferable.
		//obj.length=200;// We cannot change the values Interface variables
		*/
		
		// Scenario 2
		// Creating the Object reference for Interface with Class name
		
		Shape sh=new InterfaceExample();
		sh.circle();
		sh.square();
		Shape.rectangle();// Static methods cannot access with reference variable. Hence it can be done with Interface keyword or Class key word
		System.out.println(sh.length+sh.width);
		//InterfaceExample.triangle(); We cannot access like this unless the method having static key word.
		
		

	}

}
