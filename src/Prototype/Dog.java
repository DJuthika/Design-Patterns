package Prototype;

public class Dog implements Animal{

	@Override
	public Animal makeCopy() {
		System.out.println("Making a copy of Dog");
		Dog dogObject = null;
		try {
			dogObject = (Dog)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dogObject;
	}

}
