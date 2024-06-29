package Inhetritance;

//Single Inheritance means contains one parent and one child class. child class extracts all the features from the parent class.

class A1 {
	int a;
	void method1() {
		System.out.println("Given Class is Parent class in Single Inheritance");
		System.out.println(a);	
		}
	// Here A is parent class.
}
class B2 extends A1 { // extends keyword used when we declare child form parent class.
	int b;
	void method2() {
		System.out.println("Given class in Child class in single Inheritance");
		System.out.println(b);
	}
	//Here B is the child class of parent A. From here we will accept all the variables and methods from parent class.
	
}
 

public class SingleInheritance {

	public static void main(String[] args) {
		// We need to create object with object reference variable when we acces the class.
		B2 ob1=new B2();
		ob1.a=10;
		ob1.b=20;
		ob1.method1();
		ob1.method2();

	}

}
