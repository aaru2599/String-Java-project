package Pack01.String;

public class StringReverse {

	void stringRev(String s)
	{
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--) {
			char ch= s.charAt(i);
			s1=s1+ch;
			
			
		}
		System.out.println(s1);
		
	}
	public static void main(String[] args) {
		StringReverse sr= new StringReverse();
		sr.stringRev("Hello Prasoon");
	}
}
