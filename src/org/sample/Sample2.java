package org.sample;

import java.util.Arrays;

public class Sample2 {
	public static void main(String[] args) {
		
		int[] a= {10, 20, 30, 40, 50, 10, 20, 30};//{ 10,10,20,20,30,30,40,50}
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(a[3]);
		System.out.println("Length of an array: "+a[a.length-1]);
		int length = a.length;
		System.out.println(length);
		
		int index= length-1;
		System.out.println(index);
		
		
	}
	
	
	

}
