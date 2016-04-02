package Strategy;

public class Dog extends Animals{
	
	public void dig(){
		System.out.println("I can dig holes");
	}
	
	public Dog(){
		super();
		this.flyingType = new CantFly();
	}
	
	
}
