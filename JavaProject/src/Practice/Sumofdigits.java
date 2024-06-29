package Practice;

public class Sumofdigits {

	public static void main(String[] args) {
		long i=898997885,j=0,k;
		while(i>0) {
			j=j+i%10;
			i/=10;
			
		}
		System.out.println("Sum of the digits " + j);

	}

}
