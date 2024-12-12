package org.ghg;

public class Dup {

	public static void main(String args[]) {
		
		String s ="Jagan Ramasamy hrushikesh";
		
		char[] ch = s.toCharArray();
		
		System.out.println("Duplicate characters in a given array");
		
		for(int i=0; i<= ch.length-1; i++) {
			if(ch[i]=='0') 
				continue;
			
	
			for(int j=i+1; j< ch.length-1; j++){
				
				if(ch[i]==ch[j]) {
					System.out.print(ch[i]+" ");
					ch[j]= '0';
				}
			
			
			}
		}
	}
}
