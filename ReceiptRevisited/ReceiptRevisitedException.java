import java.io.PrintWriter;
import java.io.IOException;

public class ReceiptRevisitedException
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		
		try
		{
			fileout = new PrintWriter("receipt1.txt");
		}
		catch ( IOException err )
		{
			System.out.println("Sorry, I can't write to the file 'receipt.txt'. ");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}
		
		fileout.println( "+------------------------+" );
		fileout.println( "|                        |" );
		fileout.println( "|      CORNER STORE      |" );
		fileout.println( "|                        |" );
		fileout.println( "|  2016-01-26 11:22 AM   |" );            
		fileout.println( "|                        |" );
		fileout.println( "| Gallons:      12.464   |" );
		fileout.println( "| Price/gallon: $ 3.459  |" );
		fileout.println( "|                        |" );
		fileout.println( "| Fuel total:   $ 43.11  |" );
		fileout.println( "|                        |" );
		fileout.println( "+------------------------+" );
		fileout.close();
	}
}