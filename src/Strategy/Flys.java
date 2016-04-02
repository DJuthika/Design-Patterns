package Strategy;

public interface Flys {
		
	String fly();
	
}
class ItFlys implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String s = "I can fly";
		return s;
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String s = "I can't fly";
		return s;
	}
	
}