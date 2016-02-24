import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		
		System.out.print("Give me a number, and I shall find the square root of it. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		
		//this while loop can be called an "input protection loop"
		while ( x < 0 )
		{
			System.out.print("Sorry, I won't take the square root of a negative. \nNew Number: ");
			x = keyboard.nextDouble();
		}
		
	/* alternate method 
		if ( x < 0 )
		{
			y = Math.sqrt( Math.abs(x) );
			System.out.print("The square root of "+x+" is "+y+"i");
		}
		else 
		{
			y = Math.sqrt(x);
			System.out.print("The square root of "+x+" is "+y+);
		}
	*/
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of "+x+" is "+y);
	}
}