package Pack01.String;

import java.util.Scanner;

public class ArrayFromUser {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter number of elements for an array:");
		int n=sc.nextInt();
		int a[]=new int [n];
		
		System.out.print("Enter Array elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		
		
		}
		sc.close();
		System.out.print("Arrays elements are: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}
		
		
	}
}
