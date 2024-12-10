package org.ghg;

public class ReverseSen {
	
	public static void main(String [] args) {
		
		String input = "I love india";
		
		System.out.println("The input string  is - "+ input);
		
		String output = reverseSentense(input);
		
		System.out.println(output);
		
	}

	private static String reverseSentense(String input) {
		// TODO Auto-generated method stub
		String[] words = input.split(" ");
		
		String output ="";
		for(int i = words.length-1; i>=0; i--) {
			
			output = output + words[i]+" ";
		}
		return output;
	}

}
