package Day2;

import java.util.ArrayList;

public class ArrayList_normal {

	public static void main(String[] args) {
		
		//NOn-Generic ArrayList
		
				ArrayList cities = new ArrayList<>();
				
				// To add value  .add()
				
				cities.add("Dhaka");
				cities.add('A');
				cities.add(234);
				cities.add(45.50);
				cities.add("Florida");
				cities.add("Chittagong");
				cities.add("Ny");
				
				System.out.println(cities);
				
				cities.set(5, "Taxes");
				
				System.out.println(cities);
				
        // we can use only normal for loop 
				// for Loop
				
				for(int i= 0; i<cities.size(); i++) {
					
					System.out.println(cities.get(i));
				}
				
	}

}
