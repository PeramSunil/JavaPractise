package Practice2;

public class DataMainClass {

	public static void main(String[] args) {
		//Approach1 by creating new class object
		/*DataClass dt = new DataClass();
		dt.id=19;
		dt.name="Sunil";
		dt.marks=898;
		dt.display();
		// Approach2 by creating another method
		dt.run(19, "Sunil", 898);
		dt.display();*/
		// Approach3 using constructor class
		 DataClass dt1 = new DataClass(19,"Sunil",898);
		dt1.display();

	}

}
