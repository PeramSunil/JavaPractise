package Practice;

public class Palindrome {

	public static void main(String[] args) {
		int i=121,j=i, rev=0;
		while (i!=0) {
			rev= rev*10+i%10;
			i/=10;
		}
		System.out.println(rev);
		System.out.println(j);
			if (j==rev) 
			{
				System.out.println("Given number is palindrome number " + rev);
			}
			else {
				System.out.println("Given number is not a palindrome number " + rev);
			}
		

	}

}
