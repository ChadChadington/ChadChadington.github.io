import java.util.Scanner;

public class DictionaryOrder
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		
		System.out.print("Give me the name of a made-up programming language: ");
		name = keyboard.nextLine().toLowerCase(); //method 3 was applied
		
		/* nextLine is a special function call --> will read everything you type in, until you press enter
		//also strings inside Java are read as unicode values - Case sensitivity will occur
		Have to create a handling process for dealing with capital letters
		Handling Method options 
		1 - manually evaluate all combinations of different cap letter combinations / typed out
		2 - convert all entry letters to lowercase if (name.toLowerCase().compareTo("go" < 0 )
		3 - force to lowercase when user types it in
		name = keyboard.nextLine().toLowerCase(); //(preferred method)
		or name = name.toLowerCase(); //alters what the user actually types in  
		4 - another function name.compareToIgnoreCase
		*/
		
		if( name.compareTo("c++") < 0)
			System.out.println( name + " comes BEFORE c++" );
		if( name.compareTo("c++") == 0)
			System.out.println( "c++ isn't a made-up programming language!" );
		if( name.compareTo("c++") > 0)
			System.out.println( name + " comes AFTER c++" );	
	
		if( name.compareTo("java") < 0)
			System.out.println( name + " comes BEFORE java" );
		if( name.compareTo("java") == 0)
			System.out.println( "java isn't a made-up programming language!" );
		if( name.compareTo("java") > 0)
			System.out.println( name + " comes AFTER java" );
	
		if( name.compareTo("lisp") < 0)
			System.out.println( name + " comes BEFORE lisp" );
		if( name.compareTo("lisp") == 0)
			System.out.println( "lisp isn't a made-up programming language!" );
		if( name.compareTo("lisp") > 0)
			System.out.println( name + " comes AFTER lisp" );
	
		if( name.compareTo("python") < 0)
			System.out.println( name + " comes BEFORE python" );
		if( name.compareTo("python") == 0)
			System.out.println( "python isn't a made-up programming language!" );
		if( name.compareTo("python") > 0)
			System.out.println( name + " comes AFTER python" );
	
		if( name.compareTo("ruby") < 0)
			System.out.println( name + " comes BEFORE ruby" );
		if( name.compareTo("ruby") == 0)
			System.out.println( "ruby isn't a made-up programming language!" );
		if( name.compareTo("ruby") > 0)
			System.out.println( name + " comes AFTER ruby" );
		
		if( name.compareTo("visualbasic") < 0)
			System.out.println( name + " comes BEFORE visualbasic" );
		if( name.compareTo("visualbasic") == 0)
			System.out.println( "visualbasic isn't a made-up programming language!" );
		if( name.compareTo("visualbasic") > 0)
			System.out.println( name + " comes AFTER visualbasic" );	
	}
}
	