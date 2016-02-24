import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher
{
	/**
	* Returns the character shifted by the given number of the letters.
	*/
	
	public static char shiftLetter( char c, int n)
	{
		int ch = c;
		
		if ( ! Character.isLetter(c) )
			return c;
		
		ch = ch + n;
		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
			ch -= 26;
		if ( Character.isUpperCase(c) && ch > 'A' || Character.isLowerCase(c) && ch < 'a' )
			ch += 26;
		//single quotes are for character literals
			
		return (char)ch;	
	}
	
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String plaintext, cipher = "";
		int shift;
		
		Scanner fileIn = new Scanner(new File("cipher-in.txt"));
		plaintext = fileIn.nextLine();
		shift = fileIn.nextInt();
		fileIn.close();
		
		System.out.println("Encrypting message: " + plaintext);
		System.out.println("Using shift: " + shift);
		
		//System.out.print("Message: ");
		//plaintext = keyboard.nextLine();
		//System.out.print("Shift (0-26): ");
		//shift = keyboard.nextInt();
		
		for (int i = 0; i<plaintext.length(); i++ ) 
		{
			cipher += shiftLetter( plaintext.charAt(i), shift );
		}
		//store the ciphertext into a file
		PrintWriter owt = new PrintWriter("cipher-out.txt");
		owt.println( cipher );
		owt.close();
		
		//System.out.println ( cipher );
	}


}