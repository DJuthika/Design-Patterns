package Singleton;

public class SingletonDemo {
	
	public static void main(String[] args){
		
		
		Singleton s = Singleton.getInstance();
		s.addNumbers();
		//Singleton s1 = new Singleton();
		//The constructor Singleton() is not visible
	}
}
