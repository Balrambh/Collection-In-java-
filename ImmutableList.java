package com.arraylist.arraylistdemo;

import java.util.List;

public class ImmutableList {

	public static void main(String[] args) 
	{
		List<Integer> listOfNumber = List.of(1,2,3,4,5,6);		
		listOfNumber.set(0,100); //java.lang.UnsupportedOperationException
		listOfNumber.add(7); //java.lang.UnsupportedOperationException
		listOfNumber.remove(0); //java.lang.UnsupportedOperationException
	}

}