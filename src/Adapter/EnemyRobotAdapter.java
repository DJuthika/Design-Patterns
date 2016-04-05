package Adapter;

public class EnemyRobotAdapter implements EnemyInterface {

	EnemyRobot robot;
	public EnemyRobotAdapter(EnemyRobot robot){
		this.robot = robot;
	}
	@Override
	public void fireWeapons() {
		// TODO Auto-generated method stub
		robot.fireGun();
		
	}
	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		robot.flyHigh();
		
	}
	@Override
	public void aimAtObject() {
		// TODO Auto-generated method stub
		robot.swirl();
		
	}
	
	
}
