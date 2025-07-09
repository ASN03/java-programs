//questions 3 - 4

package com.elemica.assignment2;

public class TwoArrays {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		if(len1 != len2 ) System.out.println("Different Arrays");
		else {
			for(int i = 0; i < len1; i++) {
				if(arr1[i] != arr2[i]) {
					System.out.println("Diffent Arrays");
					break;
				}
				
				if (i == len1 - 1) System.out.println("Identical Arrays");
			}
		}
		
		int[] arrMerged = new int[len1 + len2];
		
		for(int i = 0; i < len1; i++) {
			arrMerged[i] = arr1[i];
		}
		for(int i = 0; i < len2; i++) {
			arrMerged[i+len1] = arr2[i];
		}
		
		for(int i = 0; i < len1 + len2; i++) {
			System.out.print(arrMerged[i]);
			if(i != len1 + len2 - 1) System.out.print(", ");
		}
		
	}
	
}
