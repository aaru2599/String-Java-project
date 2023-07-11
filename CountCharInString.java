package Pack01.String;

public class CountCharInString {
	public static void main(String[] args) {
		String s="This is a Character count program in String";
		int count=0;
		for(int i=0;i<s.length();i++) {
			// char ch= s.charAt(i);
			//if(ch!=0) 
				count++;
			
		}
		System.out.println(count);
	}

}
