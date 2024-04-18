package Day2;

import java.util.ArrayList;

public class ArraysArrayList {

	public static void main(String[] args) {
		
		// Array are used to store multiple value in a single variable,instead of declaring separate variables for each value
     //Syntax of array : String [] name = {};/ int[]number = {};
	// Fixed size
	//Same data type
	// Index start from 0	
	//1. Access the elements 
	//2.Change an Array elements
	//3.length
	//Loop through an Array	
		
		
		String [] name = {"Atika", "Nazim","Rahaman","Salma","Eayna","Atika"};
		
		//Array Length 
		System.out.println(name.length);
		
		//Access the elements of an Array
		
		System.out.println(name[2]);
		
		//Change an Array element
		
		System.out.println(name[0]);
		
		name[0]= "Lamia";
		
		System.out.println(name[0]);
		
		//for-each Loop     / enhance Loop
		
		// we can normally use this for Array/ArrayList(generic)
		
		for(String student : name) {
			
			System.out.println("All student :" + student);
		}
		
		
			
		
	//ArrayList  --1.Normal/regular ArrayList ---multiple data type	. 2. Generic ArrayList -- single data type
		//1. To add value  .add()
		//2. To access an element .get()
		//3. To change an item .set()
		//4. To remove an item .remove()
		//5. To clear all the elements .clear()
		//6. To get the total number of elements .size()
		//Loop  ... For Loop/ For-each Loop
		
		//Generic ArrayList
		
		ArrayList<String> cities = new ArrayList<String>();
		
		// To add value  .add()
		
		cities.add("Dhaka");
		cities.add("London");
		cities.add("Zurich");
		cities.add("Dallas");
		cities.add("Florida");
		cities.add("Chittagong");
		cities.add("Ny");
		
		System.out.println(cities);
		
		// To access an element .get()
		
		System.out.println(cities.get(2));
		
		//To change an item .set()
		
		cities.set(1, "Geneva");
		System.out.println(cities);
		
		System.out.println("Before remove :" +cities.size());
		
		//To remove an item .remove()
		
		cities.remove(2);
		
		System.out.println(cities);
		
		//To get the total number of elements .size()
		
		System.out.println("After remove :" + cities.size());
		
		/*To clear all the elements .clear()   
		
		cities.clear();
		
		System.out.println(cities);//  []
		System.out.println("After clear :" + cities.size()); // 0*/
		
		// To check any element contains or not
		
		System.out.println(cities.contains("Texas")); // false
		
		
		//For -each Loop
		
		for(String a : cities) {
			
			System.out.println(a);
		}
		// Loop
		
		for(int i= 0; i<cities.size(); i++) {
			
			System.out.println(cities.get(i));
		}
		
	}
	

}
