package AbstractFactory;

public abstract class AbstractFactory {

	abstract Letter getLetter(String type);
	abstract Num getNumber(String limit);
}
