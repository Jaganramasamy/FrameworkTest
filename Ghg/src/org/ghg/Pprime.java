package org.ghg;

public class Pprime {

	public static void main(String [] args) {
		
		int n=3;
		int i =2;
		boolean prime = false;
		while (n>0) {
			
			
		while(n>i) {
			
			if(n%i==0) {
				System.out.println("Not prime");
				prime = false;
			}
			i++;
			if(prime == true) {
				System.out.println("It is prime number");
				n=n+2;
			}
		}
		}
	}
}
