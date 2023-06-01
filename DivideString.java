package Pack01.String;

public class DivideString {

	private static void divideString(String s, int num) {
		int temp=0;
		int len=s.length(); 
		int word=len/num;
		
		String []str=new String[num];
		if(len%num!=0) {
			System.out.println("We cant divide this string into "+num+" Parts");
		}
		else {
			for(int i=0;i<len;i=i+word) {
				String part	=s.substring(i,i+word);
				str[temp]=part;
				temp++;
			}
			System.out.print("Euals part of String is: ");
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		String s="aaaabbbbcccc";
		int num=3;
		divideString(s,num);
	}
}
