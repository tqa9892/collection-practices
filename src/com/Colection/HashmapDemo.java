package com.Colection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String> ();
		hm.put("name", "Sabbir");
		hm.put("First name", "Sabbir");
		hm.put("Middle Name", "Ahmed");
		hm.put("Last name", "Ripon");
		hm.put("Learing", "http://qa.com");
		
		//System.out.println(hm);
		
		hm.remove("name");
		
		//System.out.println(hm);
		 // this will provide all key set from the heshmap than it will be easier to do for loop or iterate 
		
		/*for (String key:hm.keySet()) // this is another method is called foreach loop 
		{
			System.out.println("the key is "+ key +"  value is "+ hm.get(key));
		}  */
		
		Set s=hm.keySet();
		Iterator<String> it = s.iterator(); // this method is called iterator method
		while (it.hasNext())
		{
			String key =it.next();
			System.out.println("the key is "+ key +"  value is "+ hm.get(key));
		}
		
		
	}

}
