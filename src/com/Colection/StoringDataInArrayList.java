package com.Colection;

import java.util.ArrayList;

public class StoringDataInArrayList {

	

	public static <Iterator> void main(String[] args) {
		
		ArrayList al = new ArrayList (); //if we want to only add integer value in array we use   ArrayList<Integer> al = new ArrayList<Integer> ();
		
		al.add(7);
		al.add("string as an object in list");
		al.add(true);
		
		//System.out.println(al);
		
		al.add(9);
		al.add(9); // here adding duplicate value in array list. arraylist allow to store duplicate value
		al.add("it's not data type it's storing as an object in array list");
		al.add(false);
		 //System.out.println(al); //printing all the value 
		
		//System.out.println(al.size()); //it will define number of value stored in array list
		//System.out.println(al.get(6)); //remember array list start from 0 . so first value store in number 0
		
		//al.remove(6);
		//System.out.println(al); //in this printout number 6 data is removed from the list
		
		//System.out.println("use for loop to get all the data ");
		
		/*for (int i=0; i< al.size(); i++) { // we use this for loop to call the data easily from array list like how much data we want to call full or some data
			System.out.println(al.get(i));
		}*/
		
		/*for (Object obj:al) {
			System.out.println(obj);
		} */ 
	   java.util.Iterator itr = al.iterator();
	  while (itr.hasNext())
				{
			System.out.println(itr.next());
			
		}
	}

	

		
	

}
