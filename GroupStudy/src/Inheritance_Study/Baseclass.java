package Inheritance_Study;

public class Baseclass {
	
	public static void student1(){
		
		System.out.println("Java is fun");
	}
	
	public void student2() {
		
		System.out.println("We Love our country"); 
		
	}
    
	public static void studentName(String fname , String lname) {
		
		System.out.println(fname + lname);
		
	}
	
	public static void addition(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
	
	public static String student3() {
		
		String fname ="Amreen";
		String lname ="Kamal";
		String fullName = fname+lname;
		System.out.println(fullName);
		
		return fullName;
		
	}
	
	public  int multiplication() {
		
		int a =20;
		int b = 50;
		int c = 400;
		int total= a*b*c;
		System.out.println(total);
		
		return total;
		
	}
}
