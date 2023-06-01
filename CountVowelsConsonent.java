package Pack01.String;

public class CountVowelsConsonent {
	void vowels(String st) {
		String s=st.toLowerCase();
		int vowcount=0;
		int conCount=0;
		for(int i= 0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowcount++;
			}
			else if(ch>='a'&&ch<='z') {
				conCount++;
				
				
			}
			
		}
		
		System.out.println("No of vowels is: "+vowcount);
		System.out.println("No of Consonent is:"+conCount);
	}
	public static void main(String[] args) {
		new CountVowelsConsonent().vowels("Savan:11!  ");
	}

}
