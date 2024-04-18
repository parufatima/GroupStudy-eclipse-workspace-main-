package Day2;

import java.util.HashSet;

public class HashSetInteger {

	public static void main(String[] args) {
		
		HashSet<Integer> number = new HashSet<Integer>();
		
		 number.add(11);
		 number.add(15);
		 number.add(45);
		 number.add(84);
		 number.add(18);
		 number.add(20);
		
		 System.out.println(number);
		 
		 //show which numbers between 10 to 20
		 
		 
		 for(int i =10; i<=20; i++) {
			 
			 if (number.contains(i)) {
				 System.out.println(i + "found in the Hashset.");
			 }
			 else {
				 System.out.println(i + "not found in the Hashset.");
			 }
		 }
	}

}
