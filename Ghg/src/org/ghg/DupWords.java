package org.ghg;

public class DupWords {
	
	public static void main(String [] args) {
		
		String s ="bit black jagan Bash back bash";
		
		int count;
		String ss = s.toLowerCase();
		
		//char[] ch = ss.toCharArray();
		String[] ch = ss.split(" ");
		
		for(int i=0; i<=ch.length-1; i++) {
			
			count =1;
			
			if(ch[i]!="0") {
				for(int j= i+1; j<ch.length-1; j++) {
					if(ch[i].equals(ch[i])) {
						count++;
						ch[j]="0";
					}
					
					
				}
				
			}
			if(count>1) {
				System.out.println(ch[i]);
			
		}
		
		}
	}

}
