public class RandomNumbers
{
	public static void main ( String[] args )
	{
		int a, b, c;
		double x, y, z;
		
		//Math.random can be 0, can never be 1 or greater than 1
		
			
		x = Math.random();
		y = Math.random();
		z = Math.random();
		
		System.out.println( "x is " + x );
		System.out.println( "y is " + y );
		System.out.println( "z is " + z );
		
		x = Math.random() * 100;
		y = Math.random() * 100;
		z = Math.random() * 100;
		
		System.out.println( "\nx is " + x );
		System.out.println( "y is " + y );
		System.out.println( "z is " + z );

/*		
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
*/	
		
		a = (int)x;
		b = (int)y;
		c = (int)z;
		
		System.out.println( "\na is " + a );
		System.out.println( "b is " + b );
		System.out.println( "c is " + c );

		x = 0.99999999999999999;
		a = (int)(x * 100);

		System.out.println( "\nx is " + x );
		System.out.println( "a is " + a);
		
		x = Math.random();
		a = 0 + (int)(x*10);
		b = 1 + (int)(x*10);
		c = 5 + (int)(x*10);
		
		System.out.println( "\na is " + a );
		System.out.println( "b is " + b );
		System.out.println( "c is " + c );	
	}
}
		