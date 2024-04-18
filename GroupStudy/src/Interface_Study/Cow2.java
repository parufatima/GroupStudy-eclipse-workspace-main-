package Interface_Study;

public abstract class Cow2  implements Animal{
	
  public void animalSound() {
	  
	 int a = 40;
	 int b= 60;
	 int c = 29;
	 
	 System.out.println(a+b+c);
		 
	
}

	
	public void animalSleep() {
		
		String fname = "Safwan";
		String lname = "  kamal";
		
		String name = fname+lname;
		
		System.out.println(name);
		
	}
	


public static void main(String[] args) {
	
	Cow2_child  cow2_child  = new Cow2_child();
	
	cow2_child.animalSound();
	cow2_child.animalSleep();
	
}
}
