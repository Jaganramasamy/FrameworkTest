package org.ghg;

public class Asdng {

	public static void main(String[] args) {
		int ar[] = {50,42,89,2,69};
		int temp =0;
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=i+1; j<=ar.length-1; j++) {
				if(ar[i]>ar[j]) {
					
					temp= ar[i];
					ar[i]= ar[j];
					ar[j]= temp;
					
				}
			}
			System.out.println(ar[i]);
		}
		
	}
}
