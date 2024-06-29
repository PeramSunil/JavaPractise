package Practice2;

public class DataClass {
	int id;
	String name;
	int marks;
	void display() {
		System.out.println("Id of the student " + id);
		System.out.println("Name of the student " + name);
		System.out.println("Marks of the student " + marks);
	}
	void run(int i,String S,int m) {
		id=i;
		name=S;
		marks=m;
		
	}
	DataClass(int d,String S1,int a)
	{
	id=d;
	name=S1;
	marks=a;
	
	}
	

}
