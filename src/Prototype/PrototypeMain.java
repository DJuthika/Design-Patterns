package Prototype;

public class PrototypeMain {

	public static void main(String[] args){
		
		AnimalFactory factory = new AnimalFactory();
		
		Dog dog = new Dog();
		Animal a1 = factory.create(dog);
		Animal a2 = factory.create(dog);
		
		Horse horse = new Horse();
		factory.create(horse);
		
		System.out.println("Check if the objects are different");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(dog.hashCode());
		
		
	}
}
