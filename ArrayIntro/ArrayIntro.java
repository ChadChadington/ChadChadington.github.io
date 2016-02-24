public class ArrayIntro
{
	public static void main( String[] args ) //notice that main has an array of strings passed on as a parameter
	{
		// String [] sets an array of strings
		
		String[] planets =  { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		//String name a, p, b etc is irrelevant as long as it is consistent
		
		for ( String a : planets ) //for each String a in planets | a get the first value stored in the array, then the second...and so on
		{
			System.out.println( a + "\t" + a.toUpperCase() );
		}
	}
}

//Scratch program | demonstrates the introduction of an empty array, but if the user types java Scratch alpha bravo charlie in the Terminal window the array will have contents, you can also input a file that holds strings

/* 	public class Scratch
	{
		public static void main( String[] args )
		{
			for ( String s : args )
				System.out.println(s);
		}
	}
*/