package Practice;

public class Smallest3number {

	public static void main(String[] args) {
		int a=100,b=105,c=25;
		if(a<b && a<c) {
			System.out.println("Smallest number is a:" + a);
		}
		else if (b<a && b<c) {
			System.out.println("Smallest number is b:" + b);
		}
		else {
			System.out.println("Smallest number is c:" + c);
		}
			
	}

}
