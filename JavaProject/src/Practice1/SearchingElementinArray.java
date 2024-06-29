package Practice1;

import java.util.Scanner;

public class SearchingElementinArray {

	public static void main(String[] args) {
		//Searching for an element using single dimensional array
		Scanner sc= new Scanner(System.in);// New Scanner class for taking the input for console
		
		
		//int a[]= {1,2,3,4,5,6,7,8,9};
		int i;
		System.out.println("Enter the Searching element in array");// Just print statement inorder to enter the value.
		i=sc.nextInt();
		boolean st = false;
	/*for (int x:a)
	{
	if (x==i)
	{
		System.out.println("Element present in given string " + x);
		st=true;
		break; // After finding the element it will not check for remaining
	}
	
	}
	if(st==false) {
		System.out.println("Given element is not present in string");
	}*/
		//Searching the element in two dimensional array.
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}},n,m;
		for (n=0;n<a.length;n++) {
			for (m=0;m<a[0].length;m++)
			{
				if (a[n][m]==i) {
					System.out.println("Given element present in array " +a[n][m] );
					st=true;
					break; // After finding the element it will not check the other values.
				}
			
				}
			}
			if(st==false) {
		System.out.println("Given element is not present in string");
	}
}
}
