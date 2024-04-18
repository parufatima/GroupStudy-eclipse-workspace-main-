package Day2;

import java.util.HashSet;

public class HashSet_HashMap {

	public static void main(String[] args) {
		//HashSet syntax
		// Do not support duplicate value and index
		
		HashSet<String> name = new HashSet<String>();
		
		//To add item we use .add();
		
		name.add("Nazim");
		name.add("Mustafiz");
		name.add("Salma");
		name.add("Atika");
		name.add("Farzana");
		name.add("Atika");
		name.add("Atika");
		
		System.out.println(name);
		
		//To check an item exist or not  .contains()
		
		//name.contains("Salma");
		
		System.out.println(name.contains("Salma"));
		
		System.out.println(name.contains("Any name"));
		
		
		//To Remove an item
		
		name.remove("Salma");
	
		System.out.println(name);
		
		//To remove all items .clear()
		
		//name.clear();
		//System.out.println(name);
		
		//To find out how many items there .size()
		
		System.out.println(name.size());
		
		//For-each loop
		
		for(String i:name) {
			System.out.println(i);
		}
		
		
		
	}

}
