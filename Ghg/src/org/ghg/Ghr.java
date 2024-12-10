package org.ghg;

public class Ghr {
	public static void main(String[] args) {
		
		String input = "Silent Patient";

        // Create a char array to store the reversed string
        char[] reversed = new char[input.length()];

        // Reverse the string manually
        for (int i = 0; i < input.length(); i++) {
            reversed[i] = input.charAt(input.length() - 1 - i);
        }

        // Convert the reversed char array back to a string
        String reversedString = new String(reversed);

        // Print the reversed string
        System.out.println(reversedString);

        // Print each character on a new line
        for (char c : reversedString.toCharArray()) {
            System.out.println(c);
        }
			
		
	}
}


