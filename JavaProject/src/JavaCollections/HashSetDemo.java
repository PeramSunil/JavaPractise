package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration of Hashset
		
		HashSet myset=new HashSet();
		//Set myset2=new HashSet();// These two will the heterogenous data.
		//HashSet<Integer> myset3=new HashSet<Integer>(); // These will allow the only single type of data. that was Integer.
		
		//Adding Elements in HashSet
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);// It will not give any error at time of adding. But pick only one value when we add multiple values
		myset.add('A');
		myset.add(null);
		myset.add(null);
		
		System.out.println("Elements present in Hash Set collection : " + myset);// [null, A, 100, 10.5, Welcome, true]

		// Removing element from Hashset
		myset.remove(10.5);// 10.5 is value. Here we not pass the index.
		
		System.out.println("Elements in Hashset after removing the element : "+myset); //[null, A, 100, Welcome, true]
		
		// Inserting is not possible in Set Collection.
		
		// Accessing specific value is not possible in Set Collection. It was access once we concert the Hashset to ArrayList.
		
		// Converting the HashSet into ArrayList
		
		// Size of a Hash Set collection.
		 System.out.println("Printing the size of Set Collection : "+ myset.size());
		 
		ArrayList al=new ArrayList(myset);// Hash Set Collection is converted to Array List Collection.
		
		System.out.println(al.get(2));
		
		// Reading all elements in Loop Statements. Normal for loop is not possible. Enhanced for each loop possible.
		
		// Enhanced for loop.
		for (Object x:myset) 
		{
			System.out.println("Accesing the elements with enhanced for loop : "+x);
		}
		
		// Using Iterator method.
		 Iterator it=myset.iterator();
		 while(it.hasNext()) {
			 System.out.println("Printing all elements in Set Collection using Iterator method : "+it.next());
		 }
		 
		 // Clearing all elements in Set method.
		 myset.clear();
		 
		 
		 // Checking elements present in Hash set Collection.
		  System.out.println("Checking the elements present in set Collection : " +myset.isEmpty());
	}

}
