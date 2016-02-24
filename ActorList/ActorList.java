import java.util.Scanner;
//import java.io.File;
//import java.net.URL; 
import java.util.GregorianCalendar;

class Actor
{
	String name;
	String role;
	String birthdate;
}

public class ActorList
{
	public static void main(String[] args) throws Exception
	{
	
		//Read values from local file code
		Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
		
		//actors = new double[inFile.nextInt()];
		
		//Read values from URL code
		//String url = "http://learnjavathehardway.org/txt.s01e01-cast.txt";
		//Scanner inFile = new Scanner((new java.net.URL(url)).openStream()); //putting the fully qualified path name can be used instead of running an import line for URL

		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(GregorianCalendar.YEAR);

		while ( inFile.hasNext() ) //hasNext returns a boolean value "true" as long as there is something file that we haven't read yet, keep going until you reach the end of the file
		{
			Actor a = getActor(inFile);
			int birthYear = Integer.parseInt( a.birthdate.substring(0,4) );
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.print(" (" + (year-birthYear) + " years old)");
			System.out.println(" and played the role of " + a.role);
		}
		inFile.close();
	}
	
		public static Actor getActor( Scanner input ) {
		//Note that this is a custom function that is called earlier in the program
			Actor a = new Actor();
			a.name = input.nextLine(); //reads a whole line of text from the file as a string
			a.role = input.nextLine(); // "same as above"
			a.birthdate = input.nextLine(); //"same as above"
			
			return a; //returns the whole actor object to the while loop above
			//6 minutes 24 seconds
		}	
}