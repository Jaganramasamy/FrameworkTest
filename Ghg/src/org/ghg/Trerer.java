package org.ghg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trerer {
	
	public static void main(String[] args) {
		
		String s= "Jagan";
		
		char[] ch = s.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for(int i=0; i< s.length(); i++) {
			if(mp.containsKey(ch[i])) {
				Integer value = mp.get(ch[i]);
				mp.put(ch[i],value+1);
			}else {
				mp.put(ch[i],1);
			}
			Set<Entry<Character, Integer>> entrySet = mp.entrySet();
			for(Entry<Character, Integer> e : entrySet) {
				System.out.println(e);
				
			}
			
		}
	}

}
