package Pack01.String;

public class RotationString {

	private static void rotationString(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			System.out.println("They are not rotational String");
		}
		else 
		{
			s1=s1.concat(s2);
			if(s1.indexOf(s2)!=-1) {
				System.out.println("They are  rotational String");
			}
			else {
				System.out.println("They are not rotational String");
			}
			
		}
	
	}
	public static void main(String[] args) {
		String s1="Arvind";
		String s2="dnivrA";
		rotationString(s1,s2);
	}
}
