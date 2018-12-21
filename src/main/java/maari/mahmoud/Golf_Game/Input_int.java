package maari.mahmoud.Golf_Game;

import java.util.Scanner;

public class Input_int {
	 private static Scanner in = new Scanner (System.in);
		public static String getInput() {
	       	return in.nextLine();
	       
	       	}
		
	    public static int powerAndAngel() {
	       	boolean valid = false;
	       	int number = 0;
	       	while(!valid) {
	       		try {
	           		number = (int) Double.parseDouble(getInput());
	           		valid = true;
	           	}catch(NumberFormatException e) {
	           		System.out.println("You did not enter a valid number");
	           	}
	       	}
	       	return number;    	
	       }

}
