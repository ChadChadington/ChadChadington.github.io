public class ThereAndBackAgain
{

	//java doesn't have functions it has methods --> you can define methods
	//order of the definition fo erebor doens't matter, 
	//main is run automatically everything else is only run if it is called
	//with the exception of run from main
	
	public static void main( String[] args )
	{
		System.out.println( "Here." );
		erebor(); //there parentheses have to be maintained or you get an error saying that this is not a statement
		System.out.println( "Back first time." );
		erebor(); 
		System.out.println( "Back second time." );
	}
	
	public static void erebor()
	{
		System.out.println( "There." );
	}
}