package Factory;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;


public class RoomMain {
	
	public static void main(String[] args) throws IOException{
		
	Room r;	
	Scanner s = new Scanner(System.in);
	System.out.println("What do you want to do?");
	String answer = s.nextLine();
	if(answer.equals("sleep")){
		r = new Bedroom();
	}else{
		r = new Kitchen();
	}
	
	r.lookAround();
	
	}
}
