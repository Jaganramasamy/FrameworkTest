package org.ghg;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cherr {
	public static void main(String[] args) {

		String string = "associate";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());

    }
}