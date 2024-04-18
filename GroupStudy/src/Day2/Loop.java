package Day2;

public class Loop {

	public static void main(String[] args) {
		
     //Loop can execute a block of code as long as a specified condition is reached.	
		
		//For loop syntax : for(initialisation ; condition; increment/decrement)
		
		//1. Loops
		//2. Nested Loops
		//For-Each Loop --exclusively used to loop through elements in an array
		
		for(int i = 0; i<20; i++ ) {
			
			System.out.println("first result :" + i+ " ");
		}
		for(int j= 0; j<=20; j++) {
			
			System.out.println( "Second result : " +j);
		}
		//reverse value
		
		for(int k= 20; k>=0; k--) {
			
			System.out.println(k);  // Block of code
		}
		//Concatenation
		
		String a = "My";
		String b = " name";
		String c = " is";
		String d = " Fatima";
		System.out.println(a+b+c+d);
		
		//even number
		
		for(int i =0; i<=25; i= i+2) {
			
			System.out.println(i);
		}
        // odd number 
		
		for(int j=1; j<=25; j=j+2) {
			
			System.out.println(j);
		}
		
		//Nested For Loop--- Loop inside another loop
		
		//Outer Loop
		
		for(int i= 1; i<=3; i++) {
			
			System.out.println("Outer :" + i);
			
			//Inner Loop
			
			for(int j=1; j<=4; j++) {
				
				System.out.println("  Inner :" +j);
			}
		}
		
	}

}
