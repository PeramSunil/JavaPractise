package Practice;

public class Totalofelementsinarray {

	public static void main(String[] args) {
		int count=0;
		/*int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		for (int i=0;i<a.length;i++) {
			count+=a[i];
		}
		System.out.println(count);*/
		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				count+=a[i][j];
			}
		}
		System.out.println(count);

	}

}
