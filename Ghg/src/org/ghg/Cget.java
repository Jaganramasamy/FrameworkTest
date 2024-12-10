package org.ghg;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cget {

	public static void main(String [] args) {
		
		String s = "associatrrsot";
		
		char[] ch = s.toCharArray();
		
		Set<Character> chr= new LinkedHashSet<>();
		
		for(Character c :ch) {
			chr.add(c);
		}
		StringBuilder sb= new StringBuilder();
		
		for(Character charset : chr) {
		
		sb.append(charset);
		sb.toString();
		
		
		}	
		System.out.println(sb);
	}

}
