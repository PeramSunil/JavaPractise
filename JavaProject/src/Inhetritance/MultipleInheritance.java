package Inhetritance;


public interface I1
{
	int x=100;
	void m1();
}
public interface I2 {
	int y=20;
	void m2();
}

public class MultipleInheritance implements I1,I2 { // Multiple Inheritance can be done by using Interface.
	public void m1() {
		System.out.println("This is m1 method....");
	}
	public void m2() {
		System.out.println("This is m2 method...");
	}

	public static void main(String[] args) {
		MultipleInheritance md1=new MultipleInheritance();
		md1.m1();
		md1.m2();
		System.out.println(md1.x+md1.y);
		

	}

}
