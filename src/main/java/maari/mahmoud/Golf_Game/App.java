package maari.mahmoud.Golf_Game;



public class App {

    public static void main( String[] args )
    {
    	
        int dectenc = 1000,hole=0,tries =1 ;
        int velocity=0;
		int angle=0;
        double GRAVITY = 9.8;
    	int[] position = new int [0];
    	boolean win=false,run=true,over=false;
    	while(run) {
    		
			do {
    	if (tries==1) {
    		hole=Random_hole.randomhole();
    		
    	}
    	
    	
    		
    	 
		
      position = (AddTooAarray.addToArray(position, (int) (Math.pow(Algorithms.Velocity_input(velocity), 2) / GRAVITY * Math.sin(2 * ((Math.PI / 180) * (Algorithms.Angle_input(angle)))))));
     
      
      
    	if(over==true) {
    		position[tries-1]*=-1;
    	}
    	 
    	
    	System.out.println("your shot :"+position[tries-1]+"m");
    	win = goal.niec_shot(Arrayplus.plus_array(position), hole);
    	System.out.println(ResultMessage.Answer(Arrayplus.plus_array(position), hole));
    	
    	tries++;
    	if(Arrayplus.plus_array(position)< hole) {
    		over=false;
    		System.out.println("the hole dectenc from your position"+hole+"m");
    	}
    	else if (Arrayplus.plus_array(position) > hole) {
    		over=true;
    		 System.out.println("the hole dectenc from your position"+hole+"m");
    		System.out.println("you are in " + Arrayplus.plus_array(position) +"the hole in :" + hole);
    		
    	}
    	 
        if (Arrayplus.plus_array(position)>dectenc) {
  		position = new int [0];
  System.out.println("game over");		
  			win=true;
  	} 
        if ( angle >=90 ) {
  		
  		position = new int [0];
  		
  		System.out.println("the angle can't be 0 or more than 89"); 
			
  		 win=true;  
  	}
        
    		
    	System.out.println("your new position:"+"   "+Arrayplus.plus_array(position)+"m"+"   "+"your tries"+":");
		
    	PrintOtu.printStringArray(position);
    	System.out.println();
    	
    		} while(!win && tries<=5 ); 
    			angle=0;
    			dectenc = 1000;
    			hole=0;
    			velocity=0;
    			tries =1 ;
    	        GRAVITY = 9.8;
    	        position=new int [0];
    	        
    	        System.out.println("do you want to play again? (Y/N)");
    			String answer =Input_int.getInput();
    			run = Play_again.playAgain(answer);
    			
    		

    	
    	
    
     

 
 }
    	
 
        
}   
    
}

