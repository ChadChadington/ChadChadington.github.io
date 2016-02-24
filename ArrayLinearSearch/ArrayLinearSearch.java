import java.util.Scanner;

public class ArrayLinearSearch
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] orderNumbers = { 12345, 54321, 78753, 101010, 8675309, 31415, 271828 };
		//above is a native array of integers
		int toFind; 
		
		System.out.println("There are " + orderNumbers.length + " orders in the database.");
		
		System.out.print("Orders: ");
		for ( int num : orderNumbers ) //int num needs to be initialized here.
		{
			System.out.print( num + " " );
		}
		System.out.println();
		
		System.out.print( "Which order to find? " );
		toFind = keyboard.nextInt();
		
		int x = 0; //check variable, this was self generated. 
		for ( int num : orderNumbers )
		{
			if ( num == toFind )
			{
				System.out.println( num + " found." );
				x = 1;
			}			
		}
		if (x == 0)
				System.out.println( toFind + " was not found." );
	}
} 