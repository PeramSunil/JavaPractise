package Inhetritance;

class Parent
{
	void me1(int a) {
		System.out.println("Declared element in method1 " + a);
	}
}
class Child1 extends Parent {
	void me2(int b) {
		System.out.println("Declared element in method2 " + b);
	}
	
}
class Child2 extends Parent{
	void me3(int c) {
		System.out.println("Declared element in method3 " + c);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.me1(100);
		obj.me2(200);
		Child2 obj1 = new Child2();
		obj1.me1(300);
		obj1.me3(500);
		
		
		

	}

}
