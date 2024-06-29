package Practice;

public class Findodd_evendigits {

	public static void main(String[] args) {
		int i=1674532,even=0,odd=0;
		while(i>0)
		{
			if (i%2==0) {
				even++;
				}
			
			else {
				odd++;
				
			}
			i/=10;
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
