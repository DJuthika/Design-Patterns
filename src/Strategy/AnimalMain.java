package Strategy;

public class AnimalMain {
		
	public static void main(String[] args){
		
		Animals dog = new Dog();
		Bird bird = new Bird();
		dog.setName("Scooby");
		dog.setSize("Small");
		bird.setName("Tweety");
		bird.setSize("Tiny");
		System.out.println("I am a "+dog.getSize()+" dog. "+"My name is "+dog.getName());
		dog.getFly();
		System.out.println("I am a "+bird.getSize()+" bird. "+"My name is "+bird.getName());
		bird.getFly();
	}
}
