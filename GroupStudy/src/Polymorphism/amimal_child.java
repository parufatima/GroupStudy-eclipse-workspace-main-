package Polymorphism;

public class amimal_child extends animal{

	public static void main(String[] args) {       
		                                             // Java Method Overriding  

		animal  myAnimal  = new animal();
		
		Dog  dog = new Dog();
		
		Tiger tiger = new Tiger();
		
		myAnimal.animalSound();
		
		dog.animalSound();
		
		tiger.animalSound();
		
		

	}

}
