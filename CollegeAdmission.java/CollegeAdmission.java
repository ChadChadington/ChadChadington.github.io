import java.util.Scanner;
import static java.lang.System.*;

public class CollegeAdmission
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int math;
		
		out.println( "Welcome to the UT Austin College Admissions Interface!" );
		out.print( "Please enter your SAT math score (200 - 800): ");
		math = keyboard.nextInt();
		
		out.print( "Admittance status: " );
		
		//sequence matters --> you need to start with the most difficult and end with the least difficult in an orderly way
		//does not break the chain of mutual exclusion if you keep the else ifs in place
		if ( math >= 790 )
			out.print( "CERTAIN " );
		else if (math >= 710 )
			out.print( "SAFE " );
		else if (math >= 580 )
			out.print( "PROBABLE ");
		else if (math >= 500 )
			out.print( "UNCERTAIN " );
		else if (math >= 390 )
			out.print( "UNLIKELY " );
		else // BELOW 390
			out.print( "DENIED " );
		
		out.println();
	}
}