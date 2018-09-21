/*
 * Fingal Lee
 * 15-09-2018
 */

package theGuessingGame;

public class guessGame {
	
	//object variables
	player p1;
	player p2;
	player p3;
	
	public void startGame(){
		// assigning variables to objects
		p1 = new player();
		p2 = new player();
		p3 = new player();
		
		//holds player guess
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;
		
		//holds player results
		boolean P1right = false; 
		boolean P2right = false; 
		boolean P3right = false; 
		
		int targetNumber = (int) (Math.random() * 10); 
		System.out.println("I is thinking of a numba between 1 and 9 innit..");
		
		while(true)
		{
			System.out.println("Number to guess is " + targetNumber);
			
			//call each players guess() method
			p1.guess();
			p2.guess();
			p3.guess();
			
			// prints the automatically generated player guesses
			guessP1 = p1.number;
			System.out.println("Player one guessed " + guessP1);
			
			guessP2 = p2.number;
			System.out.println("Player two guessed " + guessP2);
			
			guessP3 = p3.number;
			System.out.println("Player three guessed " + guessP3);
			
			//Checks the players chosen number against the target number
			if(guessP1 == targetNumber){
				P1right = true; 
			}
			
			if(guessP2 == targetNumber){
				P2right = true; 
			}
			
			if(guessP3 == targetNumber){
				P3right = true; 
			}
			
			if(P1right || P2right || P3right){
				
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + P1right);
				System.out.println("Player two got it right? " + P2right);
				System.out.println("Player three got it right? " + P3right);
				System.out.println("Game is over.");
				break;//game over so break the loop 
			}
			else{
				// runs again as no-one got it right
				System.out.println("Plays will have to try again");
			}//END if/else
			
		}//END loop	
		
	}//END startGame() Method

}//END Class
