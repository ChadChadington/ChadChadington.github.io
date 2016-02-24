public class YachtDice
{
	public static void main( String[] args )
	{
		int roll1, roll2, roll3, roll4, roll5, roll6;
		boolean allTheSame;
		
		do
		{
			roll1 = 1 + (int)(Math.random()*6);
			roll2 = 1 + (int)(Math.random()*6);
			roll3 = 1 + (int)(Math.random()*6);
			roll4 = 1 + (int)(Math.random()*6);
			roll5 = 1 + (int)(Math.random()*6);
			roll6 = 1 + (int)(Math.random()*6);
			
			System.out.println("\nYou rolled: " + roll1 + " " + roll2 + " " + roll3 + " " + roll4 + " " + roll5 + " " + roll6 + " " );
			showDice(roll1); //roll1 serves as the actual parameter
			showDice(roll2);
			showDice(roll3);
			showDice(roll4);
			showDice(roll5);
			showDice(roll6);
			allTheSame = ( roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5 && roll5 == roll6 );
		} while (! allTheSame ); // or while ( allTheSame == false)
		System.out.println("The Yacht!!");
	}
	
	public static void showDice( int roll ) //formal parameter, roll serves as a nickname and provides the function a defined input parameter.
	{
		System.out.println("+---+");
		if ( roll == 1)
		{
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		}
		else if ( roll == 2 ) 
		{
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
		}	
		else if ( roll == 3 ) 
		{
			System.out.println("|o  |");
			System.out.println("| o |");
			System.out.println("|  o|");
		}
		else if ( roll == 4 ) 
		{
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
		}
		else if ( roll == 5 ) 
		{
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		}	
		else
		{
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	}
}		
			