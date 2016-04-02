package Singleton;

public class Singleton {
	
	static Singleton instance;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void addNumbers(){
		System.out.println("2+3=5!");
	}
	
	
}
