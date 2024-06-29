package Inhetritance;

class par1{
	void md1(int a) {
		System.out.println(a);
	}
	void md2(int b) {
		System.out.println(b);
		
	}
}
class par2 extends par1{
	void md1(int a) {		//Overrided method
		System.out.println(a*a);
	}
	void md2(int b) {		//Overrided method
		System.out.println(b*b);
	}
	void md2(int b,int c) {		//Overloaded method
		System.out.println(b*c);
	}
}



public class OverrdingvsOverloading {

	public static void main(String[] args) {
	par2 n1=new par2();
	n1.md1(10);
	n1.md2(50);
	n1.md2(15, 50);

	}

}
