public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( char c='A'; c <= 'E'; c++ )
		{
			for ( int n = 1; n <= 3; n++ )
			{
				System.out.println( c + " " + n );
			}
		}
	
		System.out.println("\n");
	
		// this is #2 = I'll call it "AB"
		for ( int a=1; a <=3; a++ ) // 'a' can be called the outer loop control variable
		{
			for ( int b =1; b <= 3; b++ ) // 'b' can be called the inner loop control variable
			{
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * You will add a line of code here.
		}
	
		System.out.println("\n");
		
		System.out.println("Nested loops are reversed with a println for the second statement");
		
		//rendition 2 with the loops switched around
		for ( int n = 1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}
		}
		
		for ( int b =1; b <= 3; b++ )
		{
			for ( int a=1; a <=3; a++ )
			{
				System.out.print( "(" + a + "," + b + ") " );
			}
			System.out.println();
		}
		
	}
}