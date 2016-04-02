package AbstractFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args){
		
		FactoryProducer f = new FactoryProducer();
		AbstractFactory af = f.getFactory("letter");
		af.getLetter("vowel");
		af.getNumber("100");
		
	}
}
