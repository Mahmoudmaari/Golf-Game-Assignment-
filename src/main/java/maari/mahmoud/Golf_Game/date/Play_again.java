package maari.mahmoud.Golf_Game.date;

public class Play_again {

	public static boolean playAgain(String answer) {
		String upperCaseString = answer.toUpperCase();
		switch(upperCaseString) {
		case "Y":
			return true;
		default:
			System.out.println("good bye");
			return false;
		}

	}
}	