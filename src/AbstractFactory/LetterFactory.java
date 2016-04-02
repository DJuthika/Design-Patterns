package AbstractFactory;

public class LetterFactory extends AbstractFactory {

	int value;
	@Override
	Letter getLetter(String type) {
		// TODO Auto-generated method stub
		if(type.equals("vowel")){
			
			return new Letter("A","vowel");
			
		}
		return null;
		
	}

	@Override
	Num getNumber(String limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
