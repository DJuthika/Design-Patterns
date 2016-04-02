package Factory;

public abstract class Room {
	
	
	String name;
	String size;
	String furniture;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	
	public abstract void lookAround();
}
