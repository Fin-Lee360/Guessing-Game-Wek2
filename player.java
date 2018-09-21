package theGuessingGame;

public class player {
	int number = 0;
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}// END guess() Method

} //END Class
