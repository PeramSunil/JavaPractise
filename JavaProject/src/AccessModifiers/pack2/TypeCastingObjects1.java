package AccessModifiers.pack2;

class Parent{
	String name="Sunil";
	void m1() {
		System.out.println("This is m1 method from Parent..");
	
	}
}
 class Child extends Parent{
	 int id=19;
	 void m2() {
		 System.out.println("Thisis m2 method from Child..");
	 }
 }






public class TypeCastingObjects1 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.name);// Parent class
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		// Up Casting -- Parent reference variable with child class.
		Parent p=new Child();
		
		System.out.println(p.name);// Parent class
		p.m1();
		//System.out.println(p.id); Here in Up casting we are not able to access the child class
		//p.m2();
		
		// Down casting. In run time we are getting error
		/*Parent p1=new Parent();
		Child c1=(Child)p1;
		System.out.println(c1.name);// With down casting we are able to access the both parent and child class.
		c1.m1();
		System.out.println(c1.id);
		c1.m2();*/
		
		

	}

}
