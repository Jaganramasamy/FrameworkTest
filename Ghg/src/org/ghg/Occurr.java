package org.ghg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurr {
public static void main(String[] args) {
	
	String s ="Jagan Rewres";
	
	char[] ch = s.toCharArray();
	Map<Character,Integer> m= new LinkedHashMap<>();
	for(int i = 0; i<s.length();i++) {
		if(m.containsKey(ch[i])) {
			Integer value = m.get(ch[i]);
			m.put(ch[i], value+1);
			
					
		}else {
			m.put(ch[i], 1);
		}
	}
	Set<Entry<Character, Integer>> entrySet = m.entrySet();
	for(Entry<Character,Integer> x: entrySet) {
		System.out.println(x);
	}
	
			
			
	
}
}
