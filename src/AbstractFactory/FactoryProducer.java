package AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type){
		
		if(type.equalsIgnoreCase("letter")){
			return new LetterFactory();
		}
		else{
			return new NumberFactory();
		}
		
	}
}
