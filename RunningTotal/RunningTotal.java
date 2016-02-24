import java.util.Scanner;

public class RunningTotal
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int current, total= 0, newtotal;
		
		System.out.print("Type in a  bunch of values and I'll add them up as long as the total is less than 20." );
		System.out.println("I'll stop when you type a zero." );
		
		/*
		while ( current != 0 )
		{
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;
			if ( current == 0)
				System.out.println("The total so far is: " + total);
		} 
		*/
		
		do
		{
			System.out.print("Value: ");
			current = keyboard.nextInt();
			newtotal = current + total;
			total = newtotal;
			System.out.println("The total so far is: " + total);
		} while ( newtotal < 20 );
		
		System.out.println("The final total is: " + total);
	
	}
}
		
		//Commented out area is an ineffective way of doing this
		/*
		
		int a, b, c, d, e, f, g, h, i, j, k, l;
		
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		d = keyboard.nextInt();
		e = keyboard.nextInt();
		f = keyboard.nextInt();
		g = keyboard.nextInt();
		i = keyboard.nextInt();
		j = keyboard.nextInt();
		k = keyboard.nextInt();
		l = keyboard.nextInt();
		
		total = a + b + c + d + e + f + g + h + i + j + k + l;
	
	*/ 
