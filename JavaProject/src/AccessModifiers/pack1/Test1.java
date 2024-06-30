package AccessModifiers.pack1;

public class Test1 {
	// We are created variables and methods without any access modifier.
	// Hence these are default modefier
	int i=100;
	void m1() {
		System.out.println("This is m1 method from Test1 class..");
		System.out.println("....")
	}
	// We are created with private access modifer.
	private int j=100;
	private void m2() {
		System.out.println("This is m2 method from Test1 class..");
	}
	 protected int y=200;
	 protected void m3() {
		 System.out.println("This is m3 method from Test1 class...	 ");
	 }
	 public int z=20034;
	 public void m4() {
		 System.out.println("This is m4 method from Test1 class....");
	 }

}
