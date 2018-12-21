package maari.mahmoud.Golf_Game;

import java.util.Random;

public class Random_hole {
	public static int randomhole () {
    	Random rnd = new Random();
    	int mini = 950;
    	int max = 1000;
    	int rndnum =rnd.nextInt(max-mini)+mini;
    	System.out.println("the hole position is :"+rndnum+"m");
    	System.out.println("your position start from :0m");
    	return rndnum ;
   	 
        
    }

}
