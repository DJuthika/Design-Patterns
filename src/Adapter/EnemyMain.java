package Adapter;

public class EnemyMain {

	public static void main(String[] args){
		
		EnemyRobot robot = new EnemyRobot();
		EnemyTank tank = new EnemyTank();
		EnemyRobotAdapter adaptedRobot = new EnemyRobotAdapter(robot);
		
		
		System.out.println("This is the robot: ");
		robot.fireGun();
		robot.flyHigh();
		robot.swirl();
		
		
		System.out.println();
		
		System.out.println("This is the tank: ");
		tank.fireWeapons();
		tank.moveForward();
		tank.aimAtObject();
		
		System.out.println();
		
		System.out.println("This is the robot adapting as a tank but still being a robot! Whoa! ");
		adaptedRobot.fireWeapons();
		adaptedRobot.moveForward();
		adaptedRobot.aimAtObject();
	}
}
