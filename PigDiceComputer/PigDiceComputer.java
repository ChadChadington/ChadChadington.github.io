public class PigDiceComputer
{
	public static void main( String[] args )
	{
		int roll, total = 0;
		
		//go through this program and capture results between Roll and 
		//Total on multiple runs to see what the step through looks like
		//Pretend like you are the machine, to not overlook things 
		//Review the code to find the bug (if there is one)
		do 
		{
			roll = 1 + (int)(Math.random()*6); //this expression will pick a number between 1 and 6
			System.out.println( "Computer rolled a " + roll + ".");
			if ( roll == 1 )
			{
				System.out.println( "\tThat ends its turn." );
				total = 0;
			}
			else
			{
				total += roll;
				System.out.print( "\tComputer has " + total + " points so far this round.\n");
				if ( total < 20 )
				{
					System.out.println( "\tComputer chooses to roll again." );
				}
			}
		} while ( roll != 1 && total < 20 );
		
		System.out.println( "Computer ends the round with " + total + " points.");
	}
}