package maari.mahmoud.Golf_Game.messages;

public class PrintOtu {
	public static void printStringArray(int[] toPrint) {
		
		for(int i =0; i<toPrint.length; ++i) {
			System.out.print("try number "+(i+1)+": "+toPrint[i]);
		}
	}
}
