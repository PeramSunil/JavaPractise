package Practice1;
import java.util.Scanner;

public class Countingtheduplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element to check duplicates present");
		int dup=sc.nextInt();
		int a[]= {10,20,30,50,10,10,20},count=0;
		for(int i=0;i<=a.length-1;i++) {
			if (dup==a[i]) {
				count++;
				
			}
			
		}
		System.out.println("Duplicate number presents count in array " + count );
		

	}

}
