package SuperKeyWord;


class test{
	 final int x=100; //we are adding the final keyword to x. so that its value cannot change. 
	 final void m1() {
		 System.out.println("this is m1 for parent class");
	 }
}
class test1 extends test{
	/*void m1() {			// when we add final key word in parent class we cannot override in child class.
		System.out.println("this is m1 from child class");
	}*/
}
	
	final class test2 {	// when we add final key word we cannot extend that class to another class
		void m2() {
			System.out.println("Test2 class");
		}
	
	}
	//class text3 extends test2{
		
	//}
	
	
	
	
	
	
	
	
	

public class Finalkeyword {

	public static void main(String[] args) {
		test t=new test();
		//t.x=200;// with this we are changing the value of x in execution stage. When we add final key word in class stage that value cannot be changes.
		System.out.println(t.x);

	}

}
