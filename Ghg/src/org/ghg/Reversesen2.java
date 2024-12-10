package org.ghg;

public class Reversesen2 {
	
	public static void main(String [] args) {
		
		String input ="I love you";
		
		System.out.println("the input value is-"+  input);
		String output = reverseSent(input);
		
		System.out.println(output);
		
	}

	private static String reverseSent(String input) {
		// TODO Auto-generated method stub
		String[] words = input.split(" ");
		String output ="";
		
		for(int i = words.length-1; i>=0; i--) {
		
			output = output + words[i]+ " ";
			
		}
		
		return output;
	}

}
