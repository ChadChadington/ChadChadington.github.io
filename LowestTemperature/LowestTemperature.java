import java.io.File;
//if you were pulling from a URL
//import java.net.URL;
import java.util.Scanner;

public class LowestTemperature
{
	public static void main(String [] args) throws Exception
	{
		double[] temps;
		double lowest = 9999.99;
		double highest = -9999.99;
		
		//Read values from local file instead of URL
		Scanner fin = new Scanner(new File("avg-daily-temps-atx.txt"));
		temps = new double[fin.nextInt()];
		
		//if you were pulling from a URL
		//double[] temps  arrayFromUrl("http://xyz.com");
		
		System.out.println( temps.length + " temperatures in database.");
		
		for ( int i=0; i<temps.length; i++)
			temps[i] = fin.nextDouble();
		fin.close();
		
		for ( int i = 0; i<temps.length; i++ )
		{
			if ( temps[i] < lowest )
				lowest = temps[i];
			if ( temps[i] > highest )
				highest = temps[i];
		}
				
		System.out.print( "The lowest average daily temperature was " );
		System.out.println( lowest + "F (" + FtoC(lowest) + "C)" );
		System.out.print( "The highest average daily temperature was " );
		System.out.println( highest + "F (" + FtoC(highest) + "C)" );

	}
	
	public static double FtoC( double f) { 
		return (f-32)*5/9; 
	}
	//Associated function for arrayFromUrl
	/* public static double[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		
		double[] dubs = new double[count];
		
		for ( int i = 0; i<dubs.length; i++ )
			dubs[i] = fin.nextDouble();
		fin.close();
	} */
	
}