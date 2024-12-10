package org.ghg;

public class Fffi {
public static void main(String[] args) {
	
	int firstnumber=0;
	int secondnumber=1;
	int temp;
	
	for(int i=0;i<=70;i++) {
		temp = firstnumber+secondnumber;
		firstnumber= secondnumber;
		secondnumber= temp;
		System.out.println(temp);
	}
}
}
