package org.ghg;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FreqNum {
public static void main(String [] args) {
	
	int arr[]= {1,4,9,1,2,5,4,9,9,3,7,7,7,7};
	
	HashMap<Integer,Integer> hm= new HashMap<>();
	
	for(int i=0; i<=arr.length-1; i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
			
		}else {
			hm.put(arr[i],1);
			
		}
	}
	Set<Entry<Integer, Integer>> ss = hm.entrySet();
	for(Entry<Integer, Integer> s:ss) {
		System.out.println("Element | Frequency");
		
		System.out.println(s.getKey()+"         "+s.getValue());
	}
}
}