package Strategy;

public class Animals {
    
	private String name;
	private double weight;
	private String size;
	
	public void setName(String name){
		this.name = name;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public String getName(){
		return this.name;
	}
	public String getSize(){
		return this.size;
	}
	public double getWeight(){
		return this.weight;
	}
	Flys flyingType;
	public void setFly(Flys ability){
		
		this.flyingType = ability;
	}
	public void getFly(){
		
		System.out.println(flyingType.fly());
	}
	public void setSize(String size) {
		// TODO Auto-generated method stub
		this.size = size;
		
	}
}
