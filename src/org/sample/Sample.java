package org.sample;

public class Sample {

	public static void main(String[] args) {

		String str = "Hai Iam Abi";
		String res = "";

		String[] sp = str.split(" ");
		
		for (String s : sp) {
			String rev = "";
			

			for (int i = s.length() - 1; i >= 0; i--) {

				char c = s.charAt(i);
				rev = rev + c;
				
				
			}

			
			res=res+rev+" ";
			
		}
		System.out.println(res.trim());
		
	}
}