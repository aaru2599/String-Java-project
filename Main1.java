package Pack01.String;

class Main1 {
	
	private static void palindronString(String str) {
		String new1="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			new1=new1+ch[i];
			//System.out.println(new1);
			
		}
		if(new1.equals(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

		
	}
    public static void main(String args[]) {
    	String str="ollo";
     palindronString(str);
    	
    }
}