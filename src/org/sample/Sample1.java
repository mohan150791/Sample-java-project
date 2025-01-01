package org.sample;

public class Sample1 {
	public static void main(String[] args) {
		String s = "Mohan";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;

		}
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(" This String is a palindrome");
		}
		else {
			System.out.println(" This string is not a palindrome");
		}
	}
	
	

}
