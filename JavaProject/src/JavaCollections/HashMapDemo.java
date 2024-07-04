package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration of HashMap.
		Map mymap=new HashMap();
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); // In sqaure bracs we use keys type and values type.
		
		// Adding pairing
		hm.put(101, "Sunil");
		hm.put(102, "Peram");
		hm.put(103, "Welcome");
		hm.put(104, "Java");
		hm.put(101, "Python"); // Here Keys duplication is allowed.
		
		System.out.println(hm); //{101=Python, 102=Peram, 103=Welcome, 104=Java}. Duplicates are allowed.But it will rewrite the old ones with latest.
		
		// Size of Hashmap.
		
		System.out.println("Size of HashMap : "+hm.size()); //3
		
		// Removing the pair.
		
		hm.remove(103);
		System.out.println("Printing the HashMap after removing the pair : " + hm);; // {101=Python, 102=Peram, 104=Java}
		
		// Accessing the value of key.
		
		System.out.println(hm.get(102));// 102 is key. Its value is Peram.
		
		// Get all the keys from HashMap,
		
		System.out.println("Printing all the keys in HashSet : "+ hm.keySet()); // [101, 102, 104]
		
		// Get all the values from HashMap.
		
		System.out.println("Printing all the values in HashSet : "+ hm.values()); // [Python, Peram, Java]
		
		 // Get all the pairs in HashMap.
		
		System.out.println("Printing all the values in HashSet : "+ hm.entrySet()); //[101=Python, 102=Peram, 104=Java]
		
		// Reading all the data from HashMap.
		
		// Using Enhanced for loop.
		 for (int k:hm.keySet()) {
			 System.out.println("Reading all the date fron HashSet : "+k+"   "+hm.get(k));
		 }
		
		// Using Iterator
		 
		 Iterator<Entry<Integer,String>> it=hm.entrySet().iterator(); // It will Entry type of Integer String
		  while(it.hasNext()) {
			  //Entry entry=it.next();
			  System.out.println(it.next()); // Entry is combination of Key and Variable.
			  //System.out.println(entry.getKey()+"   "+entry.getValue());
			}
		  
		  //Clearing all the Hashmap
		  
		  hm.clear();
		  
		  // Checking elements present in Hashmap.
		  
		  System.out.println(hm.isEmpty());
		
		

	}

}
