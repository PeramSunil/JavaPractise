package AccessModifiers.pack2;

import AccessModifiers.pack1.Test1;// Here we importing the test1 class from pack1 package

/*public class Test2 {

	public static void main(String[] args) {
		Test1 tobj=new Test1();
		// we are accessing the variables and methods with private access modefier
		// Here out side the package also not possible when we create
		// we need to import from that package for refering the class. 
		//Even though importing also we are not able to perform
		//System.out.println(tobj.i);
		//tobj.m1();
		
		System.out.println(         );
		
	}

	}*/
/*public class Test2 extends Test1 {
	// Created new class to get access of private access modifier data.

	public static void main(String[] args) {
		Test2 tobj=new Test2();
		System.out.println(tobj.y);
		tobj.m3();
		

}
}*/

public class Test2{
	public static void main(String[] a) {
	Test1 tobj=new Test1();
	System.out.println(tobj.z);
	tobj.m4();
	}
}
