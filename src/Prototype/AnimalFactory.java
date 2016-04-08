package Prototype;

public class AnimalFactory {

	Sheep sheep = new Sheep();
	Dog dog = new Dog();
	Horse horse = new Horse();
	Animal toReturn=null;
	
	public Animal create(Animal getCopy){
		
		
		
		
		if(getCopy.getClass() == sheep.getClass()){
			return sheep.makeCopy();
		}
		else if(getCopy.getClass() == dog.getClass()){
			return dog.makeCopy();
		}else{
			return horse.makeCopy();
		}
		
	}
	
}
