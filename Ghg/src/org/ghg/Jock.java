package org.ghg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Jock {

	public static void main(String [] args) {
		String s = "associate";
	char[] ch = s.toCharArray();
	
	Map<Character,Integer> m =new LinkedHashMap<>();
	for(int i =0; i<s.length(); i++) {
		if(m.containsKey(ch[i])) {
			Integer value = m.get(ch[i]);
			
			m.put(ch[i], value+1);
		}else {
			m.put(ch[i], 1);
		}
		
	}
	Set<Character> keySet = m.keySet();
	
	StringBuilder sb = new StringBuilder();
	
//	for(Character c : keySet) {
//		sb.append(ch);
//		
//	}
	String string = sb.toString();
	System.out.println(string);
	
	
	}
}
