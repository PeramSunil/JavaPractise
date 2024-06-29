package AccessModifiers.pack1;

public class Test2 {

	public static void main(String[] args) {
		Test1 tobj=new Test1();
		// we are accessing the variables and methods with private access modefier
		System.out.println(tobj.i);
		tobj.m1();
		
		System.out.println(         );
		//System.out.println(tobj.j);// Here accessing the private variables and methods are not possible
		//tobj.m2();
	}

}
