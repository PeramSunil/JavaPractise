package Practice;

public class Reverseofnumber {

	public static void main(String[] args) {
		int i=1234;
		int rev = 0;
		while (i!=0) {
			rev= rev*10+i%10;
			i/=10;
		}
		System.out.println("Reverse number " + rev);

	}

}
