package Pack01.String;

import java.util.Scanner;

public class EmpDetails {
	int empNo;
	String name;
	float sal;
	 EmpDetails(int empNo,String name,float sal) {
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
	 
	 }
	 public String toString() {
		 return empNo+"\t"+name+"\t"+sal;
	 }

	 class Demo{
		 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter employee Number: ");
			int empNo=sc.nextInt();
			System.out.println("Enter Employee name: ");
			String name=sc.next();
			System.out.println("Enter employee salary: ");
			float sal= sc.nextFloat();
			sc.close();
			EmpDetails e= new EmpDetails(empNo,name,sal);
			System.out.println(e);
			
		}
	 }

}
