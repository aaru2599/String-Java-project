package Pack01.String;

import java.util.Arrays;

public class AnagramString1 {
	private static void anagramString(String s1, String s2) {
		String str1=s1.toLowerCase();
		String str2= s2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Not An Anagram");
		}
		else {
			char[] ch1=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram string");
			}
			else {
				System.out.println("Not An Anagram");
			}
		}
	
	}
	public static void main(String[] args) {
		String s1="prasoon";
		String s2= "prasoon";
		anagramString(s1,s2);
	}

}
