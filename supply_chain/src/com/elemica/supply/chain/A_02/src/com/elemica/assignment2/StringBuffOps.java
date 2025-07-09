// QN 10

package com.elemica.assignment2;

public class StringBuffOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuf = new StringBuffer("AMAAN SAJID");
		
		int indOfSpace = strBuf.indexOf(" ");
		
		strBuf.append(",");
		strBuf.append(strBuf.substring(0, indOfSpace));
		strBuf = new StringBuffer(strBuf.substring(indOfSpace + 1, strBuf.length()));
		
		System.out.println(strBuf);
		
		int indOfComma = strBuf.indexOf(",");
		
		strBuf.append(" ");
		strBuf.append(strBuf.substring(0, indOfComma));
		strBuf = new StringBuffer(strBuf.substring(indOfComma + 1, strBuf.length()));
		
		System.out.println(strBuf);
		
		
	}

}
