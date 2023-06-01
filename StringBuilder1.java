package Pack01.String;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringBuilder1 {

	public static void main(String[]args) {
		StringBuilder s= new StringBuilder("");
		//s.deleteCharAt(2);

	//	s.insert(2, "va");


		System.out.println(s);
//		System.out.println(s.subSequence(3, 4));
//		System.out.println(s.substring(2));
//		System.out.println(s.deleteCharAt(3));
//		//System.out.println(s.delete(1, 3));
//		System.out.println(s.append(" Khedekar "));
//		System.out.println();
//		s.setCharAt(1, 'v');
//		System.out.println(s);
//		//System.out.println(s.offsetByCodePoints(4,7));
		//		System.out.println(s.codePointBefore(3));
		//		s.setLength(9);
		//		System.out.println(s);
//		s.trimToSize();
//		System.out.println(s);
//		s.append("anbd");
//		System.out.println(s);
//		s.ensureCapacity(8);
//		
//		System.out.println(s);
		System.out.println(s.capacity());
	}

}