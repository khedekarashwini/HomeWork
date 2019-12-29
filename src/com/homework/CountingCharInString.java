package com.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountingCharInString {

	   public static void CountChar(String inputString)
	   {
		     HashMap<Character, Integer> hm=new HashMap<>();
		     char ch[] =inputString.toCharArray();
		     for (int i = 0; i < ch.length; i++) 
		{
		    	 char c=ch[i];
		    	 if(hm.containsKey(c))
		    	 {
		    		 hm.put(c,hm.get(c)+1);
		    		 
		    	 }
		    	 else
		    	 {
		    		 hm.put(c, 1);
		    	 }
			}
		     
		   for(Map.Entry<Character, Integer> entry:hm.entrySet())
		   {
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
	   }
	
	
	
	
	public static void main(String[] args) {
	   String s1="iamananta";
	   CountChar(s1);

	}

}
