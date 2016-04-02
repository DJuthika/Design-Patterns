package AbstractFactory;

public class Num extends NumberFactory{
	
	int val;
	public Num(int val){
		this.val = val;
	}
	public int getValue(){
		return this.val;
	}
	
	public void getNumber(){
		System.out.println("I am a number, my value is"+this.getValue());
	}

}
