package Inhetritance;

class A {
	int a;
	void method1() {
		System.out.println("Given Class is Parent class in Single Inheritance");
		System.out.println(a);	
		}
	// Here A is parent class.
}
class B extends A { // extends keyword used when we declare child form parent class.
	int b;
	void method2() {
		System.out.println("Given class in Child class in single Inheritance");
		System.out.println(b);
	}
	//Here B is the child class of parent A. From here we will accept all the variables and methods from parent class.
	
}
 
class C extends B {
	int c;
	void method3() {
		System.out.println("Given class is child class of multiple inheritance");
		System.out.println(c);
		
	}
	// Here C is the child class of Parent B and grant child of Parent A
}


public class MultileveInheritance {
	

	public static void main(String[] args) {
		//Multilevel inheritance is extended version of single inheritance. Where child of one is having another child.
		C ob2=new C();
		ob2.a=100;
		ob2.b=200;
		ob2.c=300;
		ob2.method1();
		ob2.method2();
		ob2.method3();
	}

}
