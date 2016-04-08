package Prototype;

public class Sheep implements Animal {

	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Making a copy of sheep");
		
		Sheep sheepObject = null;
		try {
			sheepObject=(Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
		
	}

	
}
