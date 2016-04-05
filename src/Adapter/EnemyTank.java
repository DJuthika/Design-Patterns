package Adapter;

public class EnemyTank implements EnemyInterface {

	@Override
	public void fireWeapons() {
		// TODO Auto-generated method stub
		int damage = 10;
		System.out.println("Tank damage is " + damage );
		
		
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		int distance = 20;
		System.out.println("Tank can move a distance of" + distance);
		
	}

	@Override
	public void aimAtObject() {
		// TODO Auto-generated method stub
		int accuracy = 80;
		System.out.println("Tank has an aiming accuracy of "+accuracy);
		
	}

}
