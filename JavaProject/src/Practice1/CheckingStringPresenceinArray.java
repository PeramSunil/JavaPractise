package Practice1;

public class CheckingStringPresenceinArray {

	public static void main(String[] args) {
		//Creating Object array which can store all types of data types
		/*Object a[]= new Object[5];
		a[0]=10.5;
		a[1]="Welcome";
		a[2]='B';
		a[3]=true;
		a[4]="Java";
		String S1="Welcome";
		boolean y=true;
		char v='A';
		double o=10.5;
		for (int i=0;i<=a.length-1;i++) {
			if (a[i].equals(o)) {
				System.out.println("Given String/Number/Boolean value/Character/Double present in the array");
				
			}
			else {
				System.out.println("Given String/Number/Boolean value/Character/Double not present in the array");
			}
		}*/
		//Checking presence of element in array using Object call for dimensional array
		Object a[][]= new Object[2][3];	
		a[0][0]="Testing";
		a[0][1]='V';
		a[0][2]="Selenium";
		a[1][0]=true;
		a[1][1]=70.568f;
		a[1][2]=10;
		String S1="Selenium",S2="Testing";
		char b='V';int e=10;float h=70.568f;boolean n=true;
		for (Object x[]:a)//Using Enhanced for loop for assigning the variable
		{
			for (Object y:x)//later assigned value again assing to another value.Handling two dimensional array with enhanced for loop.
			{
				if(y.equals(b)) {
					System.out.println("Given String Present in array " + y);
				}
				else {
					System.out.println("Given String is not Present in array " + y);
				}
			}
			
		}
		    }

}
