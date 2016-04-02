package AbstractFactory;

public class Letter extends LetterFactory{

	String name;
	String type;
	public Letter(String l,String type){
		super();
		this.name = l;
		this.type = type;
	}
	public void getLetter(){
		System.out.println("I am "+this.getName()+" And I am a "+this.getType());
		
	}
	public String getName(){
		return this.name;
	}
	public String getType(){
		return this.type;
	}
}
