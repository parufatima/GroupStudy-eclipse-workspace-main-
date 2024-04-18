package Day1;

public class DataType {

	public static void main(String[] args) {
		String name = "Eyana";
		//length of the string
		
		System.out.println(name.length());
		
		// print any index
		System.out.println(name.charAt(4));
		
		System.out.println(name.contains("y"));
		
		System.out.println(name.contains("Z"));
		
		System.out.println(name.endsWith("a"));
		
		System.out.println(name.startsWith("y"));
		
		System.out.println(name.equalsIgnoreCase("EYANA"));
		
		System.out.println(name);
		
		
		
	//if----else
		
		int x= 70;
		
		int y = 50;
		
		if(x<y) {  //if this condition is then print first value & if this condition is false then print else value
			
			System.out.println("To day is very cold");
		}
		else { System.out.println("This is Nayeem vai fault");
		}
		
		//nested if else
		
		int time = 23;
		
		
		if (time<10) {
			System.out.println("Good morning");
		}
		else if (time<19) {
			System.out.println("Good Day");
		}
		else if(time>35){
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
		
		
		
		
		
		
	}


	}


