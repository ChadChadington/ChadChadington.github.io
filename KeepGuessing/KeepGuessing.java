import java.util.Scanner;

public class KeepGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(Math.random()*10);
		
		System.out.println( "I have chosen a number between 1 - 10. Try to guess it.");
		System.out.print( "Your guess: ");
		guess = keyboard.nextInt();
		
		while (secret != guess )
		{
			System.out.println( "That is incorrect. Guess again.");
			System.out.print( "Your guess: " );
			guess = keyboard.nextInt(); //keeping this here gets rid of the infinite loop
			
			//Do you have code in the body of your loop to let the loop to be come false, if not you likely have an infinite loop
			//hit Ctrl + c in terminal to exit the loop
		}
		
		System.out.println( "That's right! You're a good guesser." );
	}
}