package Pack01.String;



public class SplitString {
	public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       //String s= scan.next();
		String s="hello1-123";
        String s1="";
        String s2="";
        int i=0;
        ///scan.close();
        
        
        //String s= Integer.toString(a);
        for(i=0;i<s.length();i++){
           char ch= s.charAt(i);
           if(ch>='0'&& ch<'9')
           s1=s1+ch;
           if(ch>='a'&&ch<='z')
           s2=s2+ch;
           
        }
        System.out.println("a"+s);
        System.out.println(s1);;
        System.out.println(s2);
        // Complete this line
        // Complete this line
    }

}
