package com.Colection;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 7;
		Integer int1 = new Integer (i); //Here Integer is a class which is used to wrap and unwrap the the data 
		System.out.println(int1);  // wrapping or auto boxing data type
		
		int j = int1;    //unwrapping or auto unboxing data here
		System.out.println(j);
	}

}
