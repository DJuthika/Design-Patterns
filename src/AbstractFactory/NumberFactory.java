package AbstractFactory;

public class NumberFactory extends AbstractFactory {

	int value;
	@Override
	Letter getLetter(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Num getNumber(String limit) {
		// TODO Auto-generated method stub
		if(limit=="100"){
			return new Num(10);
		}
		return null;
	}

}
