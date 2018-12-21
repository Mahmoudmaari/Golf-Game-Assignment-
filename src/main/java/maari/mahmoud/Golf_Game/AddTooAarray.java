package maari.mahmoud.Golf_Game;

import java.util.Arrays;

public class AddTooAarray {
	public static int[] addToArray(int[] position, double toAdd) {
		boolean isAdded = false;
		
		for(int i = 0; i<position.length; i++) {
			if(position[i] == 0 ) {
				position[i] = (int) toAdd;
				isAdded = true;
				break;
			}			
		}
		
		if(isAdded == false) {
			position = expandArray(position);
			position[position.length-1] = (int) toAdd;
		}
		return position;		
	}

	public static String[] expandArray(String[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}
	public static double[] expandArray(double[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}
	public static int[] expandArray(int[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}

}
