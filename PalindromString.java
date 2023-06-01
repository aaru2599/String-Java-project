package Pack01.String;

public class PalindromString {

	private static boolean palindromString(String s){
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		if(str.equals(s)) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String s="abba";
		boolean flag= palindromString(s);
		System.out.println(flag);
	}
	
}
