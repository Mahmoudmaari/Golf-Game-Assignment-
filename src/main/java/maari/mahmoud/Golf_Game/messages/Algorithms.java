package maari.mahmoud.Golf_Game.messages;

import maari.mahmoud.Golf_Game.date.Input_int;

public class Algorithms {
	public static int Velocity_input (int velocity ) {
		
		System.out.println("put the shot speed");
		velocity= Input_int.powerAndAngel();
		
		return velocity;
	}
	public static int Angle_input(int angle) {
		System.out.println("put the angle");
		angle= Input_int.powerAndAngel();
		return  angle;
	}
	
	
	}


