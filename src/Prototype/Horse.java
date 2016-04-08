package Prototype;

public class Horse implements Animal{

	@Override
	public Animal makeCopy() {
		System.out.println("Making copy of a horse");
		Horse horseObject = null;
		try {
			horseObject = (Horse)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return horseObject;
	}

}
