import java.util.Scanner;

public class SecretWord
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String secret = "please", guess;
		
		System.out.print( "What's the secret word? ");
		guess = keyboard.next();
		
		//the following == operator does not work on strings, the following if will not work, only works with ints and doubles etc...
		if ( guess == secret )
		{
			System.out.println ( "Impossible. (This will never be printed.) " );
		}
		
		//this method does work with strings called "Dot Equals"
		if ( guess.equals(secret) ) 
		{
			System.out.println( "That's correct!" );
		}
		else
		{
			System.out.println( "Nope, the secret word is not \"" + guess + "\"." );
		}
	}
}	