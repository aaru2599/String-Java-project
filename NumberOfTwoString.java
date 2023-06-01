package Pack01.String;

public class NumberOfTwoString {
	static int countString(String s1, String s2) {
		String str=s1+s2;
		System.out.println("new String: "+str);
		System.out.println("String Size: "+str.length());
		
		return 0;
		
	}
	public static void main(String[] args) {
		String s1="Arvind";
		String s2="Mandre";
		countString(s1,s2);
				
	}
	
}
