package com.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		    hm.put(101, "A");
		    hm.put(102, "B");
		    hm.put(103, "C");
		    hm.put(104, "A");
		    hm.put(105, "E");
		    hm.put(null, "Q");
		    
  System.out.println("1st way Using Iterator");	
  Iterator ltr=hm.entrySet().iterator();
  while (ltr.hasNext()) {
	Map.Entry<Integer, String> entry =  (Entry<Integer, String>) ltr.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
     }
  
  
  System.out.println("2nd way Using Foreach");
  for(Map.Entry<Integer, String> entry1:hm.entrySet())
  {
	  System.out.println(entry1.getKey()+" "+entry1.getValue());
  }

	
	System.out.println("3rd way Using Lambda Expression");
	hm.forEach((K,V) ->
	{
		System.out.println(K+" "+V);
	});
	
	
	System.out.println("4th way Iterating on key & get value");
	      for (Integer key : hm.keySet()) {
	    	  System.out.println("Key...."+key);
	    	  System.out.println("Values..."+hm.get(key));
			
		}
	
	System.out.println("5th way Iterating seprate key & value");
	
	  for (Integer key : hm.keySet()) {
		  
		System.out.println(key);
	   }
	  
	  for(String value:hm.values())
	  {
		  System.out.println(value);
	  }
	  
	}


}
