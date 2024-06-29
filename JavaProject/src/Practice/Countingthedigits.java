package Practice;

public class Countingthedigits {

	public static void main(String[] args) {
		int i=5500,count=0;
		while (i>0)
		{
			count++;
			i/=10;
		}
		System.out.println("Count of the numbers " + count);

	}

}
