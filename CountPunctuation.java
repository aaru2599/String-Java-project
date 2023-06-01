package Pack01.String;

public class CountPunctuation {
	void punctuation(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(ch==','||ch=='.'||ch=='!'||ch=='*') {
				count++;
			}
				
			
		}
		System.out.println(count);
		
				
		
	}
	public static void main(String[] args) {
		CountPunctuation cp=new CountPunctuation();
		cp.punctuation("Hello.My,name!is*Arvind.....");
	}
}
