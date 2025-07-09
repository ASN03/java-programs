//	QN 5-9
package com.elemica.assignment2;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AMAAN";
		int len = str1.length();
		
		String strRev = "";
		for(int i = len - 1; i >= 0; i--) {
			strRev += str1.substring(i, i+1);
		}
		
		System.out.println("reversed string: " + strRev);
		
		
		int[] freq = new int[26];
		
		for(int i = 0; i < len; i++) {
			freq[str1.charAt(i) - 'A']++;
		}
		
		System.out.println("Letters frequency (if non-zero)");
		String noDupes = "";
		for(int i = 0; i < 26; i++) {
			if(freq[i] > 0) System.out.println("frequency of " + (char)('A' + i) + " is: " + freq[i]);
		}
		
		for(int i = 0; i < len; i++) {
			if(freq[str1.charAt(i) - 'A'] > 0) {
				noDupes += str1.substring(i,i+1);
				freq[str1.charAt(i) - 'A'] = 0;
			}
		}
		
		System.out.println("Without duplicates: " + noDupes);
		
		String str2 = "aaabbccd";
		
		String compressed = "";
		int cnt = 1;
		String letter = str2.substring(0, 1);
		
		for(int i = 1; i < str2.length(); i++) {
			if(str2.charAt(i) == str2.charAt(i-1)) {
				cnt++;
			}
			else {
				compressed += letter + String.valueOf(cnt);
				letter = str2.substring(i, i+1);
				cnt = 1;
			}
		}
		compressed += letter + String.valueOf(cnt);
		
		System.out.println("Compressed string is: " + compressed);
		
		
		String email = "john.doe@gmail.com";
		int indOfAt = email.indexOf('@');
		System.out.println("Domain is: " + email.substring(indOfAt + 1, email.length()));
		
		
		
	}
	
	
	

}
