package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration of ArrayList
		ArrayList mylist=new ArrayList(); // Child class with class variable. It can store all types of data.
		//List mylist2=new ArrayList();// Child class with Parent class variable
		
		 //ArrayList <Integer>mylist=new ArrayList<Integer>(); //It can store only integer type of data.
		
		// Adding data in ArrayList
		mylist.add(100);
		mylist.add(10.50);
		mylist.add("Welcome");
		mylist.add('B');
		mylist.add(true);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add(null);
		mylist.add("Welcome");
		
		// Size of Array List.
		System.out.println("Size of the Array List : " + mylist.size());// 10
		
		// Printing  data from the  Arraylist
		System.out.println("Printing data from ArrayList : " + mylist); // [100, 10.5, Welcome, B, true, true, null, null, null, Welcome]
		
		
		// Remove the data from ArrayList
		mylist.remove(5);// We will specify the index to remove that particular element.
		mylist.remove(8);
		
		System.out.println("After removing the element printing data from ArrayList : " + mylist); // : [100, 10.5, Welcome, B, true, null, null, null]	
		
		// Insertion of data in middle of arrayList
		 mylist.add(2,"Java"); // It will insert particular data at that index value.
		 
		
		 System.out.println("After inserting the data in Existing Array List : "+mylist);//[100, 10.5, Java, Welcome, B, true, null, null, null]
		
		 // Modify/replace/change the element in ArrayList
		 mylist.set(2, "Python");
		 
		 System.out.println("After replacing the data in Existing Array List : "+mylist); //[100, 10.5, Python, Welcome, B, true, null, null, null]
		
		 // Access specific element of ArrayList.
		 System.out.println("Accessing the specific element in Array List: " + mylist.get(3)); // Here 3 is the index. Welcome
		 
		 
		 // Reading all elements in Arraylist- We have three types.
		  
		 // Using for loop.
		  for (int i=0;i<mylist.size();i++)
		  {
		  System.out.println("Priting the Array List using for Loop : " + mylist.get(i));
		  }
		 
	
		  // Using enhanced for loop
		  for (Object x:mylist) {
			  System.out.println("Priting the Array List using Enhanced for Loop : " + x);
		  }
		  
		  Iterator it=mylist.iterator();
		  while(it.hasNext()) {
			  System.out.println("Priting the Array List using Iterator : " + it.next());
		  }
	
		  // Checking elements in ArrayList-- 
		  System.out.println( "Checking elements in Array List : "+ mylist.isEmpty());// It was return boolean value. If no elements it will return true. If elements it will return false
		  
		  
		  // Remove specific Elements from the Array List
		  ArrayList mylist2=new ArrayList();
		  mylist2.add(100);
		  mylist2.add("Welcome");
		  
		  
		  mylist.removeAll(mylist2); //With this command we remove the mylist2 elements from mylist 
		  System.out.println("Array list after removing the elements : " + mylist); //[10.5, Python, B, true, null, null, null]
		  
		  // Clearing all the elements in Array List.
		  mylist.clear();
		  System.out.println( "Checking elements in Array List : "+ mylist.isEmpty());// It will return the true value. Arraylist is empty.
		  
	}

}
