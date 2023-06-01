package Pack01.String;

public class String03Methods {
	public static void main(String[] args) {
		
		String name="savan";
		System.out.println(name);
		String email="";
		System.out.println(email.length());
		int i=email.length();
		if(i==0) {
			System.out.println("email is empty");
		}
		else {
			System.out.println("valid");
		}
		
		String ename="   asdfg ";
		String s=ename.trim();
		if(s.length()==0) {
			System.out.println("name is empty");
		}
		else {
			System.out.println("valid name:"+s);
		}

	}
	


}
