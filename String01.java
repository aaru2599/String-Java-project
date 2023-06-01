package Pack01.String;

import java.util.Scanner;

public class String01 {
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.print("please Enter your String:");
String s=sc.nextLine();
sc.close();

	System.out.print("Reverse String is:");
	char[] ch= s.toCharArray(); 
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	
	
	}

}
