import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

class LoopBoolean2 {
    public static void main(String[] args) {

    	// Initiralize the variables for the while loop
    	boolean rolls = false;
    	String PlayerAnswer = "";

    	// Initialize the dice
    	final int DIE1_SIDES = 12;
    	Die die1 = new Die(DIE1_SIDES);
    	final int DIE2_SIDES = 12;
    	Die die2 = new Die(DIE1_SIDES);

    	// Initialize the scores
    	int PLAYER_VALUE   = 0;
    	int COMPUTER_VALUE = 0;

    	// Create a Scanner object for keyboard input.
       	Scanner keyboard = new Scanner(System.in);

      	// Ask the player a question
        System.out.println("Let's play a game of 21. You win the game if you get to closest to 21 without going over.");
      	System.out.println("Do you want to roll the dice? (y/n)");
      	PlayerAnswer = keyboard.next();

      	// If player says yes, set the rolls variable to true
		if (PlayerAnswer.equals ("y")) rolls = true;

while (rolls == true && PLAYER_VALUE <= 21)
{
   	// Roll the dice
	die1.roll();
	die2.roll();

	// Display the current roll
	System.out.println("Your roll was: " + die1.getValue() );
	System.out.println("The computer's roll was: " + die2.getValue() );
	System.out.println("***");
	
	// Increment PLAYER_VALUE and COMPUTER_VALUE
	PLAYER_VALUE = PLAYER_VALUE + die1.getValue();
	COMPUTER_VALUE = COMPUTER_VALUE + die2.getValue();

	// Display player's current score
	System.out.println("Your score is: " + PLAYER_VALUE );
	System.out.println("The computer's score is: " + COMPUTER_VALUE );
  	
  	// Ask the player a question
  	System.out.println("Do you want to roll the dice? (y/n)");
  	PlayerAnswer = keyboard.next();

    // If player says no, set the rolls variable to FALSE. This is an important difference.
    // if (PlayerAnswer.equals ("n") && rolls == false) // this code doesn't work?
    if (PlayerAnswer.equals ("n")) rolls = false;
  
	// If PLAYER_SCORE is over 21, we end the game!
    if (PLAYER_VALUE > 21)
    {
        rolls = false;
        System.out.println("Your score is " + PLAYER_VALUE + ". You went over 21. Game over!");
    }

// end of while loop
}



    }
}