// questions 1 and 2

package com.elemica.assignment2;

public class ArraySort {

	public static void main(String[] args) {
		// TODO sort on a given (non-input) array.
		
		
		int[] arr = {10, 4, 3, 6, 7, 28, 90, 12, 13, 56};
		int sz = arr.length;
		
		System.out.print("Ascending order: ");
		for(int i = 0; i < sz; i++) {
			int min = arr[i];
			for(int j = i + 1; j < sz; j++) {
				if(arr[j] < min) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
			System.out.print(arr[i]);
			if(i < sz - 1) System.out.print(", ");
		}
		System.out.println();
		System.out.print("Descending order: ");
		for(int i = sz - 1; i >=0; i--) {
			System.out.print(arr[i]);
			if(i > 0) System.out.print(", ");
		}
		System.out.println();
		System.out.println("Third highest number is " + arr[sz-3]);
		System.out.println("Second lowest number is " + arr[1]);
		
		
		
	}

}
