package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arry :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<=arr.length; i++) {
			System.out.print("Enter the elements at index :"+i);
			 arr [i] =sc.nextInt();
			 methodsForm( arr);
		}
	}
	public static void methodsForm(int arr[]) {
		List<Integer> e= new Vector<Integer>();
        for(int i=0; i<arr.length; i++) {
        	e.add(i);
        }
        
        
        Collections.sort(e);
        System.out.println("Sorted Array is :"+e);
        Collections.reverse(e);
        
        System.out.println("Reverse  arry is :"+e);
        int indexOf = e.indexOf(2);
        System.out.println("Searchig Elements is :"+e.get(indexOf));
        
        System.out.println("maximum elements :"+Collections.max(e));
        System.out.println("maximum elements :"+Collections.min(e));
        System.out.println("Through the list  :");
	}
	
}
