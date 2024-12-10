package org.ghg;

public class Setriin {
	public static void main(String [] args) {
		
		String s ="silent patient";
				String[] spl = s.split(" ");
		String ss = spl[1];
		String sec = spl[0];
		for(int j=sec.length()-1; j>=0; j--) {
			System.out.print(sec.charAt(j));
		}
		System.out.println();
		for(int i=ss.length()-1; i>=0; i--) {
			System.out.println(ss.charAt(i));
		}
		
	}

}
