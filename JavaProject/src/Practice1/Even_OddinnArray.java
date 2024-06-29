package Practice1;

public class Even_OddinnArray {

	public static void main(String[] args) {
		//counting with single dimensional array
	/*int a[]= {1,2,3,4,5,6,7,8,9};
	int even=0, odd=0;
	
		for (int x:a) {
			if (x%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
	
	System.out.println("Even numbers in Array " + even);
	System.out.println("Odd numbers in Array " + odd);*/
	// Counting with two dimensional array.
	
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}},even=0,odd=0,i;
	for (int m=0;m<a.length;m++) {
		for ( int y=0;y<a[0].length;y++) {
			i=a[m][y];
			if (i%2==0) {
				even++;
				
			}
			if (i%2!=0) {
				odd++;
			}
			
		}
	}
	System.out.println(even);
	System.out.println(odd);
	
	}
	

	}


