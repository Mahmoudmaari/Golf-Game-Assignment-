package maari.mahmoud.Golf_Game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Mathtest {
	
	@Test
	public void math() {
		int velocity = 56,angel = 45;
		double GRAVITY = 9.8;
		double result;
		 result = (int)Math.pow(velocity, 2) / GRAVITY * Math.sin(2*((Math.PI / 180) * (angel)));
		 double expected=320;
		 assertEquals(expected, result,0);
		
	}

}
